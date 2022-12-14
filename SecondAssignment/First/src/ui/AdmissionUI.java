package ui;
import manage.*;

public class AdmissionUI extends UI{
	public void showWaiterList() {
		System.out.println("showWaiterList()");
		ManageAdmission ma = new ManageAdmission();
		ma.requestWaiterList();
	}
	
	public void admitWaiter(String admitName) {
		System.out.println("admitWaiter()");
		ManageAdmission ma = new ManageAdmission();
		ma.requestAdmit(admitName);
	}
}
