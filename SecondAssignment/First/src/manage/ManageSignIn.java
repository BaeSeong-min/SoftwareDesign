package manage;
import dataStore.*;

public class ManageSignIn {
	public void checkAccount(String id, String ps) {
		System.out.println("checkAccount()");
		int result;
		DataStorage db = new DataStorage();
		result = db.checkExist(id, ps);
		while(result != 1) {
			result = db.checkExist(id, ps);
		}
	}
}
