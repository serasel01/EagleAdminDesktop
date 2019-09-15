
package com.mycompany.eagle.Entities;

import java.util.ArrayList;

public class Result {
    private String res_corrects, res_date, res_difficulty, res_percent, 
            res_questions, res_subject, res_tsMillis, res_wrongs, course; 
    private ArrayList<String> subtopics;

    public Result(String res_corrects, String res_date, String res_difficulty, 
            String res_percent, String res_questions, String res_subject, 
            String res_tsMillis, String res_wrongs, ArrayList<String> subtopics, 
            String course) {
        this.res_corrects = res_corrects;
        this.res_date = res_date;
        this.res_difficulty = res_difficulty;
        this.res_percent = res_percent;
        this.res_questions = res_questions;
        this.res_subject = res_subject;
        this.res_tsMillis = res_tsMillis;
        this.res_wrongs = res_wrongs;
        this.subtopics = subtopics;
        this.course = course;
    }

    public Result() {
    }
    
    public String getCourse() {
        return course;
    }

    public String getRes_corrects() {
        return res_corrects;
    }

    public void setRes_corrects(String res_corrects) {
        this.res_corrects = res_corrects;
    }

    public String getRes_date() {
        return res_date;
    }

    public void setRes_date(String res_date) {
        this.res_date = res_date;
    }

    public String getRes_difficulty() {
        return res_difficulty;
    }

    public void setRes_difficulty(String res_difficulty) {
        this.res_difficulty = res_difficulty;
    }

    public String getRes_percent() {
        return res_percent;
    }

    public void setRes_percent(String res_percent) {
        this.res_percent = res_percent;
    }

    public String getRes_questions() {
        return res_questions;
    }

    public void setRes_questions(String res_questions) {
        this.res_questions = res_questions;
    }

    public String getRes_subject() {
        return res_subject;
    }

    public void setRes_subject(String res_subject) {
        this.res_subject = res_subject;
    }

    public String getRes_tsMillis() {
        return res_tsMillis;
    }

    public void setRes_tsMillis(String res_tsMillis) {
        this.res_tsMillis = res_tsMillis;
    }

    public String getRes_wrongs() {
        return res_wrongs;
    }

    public void setRes_wrongs(String res_wrongs) {
        this.res_wrongs = res_wrongs;
    }

    public ArrayList<String> getSubtopics() {
        return subtopics;
    }

    public void setSubtopics(ArrayList<String> subtopics) {
        this.subtopics = subtopics;
    }

}
