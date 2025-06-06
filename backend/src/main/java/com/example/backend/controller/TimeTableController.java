package com.example.backend.controller;

import com.example.backend.entity.TimeTable;
import com.example.backend.service.TimeTableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/timetable")
public class TimeTableController {

    @Autowired
    private TimeTableService timeTableService;

    // 取得所有資料
    @GetMapping
    public List<TimeTable> getAll() {
        return timeTableService.showAll();
    }

    // 取得單筆資料
    @GetMapping("/{id}")
    public TimeTable getOne(@PathVariable Integer id) {
        return timeTableService.getUpdateRecord(id);
    }

    // 新增資料
    @PostMapping
    public void create(@RequestBody TimeTable timeTable) {
        timeTableService.addRecord(timeTable);
    }

    // 修改資料
    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody TimeTable timeTable) {
        timeTable.setPk(id);
        timeTableService.updateRecord(timeTable);
    }

    // 刪除資料
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        timeTableService.deleteRecord(id.toString());
    }
}
