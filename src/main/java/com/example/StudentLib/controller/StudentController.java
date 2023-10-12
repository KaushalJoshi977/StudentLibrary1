package com.example.StudentLib.controller;

import com.example.StudentLib.Modals.Student;
import com.example.StudentLib.repositories.StudentRepository;
import com.example.StudentLib.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public void addStudent(@RequestBody Student student){
       studentService.addStudent(student);
    }
    @GetMapping("/get/{id}")
    public Student getStudent(@PathVariable("id") int id){
        return studentService.getStudent(id);
    }
    @PutMapping("/update")
    public Student update(@RequestParam int id,
                          @RequestParam String name){
        return studentService.updateStudent(id,name);
    }
    @DeleteMapping("/delete")
    public String delete(@RequestParam int id){
        return studentService.deleteStudent(id);
    }
}
