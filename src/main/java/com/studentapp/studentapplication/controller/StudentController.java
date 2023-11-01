package com.studentapp.studentapplication.controller;

import com.studentapp.studentapplication.dto.StudentDTO;
import com.studentapp.studentapplication.dto.StudentSaveDTO;
import com.studentapp.studentapplication.dto.StudentUpdateDTO;
import com.studentapp.studentapplication.entity.Student;
import com.studentapp.studentapplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/student")
public class StudentController {


    @Autowired
    private StudentService studentService;

    @PostMapping(path = "/save")
    public String saveStudent(@RequestBody StudentSaveDTO studentSaveDTO)
    {
        String id = studentService.addStudent(studentSaveDTO);
        return id;
    }

    @GetMapping(path = "/getAllStudents")
    public List<StudentDTO> getAllStudent()
    {
        List<StudentDTO> allStudents = studentService.getAllStudents();
        return allStudents;
    }


    @PutMapping(path = "/update")
    public String updateStudent(@RequestBody StudentUpdateDTO studentUpdateDTO)
    {
        String id = studentService.updateStudent(studentUpdateDTO);
        return id;
    }


    @DeleteMapping(path = "/deletestudentid/{id}")
    public String deleteStudent(@PathVariable(value = "id")int id)
    {
        boolean deletestudent = studentService.deleteStudent(id);
        return "deleteddd!!!!!";
    }

}