package ui;

import java.io.FileNotFoundException;

import manage.*;

public class WritingAttendanceUI extends AttendanceUI{
	public void sendAttendance(WritingAttendanceUI attendance) throws FileNotFoundException {
		System.out.println("sendAttendance()");
		ManageAttendance ma = new ManageAttendance();
		ma.attendanceInsert(attendance);
	}
}
