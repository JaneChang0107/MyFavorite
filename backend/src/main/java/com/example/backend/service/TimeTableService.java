package com.example.backend.service;

import java.util.List;

import com.example.backend.entity.TimeTable;

public interface TimeTableService {

	List<TimeTable> showAll();
	
	void addRecord(TimeTable timetable);

	void deleteRecord(String pk);
	
	void updateRecord(TimeTable timetable);

	TimeTable getUpdateRecord(Integer pk);

}
