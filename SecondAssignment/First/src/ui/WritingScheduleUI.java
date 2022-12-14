package ui;
import manage.*;

public class WritingScheduleUI extends ScheduleUI{
	public void sendSchedule(WritingScheduleUI schedule) {
		System.out.println("sendSchedule()");
		ManageSchedule ms = new ManageSchedule();
		ms.scheduleInsert(schedule);
	}
}
