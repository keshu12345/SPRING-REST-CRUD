package com.keshu12345.SpringBootRestCRUD.Controller;

import com.keshu12345.SpringBootRestCRUD.customException.StudentErrorResponse;
import com.keshu12345.SpringBootRestCRUD.customException.StudentNotFoundException;
import com.keshu12345.SpringBootRestCRUD.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    List<Student>theStudents;

    @PostConstruct
    public void loadData(){
        theStudents=new ArrayList<>();
        theStudents.add(new Student("Keshav","Rajput"));
        theStudents.add(new Student("Rajesh","gupta"));
        theStudents.add(new Student("Saurabh","Santa"));

    }

    // api/students/{studentId}    this is path variable {studentId}
    @GetMapping("/students")
    public List<Student>getStudents(){
        return theStudents;
    }

    @GetMapping("students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        if(studentId>=theStudents.size()||studentId<0){
            throw new StudentNotFoundException("Student id not found "+studentId);
        }
        return theStudents.get(studentId);
    }

}
