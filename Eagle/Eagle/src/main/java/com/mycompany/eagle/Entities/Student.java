/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eagle.Entities;

/**
 *
 * @author Serasel
 */
public class Student {

    private String stu_course, stu_id, stu_name;

    public Student() {
    }

    public Student(String stu_course, String stu_id, String stu_name) {
        this.stu_course = stu_course;
        this.stu_id = stu_id;
        this.stu_name = stu_name;
    }

    public String getStu_course() {
        return stu_course;
    }

    public void setStu_course(String stu_course) {
        this.stu_course = stu_course;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

}
