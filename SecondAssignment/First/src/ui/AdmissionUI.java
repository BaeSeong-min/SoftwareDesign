package ui;
import java.io.IOException;

import manage.*;

public class AdmissionUI extends UI{
	public void showWaiterList() throws IOException {
		System.out.println("showWaiterList()");
		ManageAdmission ma = new ManageAdmission();
		ma.requestWaiterList();
	}
	
	public void admitWaiter(String admitName) throws IOException {
		System.out.println("admitWaiter()");
		ManageAdmission ma = new ManageAdmission();
		ma.requestAdmit(admitName);
	}
}
