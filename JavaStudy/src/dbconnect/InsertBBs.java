package dbconnect;

import java.util.ArrayList;

public class InsertBBs {
	
	public void InsertBBS() {
		BBSDto article= new BBSDto();
		int i=0;
		while(i<10) {
			article=new BBSDto();
			article.setId("Not human");
			article.setTitle("Not 닝겐");
			article.setContent("주말공부ㅠㅠㅠㅠ");
			i++;
		}
		BBSDaoImpl.getDBObject().insertBBS(article);
		//1개씩 출력 아래는 BBSALl 문은 10개씩 출력
		
	}
	
	public void InsertBBSAll() {
		ArrayList<BBSDto> articleList = new ArrayList<BBSDto>();
		BBSDto article ;
		int i=0;
		while(i<10) {
			article=new BBSDto();
			article.setId("Not human");
			article.setTitle("Not 닝겐");
			article.setContent("주말공부ㅠㅠㅠㅠ");
			articleList.add(article);
			i++;
		}
		//BBSDaoImpl.getDBObject().insertBBS(articleList); 1개씩 출력 아래는 BBSALl 문은 10개씩 출력
		BBSDaoImpl.getDBObject().insertBBSAll(articleList);
	}
	public static void main(String[] args) {
		InsertBBs ib= new InsertBBs();
//		ib.InsertBBS();
		ib.InsertBBSAll();
		
	}

}
