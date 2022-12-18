package ui;
import java.io.IOException;

import manage.*;

public class ViewKindergartenUI extends UI{
	public void showKindergarten() throws IOException {
		System.out.println("showKindergarten()");
		ManageKindergarten mk = new ManageKindergarten();
		mk.requestKindergarten();
	}
}
