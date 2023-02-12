package com.geekster.univeventmanagement.service;

import com.geekster.univeventmanagement.model.Student;

import java.util.List;

public interface IStudentService {
    public List<Student> findAllStudents();
    public Student findStudentById(int id);
    public void addStudent(Student newStudent);
    public void updateDepartment(int id, Student newStudent);
    public void deleteStudent(int id);

}
