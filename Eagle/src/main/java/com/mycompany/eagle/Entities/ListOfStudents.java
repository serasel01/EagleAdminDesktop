/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eagle.Entities;

import java.util.ArrayList;
import java.util.List;


public class ListOfStudents {
    private ArrayList<Student> students;
    
    public ListOfStudents() {
    }
    
    public ListOfStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> student) {
        this.students = student;
    }
    
}


