package com.help.back.backend.service;

import com.help.back.backend.domain.Schedule;
import com.help.back.backend.dto.ScheduleDate;

import java.util.List;

public interface ScheduleService {
    List<Schedule> getPersonalSchedule(int userId);
    List<Schedule> getPersonalScheduleByDate(ScheduleDate scheduleDate);
    int postPersonalSchedule(Schedule schedule);
    int updatePersonalSchedule(Schedule schedule);
    int deletePersonalSchedule(int id);
    List<Schedule> getTodoLists(int userId);
    int addTodo(Schedule schedule);
    int deleteTodo(int id);
    int updateTodoState(Schedule schedule);
    int todoListToSchedule(Schedule schedule);
}
