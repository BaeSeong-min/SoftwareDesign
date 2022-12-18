package ui;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import manage.*;

public class WritingReportUI extends ReportUI{
	private ArrayList<String>status = new ArrayList<String>();
	public void sendReport(ReportUI report) throws FileNotFoundException {
		System.out.println("sendReport()");
		ManageReport mr = new ManageReport();
		mr.reportInsert(report);
	}
	/*
	public ArrayList<String> getStatus() {
		return status;
	}
	public void setStatus(ArrayList<String> status) {
		this.status = status;
	}*/
}
