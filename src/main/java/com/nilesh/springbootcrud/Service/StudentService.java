package com.nilesh.springbootcrud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nilesh.springbootcrud.Entity.StudentInfo;
import com.nilesh.springbootcrud.Repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentInfo> getallStudents(){
        return studentRepository.findAll();
    }

    public StudentInfo getStudentById(Long id){
        return studentRepository.findById(id).orElse(null);
    }

    public StudentInfo addStudent(StudentInfo studentInfo){
        return studentRepository.save(studentInfo);
    }

    public StudentInfo updateStudent(Long id, StudentInfo studentInfo){
        StudentInfo existing= studentRepository.findById(id).orElse(studentInfo);
        if(existing != null){
            existing.setName(studentInfo.getName());
            existing.setCourse(studentInfo.getCourse());
            existing.setEmail(studentInfo.getEmail());
            existing.setContact_no(studentInfo.getContact_no());
            return studentRepository.save(existing);
        }
        return null;
    }

    public String deleteStudent(Long id){
        if(studentRepository.existsById(id)){
            studentRepository.deleteById(id);
            return "Student Deleted: "+ id;
        }else{
            return "Student Not Found "+id;
        }
    }
}
