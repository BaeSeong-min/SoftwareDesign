package manage;

import dataStore.*;

public class ManageClass {
	public void requestClassList() {
		System.out.println("requestClassList()");
		DataStorage db = new DataStorage();
		db.select(null);
	}
	
	public void requestKidsList(String className) {
		System.out.println("requestKidsList()");
		DataStorage db = new DataStorage();
		db.select(className);
	}
	
	public void classInsert() {
		System.out.println("classInsert()");
		DataStorage db = new DataStorage();
		db.insertAccount(null);
	}
}
