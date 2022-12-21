package ui;
import java.io.IOException;

import manage.*;

public class ViewScheduleUI extends ScheduleUI{
	public void showSchedule(String date, String cname) throws IOException {
		System.out.println("showSchedule()");
		ManageSchedule ms = new ManageSchedule();
		ms.requestSchedule(date, cname);
		
	}
}
