package com.studentapp.studentapplication.entity;

import jakarta.persistence.*;


@Entity
@Table(name="student")
public class Student {

    @Id
    @Column(name="student_id",length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentid;

    @Column(name="student_name",length = 50)
    private String studentname;


    @Column(name="address",length = 100)
    private String address;

    @Column(name="mobile",length = 100)
    private int  mobile;


    @Column(name="active",columnDefinition = "TINYINT default 1")
    private boolean  active;


    public Student(int studentid, String studentname, String address, int mobile, boolean active) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.address = address;
        this.mobile = mobile;
        this.active = active;
    }

    public Student (String studentname, String address, int mobile, boolean active) {

        this.studentname = studentname;
        this.address = address;
        this.mobile = mobile;
        this.active = active;
    }




    public Student() {
    }


    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", studentname='" + studentname + '\'' +
                ", address='" + address + '\'' +
                ", mobile=" + mobile +
                ", active=" + active +
                '}';
    }
}