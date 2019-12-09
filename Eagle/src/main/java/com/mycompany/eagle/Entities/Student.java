/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eagle.Entities;

import com.google.cloud.storage.Blob;
import java.util.ArrayList;

/**
 *
 * @author Serasel
 */
public class Student {

    private String stu_course, stu_id, stu_name, stu_password, stu_imagePath;  
    private ArrayList <Result> results;
    private int stu_count;

    public String getStu_imagePath() {
        return stu_imagePath;
    }

    public void setStu_imagePath(String stu_imagePath) {
        this.stu_imagePath = stu_imagePath;
    }

    public Student() {
    }
    
    public Student (String stu_id) {
        this.stu_id = stu_id;
    }

    public Student(ArrayList<Result> results) {
        this.results = results;
    }
    
    public Student(String stu_course, String stu_id, String stu_name, 
            String stu_password, int stu_count, String stu_imagePath) {
        this.stu_course = stu_course;
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.stu_password = stu_password;
        this.stu_count = stu_count;
        this.stu_imagePath = stu_imagePath;
    }

    public String getStu_password() {
        return stu_password;
    }

    public void setStu_password(String stu_password) {
        this.stu_password = stu_password;
    }

    public ArrayList<Result> getResults() {
        return results;
    }

    public void setResults(ArrayList<Result> results) {
        this.results = results;
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

    public int getStu_count() {
        return stu_count;
    }

    public void setStu_count(int stu_count) {
        this.stu_count = stu_count;
    }
    
    

}
