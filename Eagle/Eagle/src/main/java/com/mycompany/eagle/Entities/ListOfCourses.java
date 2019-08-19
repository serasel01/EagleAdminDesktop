/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eagle.Entities;

import java.util.ArrayList;


public class ListOfCourses {
    private ArrayList <Course> courses;

    public ListOfCourses() {
    }

    public ListOfCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    
    
    public class Difficulty {
        private ArrayList <Question> questions;

        public Difficulty() {
        }

        public Difficulty(ArrayList<Question> questions) {
            this.questions = questions;
        }
        
        public ArrayList<Question> getQuestions() {
            return questions;
        }
        
    }

    public class Topic {
        private ArrayList <Difficulty> difficulties;

        public Topic() {
        }

        public Topic(ArrayList<Difficulty> difficulties) {
            this.difficulties = difficulties;
        }
        
        
    }

    public class Subject {
        private ArrayList <Topic> topics;

        public Subject() {
        }

        public Subject(ArrayList<Topic> topics) {
            this.topics = topics;
        }
        
        
    }
    
    public class Course {
        private ArrayList <Subject> subjects;

        public Course() {
            
        }

        public Course(ArrayList<Subject> subjects) {
            this.subjects = subjects;
        }
        
        
    }
    
}