package com.example.StudentLib.services;

import com.example.StudentLib.Modals.Student;
import com.example.StudentLib.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public Student getStudent(int id) {
        Student student = studentRepository.findById(id).get();
        return student;
    }

    public Student updateStudent(int id, String name) {
        Student student = studentRepository.findById(id).get();
        student.setName(name);
        return studentRepository.save(student);
    }

    public String deleteStudent(int id) {
        studentRepository.deleteById(id);
        return "student deleted";
    }
}
