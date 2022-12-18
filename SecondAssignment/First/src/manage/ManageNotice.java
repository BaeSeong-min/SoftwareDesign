package manage;
import java.io.FileNotFoundException;
import java.io.IOException;

import dataStore.*;
import ui.*;

public class ManageNotice {
	public void noticeInsert(NoticeUI notice) throws FileNotFoundException {
		System.out.println("noticeInsert()");
		DataStorage db = new DataStorage();
		db.insertNotice(notice);
	}
	
	public void requestNoticeList() throws IOException {
		System.out.println("requestNoticeList()");
		DataStorage db = new DataStorage();
		db.select(null, "noticeList");
	}
	
	public void requestNotice(String num) throws IOException {
		System.out.println("requestNotice()");
		DataStorage db = new DataStorage();
		db.select(num, "notice");
	}
}
