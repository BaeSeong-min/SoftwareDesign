package manage;
import ui.*;
import dataStore.*;
import java.io.*;

public class ManageReport{
	public void reportInsert(ReportUI report) throws FileNotFoundException {
		System.out.println("reportInsert()");
		DataStorage db = new DataStorage();
		db.insertReport(report);
	}
	
	public void requestReportList() throws IOException {
		System.out.println("requestReportList()");
		DataStorage db = new DataStorage();
		db.select(null, "reportList");
	}
	
	public void requestReport(String date) throws IOException {
		System.out.println("requestReport()");
		DataStorage db = new DataStorage();
		db.select(date, "report");
	}
}
