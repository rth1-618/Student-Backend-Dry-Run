package com.example.testS.sbmongotutorial.controller;

import com.example.testS.sbmongotutorial.model.Student;
import com.example.testS.sbmongotutorial.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents(){
       return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/{sid}")
    public ResponseEntity<Student> getStudentBySID(@PathVariable String sid){
        return ResponseEntity.ok(studentService.getStudentBySID(sid));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteStudent(@PathVariable String id) {
        studentService.deleteStudent(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
