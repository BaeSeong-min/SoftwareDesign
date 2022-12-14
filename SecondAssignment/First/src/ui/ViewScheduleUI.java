package ui;
import manage.*;

public class ViewScheduleUI extends ScheduleUI{
	public void showSchedule() {
		System.out.println("showSchedule()");
		ManageSchedule ms = new ManageSchedule();
		ms.requestSchedule();
		
	}
}
