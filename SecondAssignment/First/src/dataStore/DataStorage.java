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
	private ArrayList<String> kinderInfo = new ArrayList<String>();

	public void insertAccount(SignUpPrincipalUI newAccount) throws FileNotFoundException {
		System.out.println("insertAccount()");
		account.add(newAccount);
		insertKindergarten(newAccount.getRegisterKindergarten());
		insertClass(newAccount.getRegisterClass());
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
		
		try {
			File file = new File(newAccount.getBelongingClass()+".txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(newAccount.getId()); 
			writer.newLine();
			writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void insertRequestion(SignUpUI newAccount) {
		System.out.println("insertRequestion()");
		admissionWaiterInfo.add(newAccount);
		
		try {
			File file = new File("waitingList.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(newAccount.getId()); 
			writer.newLine();
			writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void insertKindergarten(String kindergartenName) {
		System.out.println("insertKindergarten()");
		kinderInfo.add(kindergartenName);
		
		try {
			File file = new File("kindergarten.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(kindergartenName);
			writer.newLine();
			writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void insertClass(ArrayList<String> className) throws FileNotFoundException{
		System.out.println("insertClass()");

		try {
			File file = new File("classList.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			
			for(int i = 0; i < className.size(); i++) {
				writer.write(className.get(i));
				writer.newLine();
			}
			
			for(int i = 0; i < className.size(); i++) { 
				File file2 = new File(className.get(i)+".txt");
				if(!file2.exists()) {
					file2.createNewFile();
				} 
			}
			writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void insertReport(ReportUI report) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("usingAccount.txt"));
		Scanner sc2 = new Scanner(new File("waitingList.txt"));
		
		String id = sc.next(); sc.next(); sc.next(); sc.next();
		String role = sc.next();
		if(("teacher".equals(role) || "principal".equals(role))) {
			while(sc2.hasNext()) {
				if(sc2.next().equals(id)) {
					System.out.println("you can't write any report untill accepted by principal");
					System.exit(0);
				}
			}
			
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
	
	public void insertAttendance(AttendanceUI attendance) throws FileNotFoundException {
		attendanceInfo.add(attendance);
		Scanner sc = new Scanner(new File("usingAccount.txt"));
		sc.next(); sc.next(); sc.next(); sc.next();
		String role = sc.next();
		if("teacher".equals(role) || "principal".equals(role)) {
			System.out.println("insertAttendance()");
			attendanceInfo.add(attendance);
			
			try {
				File file = new File(attendance.getAttendanceDate() + attendance.getAttendanceClass()+ "attendanceList.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
				writer.write(attendance.getAttendanceObject().toString() + " ");
				writer.write(attendance.getAttendanceStatus().toString() +" ");
				writer.newLine();
				writer.close();
				}catch(IOException e) {
					e.printStackTrace();
					}
			}
		else {
			System.out.println("Only teacher or principal can write attendance");
			}
	}
	
	public void insertSchedule(ScheduleUI schedule) throws FileNotFoundException {
		scheduleInfo.add(schedule);
		
		Scanner sc = new Scanner(new File("usingAccount.txt"));
		sc.next(); sc.next(); sc.next(); sc.next();
		String role = sc.next();
		if("teacher".equals(role) || "principal".equals(role)) {
			System.out.println("insertSchedule()");
			scheduleInfo.add(schedule);
			
			try {
				File file = new File(schedule.getScheduleDate() + schedule.getScheduleClass()+ "scheduleList.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
				writer.write("- " + schedule.getScheduleContent() + " ");
				writer.newLine();
				writer.close();
				}catch(IOException e) {
					e.printStackTrace();
					}
			}
		else {
			System.out.println("Only teacher or principal can write schedule");
			}
		
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
				System.exit(0);
			}
			sc.nextLine();
		}
		if(i == 0) {
			System.out.println("id or ps is incorrect");
		}
		
	}
	
	public void approve(String name) throws IOException {
		System.out.println("approve()");
		String msg;
		BufferedReader br=new BufferedReader(new FileReader(new File("waitingList.txt")));
		File file = new File("waitingList.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		while((msg = br.readLine()) != null) {
			if(!(msg.equals(name))) {
				writer.write(msg);
			}
			writer.newLine();
		}
		
		br.close();
		writer.close();
	}
	
	public void select(String list, String type) throws IOException{
		System.out.println("select()");
	
		if(type.equals("report")) {
			Scanner sc = new Scanner(new File("reportList.txt"));
			Scanner sc2 = new Scanner(new File("usingAccount.txt"));
			int i = 0;
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
			String tmpRec = sc2.next();
			while(sc.hasNext()) {
				String date = sc.next();
				String receiver = sc.next();
				String content = sc.next();
				String status = sc.nextLine();
				if(receiver.equals(tmpRec)) {
					System.out.println("date: " + date);
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
			Scanner sc = new Scanner(new File("classList.txt"));
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
		
		else if(type.equals("classKidsList")) {
			Scanner sc = new Scanner(new File(list +".txt"));
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
		else if(type.equals("waitingList")) {
			Scanner sc = new Scanner(new File("waitingList.txt"));
			int i = 0;
			while(sc.hasNext()) {
				String wid = sc.next();
				System.out.println("waiting ID: " + wid);
				System.out.println("========================================\n");
				++i;
				}
			if(i == 0)
				System.out.println("no class");
			}
		
		else if(type.equals("attendance")) {
			Scanner sc = new Scanner(new File(list + "attendanceList.txt"));
			int i = 0;
			while(sc.hasNext()) {
				String cid = sc.next(); String cst = sc.next();
				System.out.println("ID: " + cid + "|| Attendance Status: " + cst);
				System.out.println("========================================\n");
				++i;
				}
			if(i == 0)
				System.out.println("no attendance");
			}
		
		else if(type.equals("schedule")) {
			Scanner sc = new Scanner(new File(list + "scheduleList.txt"));
			int i = 0;
			while(sc.hasNext()) {
				sc.next();
				String content = sc.next();
				System.out.println("- " + content);
				System.out.println("========================================\n");
				++i;
				}
			if(i == 0)
				System.out.println("no attendance");
			}
		
	}
}
