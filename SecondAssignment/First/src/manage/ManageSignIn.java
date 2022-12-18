package manage;
import dataStore.*;
import java.io.*;

public class ManageSignIn {
	public void checkAccount(String id, String ps) throws IOException{
		System.out.println("checkAccount()");
		
		DataStorage db = new DataStorage();
		db.checkExist(id, ps);
	}
}
