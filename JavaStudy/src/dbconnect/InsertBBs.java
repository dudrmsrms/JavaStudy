package dbconnect;

import java.util.ArrayList;

public class InsertBBs {
	
	public void InsertBBS() {
		BBSDto article= new BBSDto();
		int i=0;
		while(i<10) {
			article=new BBSDto();
			article.setId("Not human");
			article.setTitle("Not 閑意");
			article.setContent("爽源因採ばばばば");
			i++;
		}
		BBSDaoImpl.getDBObject().insertBBS(article);
		//1鯵梢 窒径 焼掘澗 BBSALl 庚精 10鯵梢 窒径
		
	}
	
	public void InsertBBSAll() {
		ArrayList<BBSDto> articleList = new ArrayList<BBSDto>();
		BBSDto article ;
		int i=0;
		while(i<10) {
			article=new BBSDto();
			article.setId("Not human");
			article.setTitle("Not 閑意");
			article.setContent("爽源因採ばばばば");
			articleList.add(article);
			i++;
		}
		//BBSDaoImpl.getDBObject().insertBBS(articleList); 1鯵梢 窒径 焼掘澗 BBSALl 庚精 10鯵梢 窒径
		BBSDaoImpl.getDBObject().insertBBSAll(articleList);
	}
	public static void main(String[] args) {
		InsertBBs ib= new InsertBBs();
//		ib.InsertBBS();
		ib.InsertBBSAll();
		
	}

}
