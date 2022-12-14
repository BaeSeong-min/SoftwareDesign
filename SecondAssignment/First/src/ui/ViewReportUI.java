package ui;
import manage.*;

public class ViewReportUI extends ReportUI{
	public void showReport(String date) {
		System.out.println("showReport()");
		ManageReport mr = new ManageReport();
		mr.requestReport(date);
	}
}
