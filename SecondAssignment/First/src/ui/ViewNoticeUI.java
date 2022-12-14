package ui;
import manage.*;
public class ViewNoticeUI extends NoticeUI{
	public void showNotice(String num) {
		System.out.println("showNotice()");
		ManageNotice mn = new ManageNotice();
		mn.requestNotice(num);
	}
}
