package org.example.controller;

import jakarta.websocket.server.PathParam;
import org.example.entity.Student;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> findAllStudent(){
        return studentService.findAllStudent();
    }

    @GetMapping("/{id}")
    public Optional<Student> findStudentById(@PathVariable int id){
        return studentService.findStudentById(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return  studentService.createStudent(student);
    }

    @DeleteMapping("/{id}")
    public Student deleteStudentById(@PathVariable int id){
        studentService.deleteStudent(id);
        return null;
    }

}
