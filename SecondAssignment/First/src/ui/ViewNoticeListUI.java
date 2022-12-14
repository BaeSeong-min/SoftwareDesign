package ui;
import manage.*;

public class ViewNoticeListUI extends UI{
	public void showNoticeList() {
		System.out.println("showNoticeList()");
		ManageNotice mn = new ManageNotice();
		mn.requestNoticeList();
	}
}
