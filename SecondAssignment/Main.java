import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// user input

	}
	
	public class Report{
		private String reportDate;
		private String reportContent;
		private String reportReceiver;
		private File reportAttachedFile;
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
		
		public File getReportAttachedFile() {
			return reportAttachedFile;
		}
		public void setReportAttachedFile(File reportAttachedFile) {
			this.reportAttachedFile = reportAttachedFile;
		}
		
		public ArrayList<String> getReportKidStatus() {
			return reportKidStatus;
		}
		public void setReportKidStatus(ArrayList<String> reportKidStatus) {
			this.reportKidStatus = reportKidStatus;
		}
		
		public void doExitReport() {
			// Exit report
		}
	}
	
	public class File{
		private String fileName;
		private String fileType;
		private int fileSize;
	}
	
	public class AfterLoginStatusControl{
		private String searchDate;
		private LogoutManagement logout;
		
		public void makeReport() {
			// make a report
		}
		
		public void checkReportList(String date) {
			// check report list
		}
		
		public void checkReport(Report report) {
			// check report
		}
		
		public void makeNotice(){
			// make a notice
		}
		
		public void checkNoticeList(String date) {
			// check notice list
		}
		
		public void checkNotice(Notice notice) {
			//check a notice
		}
		
		public void makeAttendance() {
			// make an attendance
		}
		
		public void makeSchedule() {
			// make a schedule
		}
	}
	
	public class LogoutManagement{
		public void checkAccount(String id, String passWord) {
			// check an account
		}
		
		public void logout() {
			// logout
		}
	}
	
	public class ReportManagement{
		private int nReport;
		//private ManageDB manageDB;
		
		public void requestReportInsert(Report report) {
			// request to insert a report into DB
		}
		
		public void printReportList(ArrayList<Report> reportList) {
			// print report list
		}
	}
	
	public class ClassManagement{
		//private ManageDB manageDB; 이용해서 데이터 불러옴.
		
		public void checkKidsList(String className) {
			// check kids List
		}
		
		public void checkClassList() {
			// check class list
		}
		
		public void printClassName() {
			// print class name
		}
		
		public void printKids(String className) {
			// print Kids
		}	
	}
	
	public class Notice{
		private String noticeDate;
		private String noticeTitle;
		private String noticeContent;
		private String noticeReceiver;
		private File noticeAttachedFile;
		
		public String getNoticeDate() {
			return noticeDate;
		}
		
		public void setNoticeDate(String noticeDate) {
			this.noticeDate = noticeDate;
		}
		
		public String getNoticeTitle() {
			return noticeTitle;
		}
		
		public void setNoticeTitle(String noticeTitle) {
			this.noticeTitle = noticeTitle;
		}

		public String getNoticeContent() {
			return noticeContent;
		}

		public void setNoticeContent(String noticeContent) {
			this.noticeContent = noticeContent;
		}

		public String getNoticeReceiver() {
			return noticeReceiver;
		}

		public void setNoticeReceiver(String noticeReceiver) {
			this.noticeReceiver = noticeReceiver;
		}

		public File getNoticeAttachedFile() {
			return noticeAttachedFile;
		}

		public void setNoticeAttachedFile(File noticeAttachedFile) {
			this.noticeAttachedFile = noticeAttachedFile;
		}
		
		public void doExitNotice() {
			// exit notice
		}
	}
	
	public class NoticeManagement{
		private int nNotice;
		//private ManageDB manageDB;
		
		public void requestNoticeInsert(Notice notice) {
			// request to insert a notice into DB
		}
		
		public void printNoticeList(String date) {
			// print notice list
		}
	}
	
	public class ManageDB{
		public ArrayList<Report> findReportList(String date){
			// find report list
			return new ArrayList<Report>();
		}
		
		public ArrayList<Notice> findNoticeList(String date){
			// find notice list
			return new ArrayList<Notice>();
		}
		
	}
	
	public class AttendanceManagement{
		private int nAttendance;
		private ManageDB manageDB;
		
		public void requestAttendanceInser() {
			// request to insert an attendance
		}
		
		public void checkClassAttendance(String className, String date) {
			// check class attendance
		}
	}
	
	public class AdmissionManagement{
		private ManageDB manageDB;
		
		public void requestAdmissionList() {
			// request admission waiting list
		}
		
		public void printAdmissionRequestList() {
			// print admission request list
		}
		
		public void permitAdmission(Account account) {
			// permit admission (inserToKindergarten)
		}
		
		public void refuseAdmission(Account account) {
			// refuse admission
		}
	}
	
	public class Attendance{
		private String attendanceDate;
		private ArrayList<String> attendanceStatus = new ArrayList<String>();
	
		public String getAttendanceDate() {
			return attendanceDate;
		}
		
		public void setAttendanceDate(String attendanceDate) {
			this.attendanceDate = attendanceDate;
		}

		public ArrayList<String> getAttendanceStatus() {
			return attendanceStatus;
		}

		public void setAttendanceStatus(ArrayList<String> attendanceStatus) {
			this.attendanceStatus = attendanceStatus;
		}
		
		public void doExitAttendance() {
			// exit attendance
		}
	}
	
	public class Schedule{
		private String scheduleDate;
		private String scheduleTitle;
		private String scheduleReceiver;
		private String scheduleContent;
		
		public String getScheduleDate() {
			return scheduleDate;
		}
		
		public void setScheduleDate(String scheduleDate) {
			this.scheduleDate = scheduleDate;
		}
		
		public String getScheduleTitle() {
			return scheduleTitle;
		}
		
		public void setScheduleTitle(String scheduleTitle) {
			this.scheduleTitle = scheduleTitle;
		}

		public String getScheduleReceiver() {
			return scheduleReceiver;
		}

		public void setScheduleReceiver(String scheduleReceiver) {
			this.scheduleReceiver = scheduleReceiver;
		}

		public String getScheduleContent() {
			return scheduleContent;
		}

		public void setScheduleContent(String scheduleContent) {
			this.scheduleContent = scheduleContent;
		}
	}
	
	public class ScheduleManagement{
		private int nSchedule;
		private ManageDB manageDB;
		
		public void requestScheduleInsert(Schedule schedule) {
			// request to insert a schedule
		}
		
		public void checkScheduleList(String className, String date) {
			// check schedule list
		}
		
		public void checkSchedule(String title) {
			// check schedule
		}
	}
	
	public class LoginManagement{
		private ManageDB manageDB;
		
		public void checkAccount(String id, String passWord) {
			// check account
		}
		
		public void login() {
			// log-in
		}
	}
	
	public class BeforeLoginStatusControl{
		private SignUpManagement signUp;
		private LoginManagement logIn;
	}
	
	public class Kindergarten{
		private String kindergartenName;
		private ArrayList<ClassInformation> kindergartenClass = new ArrayList<ClassInformation>();

		public String getKindergartenName() {
			return kindergartenName;
		}

		public void setKindergartenName(String kindergartenName) {
			this.kindergartenName = kindergartenName;
		}
		
		public ArrayList<ClassInformation> getKindergartenClass() {
			return kindergartenClass;
		}

		public void setKindergartenClass(ArrayList<ClassInformation> kindergartenClass) {
			this.kindergartenClass = kindergartenClass;
		}
	}
	
	public class ClassInformation{
		private String className;
		private String classTeacher;
		private ArrayList<Account> kids = new ArrayList<Account>();
	}
	
	public class Account{
		private String name;
		private int phoneNumber;
		private String id;
		private String passWord;
		private Boolean tos;
		private String role;
		private Kindergarten belongingKindergarten;
		private ClassInformation belongingClass;
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}

		public int getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getPassWord() {
			return passWord;
		}

		public void setPassWord(String passWord) {
			this.passWord = passWord;
		}

		public Boolean getTos() {
			return tos;
		}

		public void setTos(Boolean tos) {
			this.tos = tos;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public Kindergarten getBelongingKindergarten() {
			return belongingKindergarten;
		}

		public void setBelongingKindergarten(Kindergarten belongingKindergarten) {
			this.belongingKindergarten = belongingKindergarten;
		}

		public ClassInformation getBelongingClass() {
			return belongingClass;
		}

		public void setBelongingClass(ClassInformation belongingClass) {
			this.belongingClass = belongingClass;
		}
	}
	
	public class SignUpManagement{
		private ManageDB manageDB;
		
		public void checkKindergarten(String kindergartenName) {
			// check kindergarten
		}
		
		public void requestSignUp(Account account) {
			// request to sign up
		}
		
		public void requestEntry(Account account) {
			// request entry into a class
		}
		
		public void requestKindergartenRegistration(Kindergarten kindergarten) {
			// request to regist a kindergarten
		}
	}
	
	public class AttendanceStatus{
		private Account account;
		private String attendanceStatus;
		
		public Account getAccount() {
			return account;
		}
		
		public void setAccount(Account account) {
			this.account = account;
		}
	}
	
	public interface DataBase{
		// dataBase
	}
}
