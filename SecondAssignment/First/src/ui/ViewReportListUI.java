package ui;
import java.io.IOException;

import manage.*;

public class ViewReportListUI extends UI{
	public void showReportList() throws IOException {
		System.out.println("showReportList()");
		ManageReport mr = new ManageReport();
		mr.requestReportList();
	}
}
