package ui;
import java.io.FileNotFoundException;

import manage.*;

public class WritingNoticeUI extends NoticeUI{
	public void sendNotice(WritingNoticeUI notice) throws FileNotFoundException {
		System.out.println("sendNotice()");
		ManageNotice mn = new ManageNotice();
		mn.noticeInsert(notice);
	}
}
