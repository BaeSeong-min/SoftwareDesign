package manage;
import java.io.IOException;

import dataStore.*;

public class ManageKindergarten {
	public void requestKindergarten() throws IOException {
		System.out.println("requestKindergarten()");
		DataStorage db = new DataStorage();
		db.select("kindergartenList", "kindergarten");
	}
	
	public void kindergartenInsert(String kindergartenName) {
		System.out.println("kindergartenInsert()");
		DataStorage db = new DataStorage();
		db.insertKindergarten(kindergartenName);
	}
}
