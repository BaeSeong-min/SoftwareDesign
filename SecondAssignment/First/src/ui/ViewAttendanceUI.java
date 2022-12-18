package ui;
import java.io.IOException;

import manage.*;

public class ViewAttendanceUI extends AttendanceUI{
	public void showAttendance() throws IOException {
		System.out.println("showAttendance()");
		ManageAttendance ma = new ManageAttendance();
		ma.requestAttendance();
	}
}
