package com.geekster.univeventmanagement.controller;

import com.geekster.univeventmanagement.model.Event;
import com.geekster.univeventmanagement.model.Student;
import com.geekster.univeventmanagement.service.UemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/univ-event/management")
public class UemController {
    @Autowired
    private final UemService uemService;

    public UemController(UemService uemService) {
        this.uemService = uemService;
    }
//    http://localhost:8080/api/v1/univ-event/management/find-all-students
    @GetMapping("/find-all-students")
    public List<Student> findAllStudents() {
        return uemService.findAllStudents();
    }
//    http://localhost:8080/api/v1/univ-event/management/find-studentById/id/{id}
    @GetMapping("/find-studentById/id/{id}")
    public Student findStudentById(@PathVariable int id) {
        return uemService.findStudentById(id);
    }
//    http://localhost:8080/api/v1/univ-event/management/add-student
    @PostMapping("/add-student")
    public void addStudent(@RequestBody Student newStudent) {
        uemService.addStudent(newStudent);
    }
//    http://localhost:8080/api/v1/univ-event/management/update-department/studentid/{studentid}
    @PutMapping("/update-department/id/{id}")
    public void updateDepartment(@PathVariable int id,Student newStudent) {
        uemService.updateDepartment(id,newStudent);
    }
//    http://localhost:8080/api/v1/univ-event/management/delete-student/studentid/{studentid}
    @DeleteMapping("/delete-student/studentId/{id}")
    public void deleteStudent(@PathVariable int id) {
        uemService.deleteStudent(id);
    }

//    http://localhost:8080/api/v1/univ-event/management/add-event
    @PostMapping("/add-event")
    public void addEvent(@RequestBody Event event) {
        uemService.addEvent(event);
    }
//    http://localhost:8080/api/v1/univ-event/management/update-event/eventId/{eventId}
    @PutMapping("/update-event/eventId/{eventId}")
    public void updateEvent(@PathVariable int eventId, Event newEvent) {
        uemService.updateEvent(eventId,newEvent);
    }
//    http://localhost:8080/api/v1/univ-event/management/delete-event/eventId/{eventId}
    @DeleteMapping("/delete-event/eventId/{eventId}")
    public void deleteEvent(int eventId) {
        uemService.deleteEvent(eventId);
    }
//    http://localhost:8080/api/v1/univ-event/management/find-all-event/date/{date}
    @GetMapping("/find-all-event/dated/{dated}")
    public List<Event> findByDate(String dated) {
        return uemService.findByDate(dated);
    }
}
