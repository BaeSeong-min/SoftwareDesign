package ui;
import java.util.*;

public class ReportUI extends UI{
	private String reportDate;
	private String reportContent;
	private String reportReceiver;
	private ArrayList<String> reportKidStatus = new ArrayList<String>();
	
	public String getReportDate() {
		return reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}
	public String getReportContent() {
		return reportContent;
	}
	public void setReportContent(String reportContent) {
		this.reportContent = reportContent;
	}
	public String getReportReceiver() {
		return reportReceiver;
	}
	public void setReportReceiver(String reportReceiver) {
		this.reportReceiver = reportReceiver;
	}
	public ArrayList<String> getReportKidStatus() {
		return reportKidStatus;
	}
	public void setReportKidStatus(ArrayList<String> reportKidStatus) {
		this.reportKidStatus = reportKidStatus;
	}
}
