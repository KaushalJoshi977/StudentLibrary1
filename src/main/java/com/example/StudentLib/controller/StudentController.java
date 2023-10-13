package com.example.StudentLib.controller;

import com.example.StudentLib.Modals.Student;
import com.example.StudentLib.repositories.StudentRepository;
import com.example.StudentLib.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
       return new ResponseEntity<>(studentService.addStudent(student), HttpStatus.CREATED);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable("id") int id){
        return new ResponseEntity<>(studentService.getStudent(id),HttpStatus.FOUND);
    }
    @PutMapping("/update")
    public ResponseEntity<Student> update(@RequestParam int id,
                          @RequestParam String name){
        return new ResponseEntity<>(studentService.updateStudent(id,name),HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(@RequestParam int id){
        return new ResponseEntity<>(studentService.deleteStudent(id),HttpStatus.OK);
    }
}
