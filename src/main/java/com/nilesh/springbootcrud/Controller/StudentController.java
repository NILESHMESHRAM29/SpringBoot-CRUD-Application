package com.nilesh.springbootcrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nilesh.springbootcrud.Entity.StudentInfo;
import com.nilesh.springbootcrud.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/view/all")
    public List<StudentInfo> getAllStudents(){
        return studentService.getallStudents();
    }

    @GetMapping("/view/{id}")
    public StudentInfo getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @PostMapping("/add")
    public StudentInfo addStudent(@RequestBody StudentInfo studentInfo){
        return studentService.addStudent(studentInfo);
    }

    @PutMapping("/update/{id}")
    public StudentInfo updateStudent(@PathVariable Long id, @RequestBody StudentInfo studentInfo){
        return studentService.updateStudent(id, studentInfo);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        return studentService.deleteStudent(id);
    }
}
