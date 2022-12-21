package ui;
import java.io.FileNotFoundException;

import manage.*;

public class WritingScheduleUI extends ScheduleUI{
	public void sendSchedule(WritingScheduleUI schedule) throws FileNotFoundException {
		System.out.println("sendSchedule()");
		ManageSchedule ms = new ManageSchedule();
		ms.scheduleInsert(schedule);
	}
}
