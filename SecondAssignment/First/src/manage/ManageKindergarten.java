package manage;
import dataStore.*;

public class ManageKindergarten {
	public void requestKindergarten() {
		System.out.println("requestKindergarten()");
		DataStorage db = new DataStorage();
		db.select(null);
	}
	
	public void kindergartenInsert(String kindergartenName) {
		System.out.println("kindergartenInsert()");
		DataStorage db = new DataStorage();
		db.insertKindergarten(kindergartenName);
	}
}
