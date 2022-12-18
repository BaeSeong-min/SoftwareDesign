package ui;
import java.io.IOException;

import manage.*;

public class ViewNoticeListUI extends UI{
	public void showNoticeList() throws IOException {
		System.out.println("showNoticeList()");
		ManageNotice mn = new ManageNotice();
		mn.requestNoticeList();
	}
}
