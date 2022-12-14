package ui;
import manage.*;

public class WritingNoticeUI extends NoticeUI{
	public void sendNotice(WritingNoticeUI notice) {
		System.out.println("sendNotice()");
		ManageNotice mn = new ManageNotice();
		mn.noticeInsert(notice);
	}
}
