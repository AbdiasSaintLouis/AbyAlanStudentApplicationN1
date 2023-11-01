package com.studentapp.studentapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class StudentSaveDTO {


    private String studentname;
    private String address;
    private int  mobile;
    private boolean  active;
}