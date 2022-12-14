package ui;

import manage.*;

public class SignUpPrincipalUI extends SignUpCommonUI{
	private String registerKindergarten;
	private String registerClass;
	
	public void registerKindergarten() {
		System.out.println("registerKindergarten()");
		ManageKindergarten mk = new ManageKindergarten();
		mk.kindergartenInsert(registerKindergarten);
	}
	
	public void registerClass() {
		System.out.println("registerClass()");
		ManageClass mc = new ManageClass();
		mc.classInsert();
	}

	public String getRegisterKindergarten() {
		return registerKindergarten;
	}

	public void setRegisterKindergarten(String registerKindergarten) {
		this.registerKindergarten = registerKindergarten;
	}

	public String getRegisterClass() {
		return registerClass;
	}

	public void setRegisterClass(String registerClass) {
		this.registerClass = registerClass;
	}
}
