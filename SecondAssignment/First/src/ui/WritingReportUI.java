package ui;
import manage.*;

public class WritingReportUI extends ReportUI{
	public void sendReport(ReportUI report) {
		System.out.println("sendReport()");
		ManageReport mr = new ManageReport();
		mr.reportInsert(report);
	}
}
