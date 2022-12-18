package manage;

import java.io.FileNotFoundException;
import java.io.IOException;

import dataStore.*;
import java.util.*;

public class ManageClass {
	public void requestClassList() throws IOException {
		System.out.println("requestClassList()");
		DataStorage db = new DataStorage();
		db.select(null, "classList");
	}
	
	public void requestKidsList(String className) throws IOException {
		System.out.println("requestKidsList()");
		DataStorage db = new DataStorage();
		db.select(className, "classKidsList");
	}
	
	public void classInsert(ArrayList<String> registerClass) throws FileNotFoundException {
		System.out.println("classInsert()");
		DataStorage db = new DataStorage();
		db.insertClass(registerClass);
		
	}
}
