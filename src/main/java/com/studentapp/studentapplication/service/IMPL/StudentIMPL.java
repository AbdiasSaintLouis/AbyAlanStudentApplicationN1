package com.studentapp.studentapplication.service.IMPL;

import com.studentapp.studentapplication.dto.StudentSaveDTO;
import com.studentapp.studentapplication.entity.Student;
import com.studentapp.studentapplication.repo.StudentRepo;
import com.studentapp.studentapplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentIMPL implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public String addStudent(StudentSaveDTO studentSaveDTO) {

        Student student = new Student(
                studentSaveDTO.getStudentname(),
                studentSaveDTO.getAddress(),
                studentSaveDTO.getMobile(),
                studentSaveDTO.isActive()
        );

        studentRepo.save(student);

        return student.getStudentname();

    }
}
