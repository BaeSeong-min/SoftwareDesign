package ui;
import manage.*;

public class ViewAttendanceUI extends AttendanceUI{
	public void showAttendance() {
		System.out.println("showAttendance()");
		ManageAttendance ma = new ManageAttendance();
		ma.requestAttendance();
	}
}
