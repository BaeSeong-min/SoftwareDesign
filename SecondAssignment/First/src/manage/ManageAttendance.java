package manage;
import java.io.IOException;

import dataStore.*;
import ui.*;

public class ManageAttendance {
	public void attendanceInsert(WritingAttendanceUI attendance) {
		System.out.println("attendanceInsert()");
		DataStorage db = new DataStorage();
		db.insertAttendance(attendance);
	}
	
	public void requestAttendance() throws IOException {
		System.out.println("requestAttendance()");
		DataStorage db = new DataStorage();
		db.select(null, "attendance");
	}
}
