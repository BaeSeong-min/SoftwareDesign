package manage;
import java.io.IOException;

import dataStore.*;

public class ManageAdmission {
	public void requestAdmit(String name) {
		System.out.println("requestAdmit()");
		DataStorage db = new DataStorage();
		db.approve(name);
	}
	
	public void requestWaiterList() throws IOException {
		System.out.println("requestWaiterList()");
		DataStorage db = new DataStorage();
		db.select(null, "waiterList");
	}
}
