package com.geekster.univeventmanagement.service;

import com.geekster.univeventmanagement.model.Event;
import com.geekster.univeventmanagement.model.Student;
import com.geekster.univeventmanagement.repository.EventRepository;
import com.geekster.univeventmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UemService implements IStudentService, IEventService {
    private static List<Student> students=new ArrayList<>();
    private static List<Event> events=new ArrayList<>();
    @Autowired
    EventRepository eventRepository;

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void addEvent(Event event) {
        eventRepository.save(event);
    }

    @Override
    public void updateEvent(int eventId, Event newEvent) {
        Event event = eventRepository.findById(eventId).get();
        event.setEventId( newEvent.getEventId());
        event.setEventName(newEvent.getEventName());
        event.setLocationOfEvent( newEvent.getLocationOfEvent());
        event.setDated( newEvent.getDated());
        event.setStartTime(newEvent.getStartTime());
        event.setEndTime(newEvent.getEndTime());
        event.setImageurl(newEvent.getImageurl());
        eventRepository.save(event);
    }

    @Override
    public void deleteEvent(int eventId) {
        eventRepository.deleteById(eventId);
    }

    @Override
    public List<Event> findByDate(String date) {
        List<Event> events = eventRepository.findAll();
        List<Event> newEvents = new ArrayList<>();
        for(Event event:events)
            if(event.getDated().equals(date)){
                newEvents.add(event);
            }
        return newEvents;
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student findStudentById(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void addStudent(Student newStudent) {
        studentRepository.save(newStudent);
    }

    @Override
    public void updateDepartment(int id, Student newStudent) {
        Student student = studentRepository.findById(id).get();
        student.setFirstName(newStudent.getFirstName());
        student.setLastName(newStudent.getLastName());
        student.setAge(newStudent.getAge());
        student.setDepartment(newStudent.getDepartment());
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
