package com.example.testS.sbmongotutorial.service;

import com.example.testS.sbmongotutorial.model.Student;
import com.example.testS.sbmongotutorial.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student student){
        studentRepository.insert(student);
    }

    public void updateStudent(Student student){
        Student savedStudent = studentRepository.findById(student.getId())
                .orElseThrow(() -> new RuntimeException((
                        String.format("Cannot Find student by ID %s", student.getId())
                        )));
        savedStudent.setsID(student.getsID());
        savedStudent.setsName(student.getsName());

        studentRepository.save(savedStudent);
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }


    public Student getStudentBySID(String sid) {
        return studentRepository.findBySID(sid)
                .orElseThrow(() -> new RuntimeException(
                        String.format("Cannot find Student by ID %s", sid)));
    }

    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }
}
