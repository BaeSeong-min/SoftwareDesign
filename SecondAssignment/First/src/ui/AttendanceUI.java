package ui;
import java.util.*;

public class AttendanceUI extends UI{
	private String attendanceDate;
	private String attendanceClass;
	private ArrayList<String> attendanceObject = new ArrayList<String>();
	private ArrayList<String> attendanceStatus = new ArrayList<String>();
	
	public String getAttendanceDate() {
		return attendanceDate;
	}
	
	public void setAttendanceDate(String attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

	public String getAttendanceClass() {
		return attendanceClass;
	}

	public void setAttendanceClass(String attendanceClass) {
		this.attendanceClass = attendanceClass;
	}

	public ArrayList<String> getAttendanceObject() {
		return attendanceObject;
	}

	public void setAttendanceObject(ArrayList<String> attendanceObject) {
		this.attendanceObject = attendanceObject;
	}

	public ArrayList<String> getAttendanceStatus() {
		return attendanceStatus;
	}

	public void setAttendanceStatus(ArrayList<String> attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
	}
	
}
