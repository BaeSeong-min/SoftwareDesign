package ui;
import java.io.IOException;

import manage.*;

public class ViewScheduleUI extends ScheduleUI{
	public void showSchedule() throws IOException {
		System.out.println("showSchedule()");
		ManageSchedule ms = new ManageSchedule();
		ms.requestSchedule();
		
	}
}
