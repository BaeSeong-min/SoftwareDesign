package ui;
import java.io.IOException;

import manage.*;
public class ViewNoticeUI extends NoticeUI{
	public void showNotice(String num) throws IOException {
		System.out.println("showNotice()");
		ManageNotice mn = new ManageNotice();
		mn.requestNotice(num);
	}
}
