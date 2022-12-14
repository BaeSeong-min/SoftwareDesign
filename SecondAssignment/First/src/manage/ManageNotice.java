package manage;
import dataStore.*;
import ui.*;

public class ManageNotice {
	public void noticeInsert(NoticeUI notice) {
		System.out.println("noticeInsert()");
		DataStorage db = new DataStorage();
		db.insertNotice(notice);
	}
	
	public void requestNoticeList() {
		System.out.println("requestNoticeList()");
		DataStorage db = new DataStorage();
		db.select(null);
	}
	
	public void requestNotice(String num) {
		System.out.println("requestNotice()");
		DataStorage db = new DataStorage();
		db.select(num);
	}
}
