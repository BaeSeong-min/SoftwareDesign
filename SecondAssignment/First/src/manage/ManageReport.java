package manage;
import ui.*;
import dataStore.*;

public class ManageReport {
	public void reportInsert(ReportUI report) {
		System.out.println("reportInsert()");
		DataStorage db = new DataStorage();
		db.insertReport(report);
	}
	
	public void requestReportList() {
		System.out.println("requestReportList()");
		DataStorage db = new DataStorage();
		db.select(null);
	}
	
	public void requestReport(String date) {
		System.out.println("requestReport()");
		DataStorage db = new DataStorage();
		db.select(date);
	}
}
