/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eagle.Entities;

import java.util.ArrayList;

public class Question {
    private String q_a, q_b, q_c, q_d, q_question, q_rationale, q_answer, q_uid, 
            course, subject, topic, difficulty, keywords, isPublished, q_imagePath;

    public void setQ_a(String q_a) {
        this.q_a = q_a;
    }

    public void setQ_b(String q_b) {
        this.q_b = q_b;
    }

    public void setQ_c(String q_c) {
        this.q_c = q_c;
    }

    public void setQ_d(String q_d) {
        this.q_d = q_d;
    }

    public void setQ_question(String q_question) {
        this.q_question = q_question;
    }

    public void setQ_rationale(String q_rationale) {
        this.q_rationale = q_rationale;
    }

    public void setQ_answer(String q_answer) {
        this.q_answer = q_answer;
    }

    public void setQ_uid(String q_uid) {
        this.q_uid = q_uid;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Question(String q_a, String q_b, String q_c, String q_d, 
            String q_question, String q_rationale, String q_answer, String q_uid) {
        this.q_a = q_a;
        this.q_b = q_b;
        this.q_c = q_c;
        this.q_d = q_d;
        this.q_question = q_question;
        this.q_rationale = q_rationale;
        this.q_answer = q_answer;
        this.q_uid = q_uid;
    }

    public Question(String q_a, String q_b, String q_c, String q_d, String q_question, 
            String q_rationale, String q_answer, String q_uid, String course, 
            String subject, String topic, String difficulty, String keywords) {
        this.q_a = q_a;
        this.q_b = q_b;
        this.q_c = q_c;
        this.q_d = q_d;
        this.q_question = q_question;
        this.q_rationale = q_rationale;
        this.q_answer = q_answer;
        this.q_uid = q_uid;
        this.course = course;
        this.subject = subject;
        this.topic = topic;
        this.difficulty = difficulty;
        this.keywords = keywords;
    }

    public Question(String q_a, String q_b, String q_c, String q_d, 
            String q_question, String q_rationale, String q_answer, 
            String q_uid, String course, String subject, String topic, 
            String difficulty, String keywords, String isPublished) {
        this.q_a = q_a;
        this.q_b = q_b;
        this.q_c = q_c;
        this.q_d = q_d;
        this.q_question = q_question;
        this.q_rationale = q_rationale;
        this.q_answer = q_answer;
        this.q_uid = q_uid;
        this.course = course;
        this.subject = subject;
        this.topic = topic;
        this.difficulty = difficulty;
        this.keywords = keywords;
        this.isPublished = isPublished;
    }

    public Question(String q_a, String q_b, String q_c, String q_d, 
            String q_question, String q_rationale, String q_answer, 
            String q_uid, String course, String subject, String topic, 
            String difficulty, String keywords, String isPublished, 
            String q_imagePath) {
        this.q_a = q_a;
        this.q_b = q_b;
        this.q_c = q_c;
        this.q_d = q_d;
        this.q_question = q_question;
        this.q_rationale = q_rationale;
        this.q_answer = q_answer;
        this.q_uid = q_uid;
        this.course = course;
        this.subject = subject;
        this.topic = topic;
        this.difficulty = difficulty;
        this.keywords = keywords;
        this.isPublished = isPublished;
        this.q_imagePath = q_imagePath;
    }

    public String getQ_imagePath() {
        return q_imagePath;
    }

    public void setQ_imagePath(String q_imagePath) {
        this.q_imagePath = q_imagePath;
    }
    
    public String getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(String isPublished) {
        this.isPublished = isPublished;
    }

    public String getKeywords() {
        return keywords;
    }

    public String getQ_a() {
        return q_a;
    }

    public String getQ_b() {
        return q_b;
    }

    public String getQ_c() {
        return q_c;
    }

    public String getQ_d() {
        return q_d;
    }

    public String getQ_question() {
        return q_question;
    }

    public String getQ_rationale() {
        return q_rationale;
    }

    public String getQ_answer() {
        return q_answer;
    }

    public String getQ_uid() {
        return q_uid;
    }

    public String getCourse() {
        return course;
    }

    public String getSubject() {
        return subject;
    }

    public String getTopic() {
        return topic;
    }

    public String getDifficulty() {
        return difficulty;
    }
    
    
    
    
    
    
}
