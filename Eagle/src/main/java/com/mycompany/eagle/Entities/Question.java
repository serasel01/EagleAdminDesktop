/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eagle.Entities;

public class Question {
    private String q_a, q_b, q_c, q_d, q_question, q_rationale, q_answer, q_uid, 
            course, subject, topic, difficulty;

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
            String subject, String topic, String difficulty) {
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
