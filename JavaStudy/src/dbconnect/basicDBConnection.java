package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import oracle.jdbc.driver.OracleDriver;

public class basicDBConnection {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public void connect() throws Exception{
//		- ����Ŭ ���� ���
//		1. ����Ŭ ����̹� �ε�(Class.forName()���)
//		2. DriverManager�� getConnection() �̿��Ͽ� db����
//		3. Connection�� prepareStatement()�� �̿��Ͽ� 
//		   �������� �ɰ�  PreparedStatement ���� ����
//		4. PreparedStatement�� �̿��Ͽ� ��������
//		5. ������ ������ �ΰ����� ����
//		  a. select�� : executeQuery() 
//		  b. insert, delete,update �� : executeUpdate()
//		6. 5���� ��쿡��  a�� ResultSet�� ���� ����, 
//		   b�� ������ ���Ϲ���
//		7. select���� ������ ���������� ResultSet�� �̿��Ͽ�
//		   ���� ���� ���� �о����	
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";		
		conn=DriverManager.getConnection(url, "hr", "1234");
		
		StringBuilder query= new StringBuilder();
		query.append("SELECT FIRST_NAME, SALARY,DEPARTMENT_ID ");
		query.append("FROM EMPLOYEES ");		
		
		pstmt=conn.prepareStatement(query.toString());
		rs=pstmt.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getString("FIRST_NAME")+ " ");
			System.out.print(rs.getInt("SALARY")+ " ");
			System.out.println(rs.getInt("DEPARTMENT_ID"));			
		}
		
		rs.close();
		pstmt.close();
		conn.close();		
	}

	public static void main(String[] args) throws Exception{
		basicDBConnection dbc = new basicDBConnection();
		dbc.connect();

	}

}
