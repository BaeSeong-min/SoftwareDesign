package ui;
import java.io.IOException;

import manage.*;

public class ViewClassUI extends UI{
	public void showClass() throws IOException {
		System.out.println("showClass()");
		
		ManageClass ms = new ManageClass();
		ms.requestClassList();
	}
	
	public void showClassKid(String className) throws IOException {
		System.out.println("showClassKid()");
		ManageClass ms = new ManageClass();
		ms.requestKidsList(className);
	}
}
