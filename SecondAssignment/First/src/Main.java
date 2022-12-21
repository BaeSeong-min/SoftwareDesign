import java.util.*;
import ui.*;
import manage.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{		
		int inputNum;
		
		Scanner scan = new Scanner(System.in);
		
		if(args.length == 0) {
			System.out.println("There is no parameter.\n");
		}
		
		else {
			for(int idx = 0; idx < args.length; idx++) {
				if(args[idx].equals("signUp")) {
					SignUpUI sui = new SignUpUI();
					ViewKindergartenUI kui = new ViewKindergartenUI();
					ViewClassUI cui = new ViewClassUI();
					
					System.out.println("id : ");
					sui.setId(scan.nextLine());
					System.out.println("ps : ");
					sui.setPs(scan.nextLine());
					System.out.println("name : ");
					sui.setName(scan.nextLine());
					System.out.println("phoneNum : ");
					sui.setPhoneNum(scan.nextLine());
					System.out.println("role : ");
					sui.setRole(scan.nextLine());
					
					kui.showKindergarten();
					System.out.println("input belonging kindergartenName : ");
					sui.setBelongingKindergarten(scan.nextLine());
					
					if(sui.getBelongingKindergarten().equals("")) {
						System.out.println("please enter belonging kindergarten name!");
						System.exit(0);
					}
					
					cui.showClass();
					System.out.println("input belonging className : ");
					sui.setBelongingClass(scan.nextLine());
					
					sui.signUpForNormal(sui);
				}
				else if(args[idx].equals("signUpForPrincipal")) {
					SignUpPrincipalUI pui = new SignUpPrincipalUI();
					ViewKindergartenUI kui = new ViewKindergartenUI();
					ViewClassUI cui = new ViewClassUI();
					
					System.out.println("id : ");
					pui.setId(scan.nextLine());
					System.out.println("ps : ");
					pui.setPs(scan.nextLine());
					System.out.println("name : ");
					pui.setName(scan.nextLine());
					System.out.println("phoneNum : ");
					pui.setPhoneNum(scan.nextLine());
					System.out.println("role : ");
					pui.setRole(scan.nextLine());
					
					System.out.println("input kindergartenName to register : ");
					String tmp = scan.nextLine();
					pui.setRegisterKindergarten(tmp);
					pui.registerKindergarten();
					kui.showKindergarten();
					
					pui.setBelongingClass("NONE");
					ArrayList<String> tmpClass = new ArrayList<String>();
					String input;
					
					
					while(true){
						System.out.println("input className to register : (if you want to stop, then input 'stop'");
						input = scan.nextLine();
						if(input.equals("stop")) {
							break;
						}
						tmpClass.add(input);
					}
					
					pui.setRegisterClass(tmpClass);
					pui.registerClass();
					cui.showClass();
					
					pui.signUp(pui);
				}
				else if(args[idx].equals("acceptAdmission")) {
					String tmp;
					AdmissionUI aui = new AdmissionUI();
					aui.showWaiterList();
					
					System.out.println("select kid id to approve : ");
					aui.admitWaiter(scan.nextLine());
				}
				else if(args[idx].equals("logIn")) {
					SignInUI iui = new SignInUI();
					ManageSignIn msi = new ManageSignIn();
					
					while(true){
						System.out.println("input id : ");
						iui.setId(scan.nextLine());
						System.out.println("input ps : ");
						iui.setPs(scan.nextLine());
						msi.checkAccount(iui.getId(), iui.getPs());
					}
				}
				else if(args[idx].equals("logOut")) {
					SignOutUI oui = new SignOutUI();
					oui.signOutRequest();
				}
				else if(args[idx].equals("writeReport")) {
					WritingReportUI rui = new WritingReportUI();
					ViewClassUI cui = new ViewClassUI();
					ManageClass mc = new ManageClass();
					ArrayList<String> tmp = new ArrayList<String>();
					
					System.out.println("input date : ");
					rui.setReportDate(scan.nextLine());
					cui.showClass();
					
					System.out.println("input class : ");
					mc.requestKidsList(scan.nextLine());
					
					System.out.println("input receiver : ");
					rui.setReportReceiver(scan.nextLine());;
					System.out.println("input content : ");
					rui.setReportContent(scan.nextLine());
					System.out.println("input kids status");
					System.out.println("(1)feeling : ");
					tmp.add(scan.nextLine());
					System.out.println("(2)health : ");
					tmp.add(scan.nextLine());
					System.out.println("(3)temperature : ");
					tmp.add(scan.nextLine());
					System.out.println("(4)eating : ");
					tmp.add(scan.nextLine());
					System.out.println("(5)sleep time : ");
					tmp.add(scan.nextLine());
					System.out.println("(6)defecation status : ");
					tmp.add(scan.nextLine());
					
					rui.setStatus(tmp);
					rui.sendReport(rui);	
				}
				else if(args[idx].equals("checkReport")) {
					ViewReportListUI rlui = new ViewReportListUI();
					ViewReportUI vrui = new ViewReportUI();
					rlui.showReportList();
					
					System.out.println("input date : ");
					String tmp = scan.nextLine();
					vrui.setReportDate(tmp);
					vrui.showReport(tmp);
				}
				else if(args[idx].equals("writeNotice")) {
					WritingNoticeUI nui = new WritingNoticeUI();
					ViewClassUI cui = new ViewClassUI();
					System.out.println("input num : ");
					nui.setNoticeNum(scan.nextLine());
					System.out.println("input content : ");
					nui.setNoticeContent(scan.nextLine());
					cui.showClass();
					System.out.println("input class : ");
					nui.setNoticeReceiver(scan.nextLine());
					System.out.println("input title : ");
					nui.setNoticeTitle(scan.nextLine());
					
					nui.sendNotice(nui);
				}
				else if(args[idx].equals("checkNotice")) {
					ViewNoticeListUI nlui = new ViewNoticeListUI();
					ViewNoticeUI nui = new ViewNoticeUI();
					nlui.showNoticeList();
					System.out.println("input num : ");
					nui.showNotice(scan.nextLine());
				}
				else if(args[idx].equals("writeAttendance")) {
					WritingAttendanceUI aui = new WritingAttendanceUI();
					ViewClassUI cui = new ViewClassUI();
					ArrayList<String> tmp = new ArrayList<String>();
					ArrayList<String> tmp2 = new ArrayList<String>();
					System.out.println("input date : ");
					aui.setAttendanceDate(scan.nextLine());
					cui.showClass();
					System.out.println("input class : ");
					aui.setAttendanceClass(scan.nextLine());
					cui.showClassKid(aui.getAttendanceClass());
					
					System.out.println("input attendance object : ");
					tmp.add(scan.nextLine());
					System.out.println("input attendance status : ");
					tmp2.add(scan.nextLine());
					
					
					aui.setAttendanceObject(tmp);
					aui.setAttendanceStatus(tmp2);
					aui.sendAttendance(aui);
				}
				else if(args[idx].equals("checkAttendance")) {
					ViewAttendanceUI aui = new ViewAttendanceUI();
					ViewClassUI cui = new ViewClassUI();
					String cname;
					String date;
					cui.showClass();
					System.out.println("input class : ");
					cname = scan.nextLine();
					aui.setAttendanceClass(cname);
					System.out.println("input date : ");
					date = scan.nextLine();
					aui.setAttendanceDate(date);
					aui.showAttendance(date, cname);
				}
				else if(args[idx].equals("writeSchedule")) {
					WritingScheduleUI sui = new WritingScheduleUI();
					ViewClassUI cui = new ViewClassUI();
					System.out.println("input date : ");
					sui.setScheduleDate(scan.nextLine());
					cui.showClass();
					
					System.out.println("input class : ");
					sui.setScheduleClass(scan.nextLine());
					System.out.println("input content : ");
					sui.setScheduleContent(scan.nextLine());
					sui.sendSchedule(sui);	
				}
				else if(args[idx].equals("checkSchedule")) {
					ViewScheduleUI vsui = new ViewScheduleUI();
					ViewClassUI vcui = new ViewClassUI();
					String cname; String date;
					vcui.showClass();
					System.out.println("input class : ");
					cname = scan.nextLine();
					vsui.setScheduleClass(cname);
					System.out.println("input date : ");
					date = scan.nextLine();
					vsui.setScheduleDate(date);
					vsui.showSchedule(date, cname);
				}
					
			}
		}
		scan.close();
	}

}
