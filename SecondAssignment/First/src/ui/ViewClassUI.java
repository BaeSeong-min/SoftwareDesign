package ui;
import manage.*;

public class ViewClassUI extends UI{
	public void showClass() {
		System.out.println("showClass()");
		
		ManageClass ms = new ManageClass();
		ms.requestClassList();
	}
	
	public void showClassKid(String className) {
		System.out.println("showClassKid()");
		ManageClass ms = new ManageClass();
		ms.requestKidsList(className);
	}
}
