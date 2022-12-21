package manage;
import java.io.FileNotFoundException;
import java.io.IOException;

import dataStore.*;
import ui.*;

public class ManageAttendance {
	public void attendanceInsert(WritingAttendanceUI attendance) throws FileNotFoundException {
		System.out.println("attendanceInsert()");
		DataStorage db = new DataStorage();
		db.insertAttendance(attendance);
	}
	
	public void requestAttendance(String date, String cName) throws IOException {
		System.out.println("requestAttendance()");
		DataStorage db = new DataStorage();
		db.select(date+cName, "attendance");
	}
}
