package ui;
import java.io.IOException;

import manage.*;

public class ViewReportUI extends ReportUI{
	public void showReport(String date) throws IOException {
		System.out.println("showReport()");
		ManageReport mr = new ManageReport();
		mr.requestReport(date);
	}
}
