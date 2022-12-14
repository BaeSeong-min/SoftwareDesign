package ui;

public class AttendanceUI extends UI{
	private String attendanceDate;
	private String attendanceClass;
	private String attendanceObject;
	private String attendanceStatus;
	
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

	public String getAttendanceObject() {
		return attendanceObject;
	}

	public void setAttendanceObject(String attendanceObject) {
		this.attendanceObject = attendanceObject;
	}

	public String getAttendanceStatus() {
		return attendanceStatus;
	}

	public void setAttendanceStatus(String attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
	}
}
