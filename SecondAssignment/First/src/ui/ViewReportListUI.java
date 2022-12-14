package ui;
import manage.*;

public class ViewReportListUI extends UI{
	public void showReportList() {
		System.out.println("showReportList()");
		ManageReport mr = new ManageReport();
		mr.requestReportList();
	}
}
