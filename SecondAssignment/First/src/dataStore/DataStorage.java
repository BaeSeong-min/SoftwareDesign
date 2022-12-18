package dataStore;
import java.util.*;
import ui.*;
import java.io.*;

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
		insertKindergarten(newAccount.getRegisterKindergarten());
		try {
			File file = new File("Account.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(newAccount.getId() + " ");
			writer.write(newAccount.getPs() +" ");
			writer.write(newAccount.getName() +" ");
			writer.write(newAccount.getPhoneNum() +" ");
			writer.write(newAccount.getRole() +" ");
			writer.write(newAccount.getRegisterKindergarten() +" ");
			writer.write(newAccount.getBelongingClass());
			writer.newLine();
			writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void insertAccountForNormal(SignUpUI newAccount) {
		System.out.println("insertAccountForNormal()");
		accountForNormal.add(newAccount);
		insertRequestion(newAccount);
		
		try {
			File file = new File("Account.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(newAccount.getId() + " ");
			writer.write(newAccount.getPs() +" ");
			writer.write(newAccount.getName() +" ");
			writer.write(newAccount.getPhoneNum() +" ");
			writer.write(newAccount.getRole() +" ");
			writer.write(newAccount.getBelongingKindergarten() +" ");
			writer.write(newAccount.getBelongingClass());
			writer.newLine();
			writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void insertRequestion(SignUpUI newAccount) {
		System.out.println("insertRequestion()");
		admissionWaiterInfo.add(newAccount);
		/*
		try {
			File file = new File("kindergarten.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(kindergartenName);
			writer.newLine();
			writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}*/
	}
	
	public void insertKindergarten(String kindergartenName) {
		System.out.println("insertKindergarten()");
		kinderInfo.add(kindergartenName);
		
		try {
			File file = new File("kindergarten.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(kindergartenName);
			writer.newLine();
			writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void insertClass(ArrayList<String> className) throws FileNotFoundException{
		System.out.println("insertClass()");
		classInfo = className;

		try {
			File file = new File("class.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			
			for(int i = 0; i < className.size(); i++) {
				writer.write(className.get(i));
				writer.newLine();
			}
			
			writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void insertReport(ReportUI report) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("usingAccount.txt"));
		
		sc.next(); sc.next(); sc.next(); sc.next();
		String role = sc.next();
		if("teacher".equals(role) || "principal".equals(role)) {
			System.out.println("insertReport()");
			reportInfo.add(report);
			try {
				File file = new File("reportList.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
				writer.write(report.getReportDate() + " ");
				writer.write(report.getReportReceiver() +" ");
				writer.write(report.getReportContent() +" ");
				writer.write(report.getStatus().get(0) + " " + report.getStatus().get(1) +  " " + report.getStatus().get(2)+report.getStatus().get(3) + " " + report.getStatus().get(4) +  " " + report.getStatus().get(5));
				writer.newLine();
				writer.close();
				}catch(IOException e) {
					e.printStackTrace();
					}
			}
		else {
			System.out.println("Only teacher or principal can write report");
			}
	}
	
	public void insertNotice(NoticeUI notice) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("usingAccount.txt"));
		
		sc.next(); sc.next(); sc.next(); sc.next();
		String role = sc.next();
		if("teacher".equals(role) || "principal".equals(role)) {
			System.out.println("insertNotice()");
			noticeInfo.add(notice);
			try {
				File file = new File("noticeList.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
				writer.write(notice.getNoticeTitle() + " ");
				writer.write(notice.getNoticeNum() +" ");
				writer.write(notice.getNoticeReceiver() +" ");
				writer.write(notice.getNoticeContent());
				writer.newLine();
				writer.close();
				}catch(IOException e) {
					e.printStackTrace();
					}
			}
		else {
			System.out.println("Only teacher or principal can write notice");
			}
	}
	
	public void insertAttendance(AttendanceUI attendance) {
		System.out.println("insertAttendance()");
		attendanceInfo.add(attendance);
	}
	
	public void insertSchedule(ScheduleUI schedule) {
		System.out.println("insertSchedule()");
		scheduleInfo.add(schedule);
	}
	
	public void checkExist(String id, String ps) throws IOException{
		System.out.println("checkExist()");
		
		Scanner sc = new Scanner(new File("account.txt"));
		int i = 0;
		while(sc.hasNext()) {
			String idC = sc.next();
			String psC = sc.next();
			if(idC.equals(id) && psC.equals(ps)) {
				System.out.println("Login Success!");
				i = 1;
				try {
					File file = new File("usingAccount.txt");
					if(!file.exists()) {
						file.createNewFile();
					}
					BufferedWriter writer = new BufferedWriter(new FileWriter(file));
					writer.write(id + " ");
					writer.write(ps +" ");
					writer.write(sc.next() +" ");
					writer.write(sc.next() +" ");
					writer.write(sc.next() +" ");
					writer.write(sc.next() +" ");
					writer.write(sc.next() +" ");
					writer.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
				
			}
			String pass = sc.nextLine();
		}
		if(i == 0) {
			System.out.println("id or ps is incorrect");
		}
		
	}
	
	public void approve(String name) {
		System.out.println("approve()");
		for(int i = 0; i < admissionWaiterInfo.size(); i++) {
			if(name.equals(admissionWaiterInfo.get(i).getName())){
				admissionWaiterInfo.remove(i);
			}
		}
	}
	
	public void select(String list, String type) throws IOException{
		System.out.println("select()");
	
		if(type.equals("report")) {
			Scanner sc = new Scanner(new File("reportList.txt"));
			Scanner sc2 = new Scanner(new File("usingAccount.txt"));
			int i = 0;
			sc2.next(); sc2.next(); 
			String tmpRec = sc2.next();
			while(sc.hasNext()) {
				String date = sc.next();
				String receiver = sc.next();
				String content = sc.next();
				String status = sc.nextLine();
				if(date.equals(list) && receiver.equals(tmpRec)) {
					System.out.println("date: " + date);
					System.out.println("receiver: " + receiver);
					System.out.println("content: " + content);
					System.out.println("Kid's status: " + status);
					System.out.println("========================================\n");
					++i;
				}
			}
			if(i == 0 )
				System.out.println("no report");
		}
		else if(type.equals("reportList")) {
			Scanner sc = new Scanner(new File("reportList.txt"));
			Scanner sc2 = new Scanner(new File("usingAccount.txt"));
			int i = 0;
			sc2.next(); sc2.next();
			String tmpRec = sc.next();
			while(sc.hasNext()) {
				String date = sc.next();
				String receiver = sc.next();
				String content = sc.next();
				String status = sc.nextLine();
				if(receiver.equals(tmpRec)) {
					System.out.println("date: " + date);
					System.out.println("receiver: " + receiver);
					System.out.println("content: " + content);
					System.out.println("Kid's status: " + status);
					System.out.println("========================================\n");
					++i;
				}
			}
			
			if(i == 0)
				System.out.println("no reportList");
		}
		
		else if(type.equals("notice")) {
			Scanner sc = new Scanner(new File("noticeList.txt"));
			Scanner sc2 = new Scanner(new File("usingAccount.txt"));
			int i = 0;
			sc2.next(); sc2.next(); sc2.next(); sc2.next(); sc2.next(); sc2.next();
			String tmpClass = sc2.next();
			while(sc.hasNext()) {
				String title = sc.next();
				String num = sc.next();
				String className = sc.next();
				String content = sc.nextLine();
				if(num.equals(list) && className.equals(tmpClass)) {
					System.out.println("title: " + title);
					System.out.println("num: " + num);
					System.out.println("class: " + className);
					System.out.println("content: " + content);
					System.out.println("========================================\n");
					++i;
				}
			}
			if(i == 0 )
				System.out.println("no notice");
		}
		
		
		else if(type.equals("noticeList")) {
			Scanner sc = new Scanner(new File("noticeList.txt"));
			Scanner sc2 = new Scanner(new File("usingAccount.txt"));
			int i = 0;
			sc2.next(); sc2.next(); sc2.next(); sc2.next(); sc2.next(); sc2.next();
			String tmpClass = sc2.next();
			while(sc.hasNext()) {
				String title = sc.next();
				String num = sc.next();
				String className = sc.next();
				String content = sc.nextLine();
				if(className.equals(tmpClass)) {
					System.out.println("title: " + title);
					System.out.println("num: " + num);
					System.out.println("class: " + className);
					System.out.println("content: " + content);
					System.out.println("========================================\n");
					++i;
				}
			}
			if(i == 0)
				System.out.println("no noticeList");
		}
		
		else if(type.equals("kindergartenList")) {
			Scanner sc = new Scanner(new File("kindergarten.txt"));
			int i = 0;
			while(sc.hasNext()) {
				String kindergartenName = sc.next();
				System.out.println("kindergartenName: " + kindergartenName);
				System.out.println("========================================\n");
				++i;
				}
			if(i == 0)
				System.out.println("no kindergarten");
			}
		
		else if(type.equals("classList")) {
			Scanner sc = new Scanner(new File("class.txt"));
			int i = 0;
			while(sc.hasNext()) {
				String className = sc.next();
				System.out.println("className: " + className);
				System.out.println("========================================\n");
				++i;
				}
			if(i == 0)
				System.out.println("no class");
			}
	}
}
