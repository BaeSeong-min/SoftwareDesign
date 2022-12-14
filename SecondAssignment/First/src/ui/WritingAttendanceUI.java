package ui;
import manage.*;

public class WritingAttendanceUI extends AttendanceUI{
	public void sendAttendance(WritingAttendanceUI attendance) {
		System.out.println("sendAttendance()");
		ManageAttendance ma = new ManageAttendance();
		ma.attendanceInsert(attendance);
	}
}
