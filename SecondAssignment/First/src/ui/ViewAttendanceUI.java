package ui;
import java.io.IOException;

import manage.*;

public class ViewAttendanceUI extends AttendanceUI{
	public void showAttendance(String date, String cName) throws IOException {
		System.out.println("showAttendance()");
		ManageAttendance ma = new ManageAttendance();
		ma.requestAttendance(date, cName);
	}
}
