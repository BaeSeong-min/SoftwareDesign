package manage;
import dataStore.*;

public class ManageAdmission {
	public void requestAdmit(String name) {
		System.out.println("requestAdmit()");
		DataStorage db = new DataStorage();
		db.approve(name);
	}
	
	public void requestWaiterList() {
		System.out.println("requestWaiterList()");
		DataStorage db = new DataStorage();
		db.select(null);
	}
}
