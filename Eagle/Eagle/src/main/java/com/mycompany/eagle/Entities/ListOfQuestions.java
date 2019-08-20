/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eagle.Entities;

import java.util.ArrayList;


public class ListOfQuestions {
    private ArrayList<Question> questions;
    
    public ListOfQuestions() {
    }
    
    public ListOfQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
    
    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setStudents(ArrayList<Question> question) {
        this.questions = question;
    }
}
