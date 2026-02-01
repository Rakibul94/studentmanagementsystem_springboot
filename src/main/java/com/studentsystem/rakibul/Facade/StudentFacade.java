package com.studentsystem.rakibul.Facade;

import org.springframework.stereotype.Service;

import com.studentsystem.rakibul.Model.Department;
import com.studentsystem.rakibul.Model.Student;
import com.studentsystem.rakibul.Service.DepartmentService;
import com.studentsystem.rakibul.Service.StudentService;

@Service
public class StudentFacade {
    private final StudentService studentService;
    private final DepartmentService departmentService;

    public StudentFacade(StudentService studentService,
                         DepartmentService departmentService) {
        this.studentService = studentService;
        this.departmentService = departmentService;
    }

    // Use case: create student with department
    public Student createStudent(Student student, Long departmentId) {

        Department department = departmentService.getDepartmentById(departmentId);

        if (department == null) {
            return null;
        }

        student.setDepartment(department);
        return studentService.addStudent(student);
    }

    // Use case: update student with department
    public Student updateStudent(Student student, Long departmentId) {

        Department department = departmentService.getDepartmentById(departmentId);

        if (department == null) {
            return null;
        }

        student.setDepartment(department);
        return studentService.updateStudent(student);
    }
}

