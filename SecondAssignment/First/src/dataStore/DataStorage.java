package dataStore;
import java.util.*;
import ui.*;

public class DataStorage {
	private ArrayList<SignUpPrincipalUI> account = new ArrayList<SignUpPrincipalUI>();
	private ArrayList<SignUpUI> accountForNormal = new ArrayList<SignUpUI>();
	private ArrayList<NoticeUI> noticeInfo = new ArrayList<NoticeUI>();
	private ArrayList<ReportUI> reportInfo = new ArrayList<ReportUI>();
	private ArrayList<ScheduleUI> scheduleInfo = new ArrayList<ScheduleUI>();
	private ArrayList<AttendanceUI> attendanceInfo = new ArrayList<AttendanceUI>();
	private ArrayList<SignUpUI> admissionWaiterInfo = new ArrayList<SignUpUI>();
	private ArrayList<String> classInfo = new ArrayList<String>();
	private ArrayList<String> kinderInfo = new ArrayList<String>();

	public void insertAccount(SignUpPrincipalUI newAccount) {
		System.out.println("insertAccount()");
		account.add(newAccount);
	}
	
	public void insertAccountForNormal(SignUpUI newAccount) {
		System.out.println("insertAccountForNormal()");
		accountForNormal.add(newAccount);
		insertRequestion(newAccount);
	}
	
	public void insertRequestion(SignUpUI newAccount) {
		System.out.println("insertRequestion()");
		admissionWaiterInfo.add(newAccount);
	}
	
	public void insertKindergarten(String kindergartenName) {
		System.out.println("insertKindergarten()");
		kinderInfo.add(kindergartenName);
	}
	
	public void insertClass(String className) {
		System.out.println("insertClass()");
		classInfo.add(className);
	}
	
	public void insertReport(ReportUI report) {
		System.out.println("insertReport()");
		reportInfo.add(report);
	}
	
	public void insertNotice(NoticeUI notice) {
		System.out.println("insertReport()");
		noticeInfo.add(notice);
	}
	
	public void insertAttendance(AttendanceUI attendance) {
		System.out.println("insertAttendance()");
		attendanceInfo.add(attendance);
	}
	
	public void insertSchedule(ScheduleUI schedule) {
		System.out.println("insertSchedule()");
		scheduleInfo.add(schedule);
	}
	
	public int checkExist(String id, String ps) {
		System.out.println("checkExist()");
		for(int i = 0; i < account.size(); i++) {
			if((account.get(i).getId().equals(id) && account.get(i).getPs().equals(ps)) || (accountForNormal.get(i).getId().equals(id) && accountForNormal.get(i).getPs().equals(ps))) {
				System.out.println("login success");
				return 1;
			}
			else {
				System.out.println("id or password is invalid");
				return 0;
			}
		}
		return 1;
	}
	
	public void approve(String name) {
		System.out.println("approve()");
		for(int i = 0; i < admissionWaiterInfo.size(); i++) {
			if(name.equals(admissionWaiterInfo.get(i).getName())){
				admissionWaiterInfo.remove(i);
			}
		}
	}
	
	public void select(String list) {
		System.out.println("select()");
	}
	
}
