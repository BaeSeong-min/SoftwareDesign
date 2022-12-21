package manage;
import java.io.FileNotFoundException;
import java.io.IOException;

import dataStore.*;
import ui.*;

public class ManageSchedule {
	public void scheduleInsert(WritingScheduleUI schedule) throws FileNotFoundException {
		System.out.println("scheduleInsert()");
		DataStorage db = new DataStorage();
		db.insertSchedule(schedule);
	}
	
	public void requestSchedule(String date, String cname) throws IOException {
		System.out.println("requestSchedule()");
		DataStorage db = new DataStorage();
		db.select(date+cname, "schedule");
	}
}
