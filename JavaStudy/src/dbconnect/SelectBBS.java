package dbconnect;

import java.util.ArrayList;

public class SelectBBS {
	public void SelectBBS(int articleNum) {
		BBSDaoImpl.getDBObject().selectBBS(articleNum);
	}
	public static void main(String[] args) {
		SelectBBS sb = new SelectBBS();
		sb.SelectBBS(43);
	}

}
