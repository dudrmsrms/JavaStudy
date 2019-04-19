package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnSingleTon {
	private static DBconnSingleTon dbst = new DBconnSingleTon();

	private DBconnSingleTon() {

	}

	public static DBconnSingleTon getDBConn() {
		if (dbst == null) {
			dbst = new DBconnSingleTon();
		}
		return dbst;
	}

	public Connection getConnection() {
		Connection conn=null;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		conn = DriverManager.getConnection(url, "hr", "1234");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
