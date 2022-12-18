package ui;

import manage.*;

import java.io.FileNotFoundException;
import java.util.*;

public class SignUpPrincipalUI extends SignUpCommonUI{
	private String registerKindergarten;
	private ArrayList<String> registerClass = new ArrayList<String>();
	private String belongingClass; // tmp
	
	public void registerKindergarten() {
		System.out.println("registerKindergarten()");
		ManageKindergarten mk = new ManageKindergarten();
		mk.kindergartenInsert(registerKindergarten);
	}
	
	public void registerClass() throws FileNotFoundException {
		System.out.println("registerClass()");
		ManageClass mc = new ManageClass();
		mc.classInsert(registerClass);
	}

	public String getRegisterKindergarten() {
		return registerKindergarten;
	}

	public void setRegisterKindergarten(String registerKindergarten) {
		this.registerKindergarten = registerKindergarten;
	}


	public String getBelongingClass() {
		return belongingClass;
	}

	public void setBelongingClass(String belongingClass) {
		this.belongingClass = belongingClass;
	}

	public ArrayList<String> getRegisterClass() {
		return registerClass;
	}

	public void setRegisterClass(ArrayList<String> registerClass) {
		this.registerClass = registerClass;
	}
}
