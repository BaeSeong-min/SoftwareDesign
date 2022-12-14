package manage;
import dataStore.*;
import ui.*;

public class ManageSignUp {
	public void registerAccount(SignUpPrincipalUI newAccount) {
		System.out.println("registerAccount()");
		DataStorage db = new DataStorage();
		db.insertAccount(newAccount);
	}
	
	public void registerAccountForNormal(SignUpUI newAccount) {
		System.out.println("registerAccountForNormal()");
		DataStorage db = new DataStorage();
		db.insertAccountForNormal(newAccount);
	}
}
