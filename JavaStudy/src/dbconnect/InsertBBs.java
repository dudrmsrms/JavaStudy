package dbconnect;

import java.util.ArrayList;

public class InsertBBs {
	
	public void InsertBBS() {
		BBSDto article= new BBSDto();
		int i=0;
		while(i<10) {
			article=new BBSDto();
			article.setId("Not human");
			article.setTitle("Not �װ�");
			article.setContent("�ָ����ΤФФФ�");
			i++;
		}
		BBSDaoImpl.getDBObject().insertBBS(article);
		//1���� ��� �Ʒ��� BBSALl ���� 10���� ���
		
	}
	
	public void InsertBBSAll() {
		ArrayList<BBSDto> articleList = new ArrayList<BBSDto>();
		BBSDto article ;
		int i=0;
		while(i<10) {
			article=new BBSDto();
			article.setId("Not human");
			article.setTitle("Not �װ�");
			article.setContent("�ָ����ΤФФФ�");
			articleList.add(article);
			i++;
		}
		//BBSDaoImpl.getDBObject().insertBBS(articleList); 1���� ��� �Ʒ��� BBSALl ���� 10���� ���
		BBSDaoImpl.getDBObject().insertBBSAll(articleList);
	}
	public static void main(String[] args) {
		InsertBBs ib= new InsertBBs();
//		ib.InsertBBS();
		ib.InsertBBSAll();
		
	}

}
