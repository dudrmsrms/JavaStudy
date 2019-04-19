package dbconnect;

public class UpdateBBS {
	
	public void UpdateBBS(int articleNum) {
		BBSDaoImpl.getDBObject().updateBBS(articleNum);
	}
	
	public static void main(String[] args) {
		UpdateBBS ub = new UpdateBBS();
		ub.UpdateBBS(39);
		
	}

}

