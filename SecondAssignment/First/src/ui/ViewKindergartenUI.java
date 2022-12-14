package ui;
import manage.*;

public class ViewKindergartenUI extends UI{
	public void showKindergarten() {
		System.out.println("showKindergarten()");
		ManageKindergarten mk = new ManageKindergarten();
		mk.requestKindergarten();
	}
}
