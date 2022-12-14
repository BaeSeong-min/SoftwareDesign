package ui;
import manage.*;

public class SignUpCommonUI extends UI{
	private String id;
	private String ps;
	private String name;
	private String phoneNum;
	private String role;
	
	public void signUp(SignUpPrincipalUI newAccount) {
		System.out.println("signUp()");
		
		ManageSignUp ms = new ManageSignUp();
		ms.registerAccount(newAccount);
	}

	public void signUpForNormal(SignUpUI newAccount) {
		System.out.println("signUpForNormal()");
		
		ManageSignUp ms = new ManageSignUp();
		ms.registerAccountForNormal(newAccount);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPs() {
		return ps;
	}

	public void setPs(String ps) {
		this.ps = ps;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
