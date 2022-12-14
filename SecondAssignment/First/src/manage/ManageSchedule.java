package manage;
import dataStore.*;
import ui.*;

public class ManageSchedule {
	public void scheduleInsert(WritingScheduleUI schedule) {
		System.out.println("scheduleInsert()");
		DataStorage db = new DataStorage();
		db.insertSchedule(schedule);
	}
	
	public void requestSchedule() {
		System.out.println("requestSchedule()");
		DataStorage db = new DataStorage();
		db.select(null);
	}
}
