package ui;
import java.io.FileNotFoundException;

import manage.*;

public class WritingReportUI extends ReportUI{
	public void sendReport(ReportUI report) throws FileNotFoundException {
		System.out.println("sendReport()");
		ManageReport mr = new ManageReport();
		mr.reportInsert(report);
	}
}
