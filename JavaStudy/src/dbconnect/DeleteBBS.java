package dbconnect;

// Oracle SQL 에서 delete 하는 방법
public class DeleteBBS {
	public void deleteBBS(int articleNum) {
		BBSDaoImpl.getDBObject().deleteBBS(articleNum);
	}
	
	public static void main(String[] args) {
		DeleteBBS db = new DeleteBBS();
		db.deleteBBS(43);
		
	}
}
