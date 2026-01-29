package com.studentproject.studentmanagementsystem.Service;

import com.studentproject.studentmanagementsystem.Model.Student;

import java.util.List;

public interface StudentService {

    public Student addStudent(Student s);

    public Student updateStudent(Student s);


    public List<Student> getAllStudents();

    public Student getStudentById(Long id);

    public boolean deleteStudent(Long id);

}
