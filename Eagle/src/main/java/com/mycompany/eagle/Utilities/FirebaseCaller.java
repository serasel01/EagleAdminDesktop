/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eagle.Utilities;

import com.mycompany.eagle.Entities.Student;
import com.mycompany.eagle.Entities.ListOfStudents;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mycompany.eagle.Entities.ListOfCourses;
import com.mycompany.eagle.Entities.ListOfResults;
import com.mycompany.eagle.Entities.Question;
import com.mycompany.eagle.Entities.Result;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import net.thegreshams.firebase4j.error.FirebaseException;
import net.thegreshams.firebase4j.model.FirebaseResponse;
import net.thegreshams.firebase4j.service.Firebase;

public class FirebaseCaller {

    private String url;
    private Firebase firebase;
    private FirebaseResponse response;

    public FirebaseCaller(String url) throws FirebaseException,
            UnsupportedEncodingException {
        this.url = url;
        firebase = new Firebase(url);
    }

    public boolean loginUser(String admin_password) throws FirebaseException,
            UnsupportedEncodingException {
        response = firebase.get();
        return admin_password.equals(response.getRawBody()
                .replaceAll("^\"|\"$", ""));
    }

    public String getUserName() throws FirebaseException,
            UnsupportedEncodingException {
        response = firebase.get(); //firebase.get gets the value which is the response
        return response.getRawBody().replaceAll("^\"|\"$", "");  //replace all removes special characters
    }

    public void deleteStudent() throws FirebaseException, UnsupportedEncodingException {
        response = firebase.delete();
    }

    public Student getStudent() throws FirebaseException, UnsupportedEncodingException {
        response = firebase.get();
        Student student = new Gson().fromJson(response.getRawBody()
                .replaceAll("^\"|\"$", ""), Student.class);
        return student;
    }

    public ArrayList<Student> getStudents() throws FirebaseException,
            UnsupportedEncodingException {
        response = firebase.get(); //gets all information about the students
        
        GsonBuilder gsonBuilder = new GsonBuilder();  //creates a GSON manager
        StudentDeserializer deserializer = new StudentDeserializer(); //used for CRUD operations from a json file
        gsonBuilder.registerTypeAdapter(ListOfStudents.class, deserializer); //requires a class and serializer

        Gson customGson = gsonBuilder.create();
        ListOfStudents customObject = customGson.fromJson(response.getRawBody()
                .replaceAll("^\"|\"$", ""), ListOfStudents.class);

        return customObject.getStudents(); //returns the generated and populated arraylist
    }

    public ArrayList<Result> getResults(String date, String subject) 
            throws FirebaseException,
            UnsupportedEncodingException {
        response = firebase.get();
        GsonBuilder gsonBuilder = new GsonBuilder();
        ResultDeserializer deserializer = new ResultDeserializer(date, subject);
        gsonBuilder.registerTypeAdapter(ListOfResults.class, deserializer);

        Gson customGson = gsonBuilder.create();
        ListOfResults customObject = customGson.fromJson(response.getRawBody()
                .replaceAll("^\"|\"$", ""), ListOfResults.class);

        return customObject.getResults();
    }

//    public void addQuestion(Question question) throws FirebaseException,
//            UnsupportedEncodingException {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        QuestionSerializer serializer = new QuestionSerializer();
//        gsonBuilder.registerTypeAdapter(Question.class, serializer);
//
//        Gson customGson = gsonBuilder.create();
//        System.out.println(customGson.toJson(question));
//        response = firebase.put("BSECE_Subjects", customGson.toJson(question));
//    }

    public void addStudent(String id, String name, String course)
            throws FirebaseException, UnsupportedEncodingException {

        Student student = new Student(course, id, name);
        response = firebase.put(id, new Gson().toJson(student));
    }

    public void publishQuestion(Question question) throws FirebaseException,
            UnsupportedEncodingException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        QuestionSerializer serializer = new QuestionSerializer();
        gsonBuilder.registerTypeAdapter(Question.class, serializer);

        Gson customGson = gsonBuilder.create();
        System.out.println(customGson.toJson(question));
        response = firebase.put(question.getQ_uid(), customGson.toJson(question));
    }
    
    public void publishKeywords(Question question) throws FirebaseException,
            UnsupportedEncodingException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        KeywordSerializer serializer = new KeywordSerializer();
        gsonBuilder.registerTypeAdapter(Question.class, serializer);

        Gson customGson = gsonBuilder.create();
        System.out.println(customGson.toJson(question));
        response = firebase.put(question.getDifficulty(), customGson.toJson(question));
    }

    public class KeywordSerializer implements JsonSerializer<Question>{

        @Override
        public JsonElement serialize(Question t, Type type,
                JsonSerializationContext jsc) {

            JsonObject jsonKeywords = new JsonObject(); 
            
            ArrayList<String> list = new ArrayList<>(Arrays.asList(
                    t.getKeywords().split(", ")));
            
            int count = 1;           
            for (String keyword: list){
                jsonKeywords.addProperty(String.valueOf(count), keyword);
                count++;
            }
            
            return jsonKeywords;
        }
    }

    public class QuestionSerializer implements JsonSerializer<Question> {

        @Override
        public JsonElement serialize(Question t, Type type,
                JsonSerializationContext jsc) {

            JsonObject jsonQuestion = new JsonObject();
            JsonObject jsonKeywords = new JsonObject();      
            jsonQuestion.add("Keywords", jsonKeywords);
                    
            jsonQuestion.addProperty("q_a", t.getQ_a());
            jsonQuestion.addProperty("q_b", t.getQ_b());
            jsonQuestion.addProperty("q_c", t.getQ_c());
            jsonQuestion.addProperty("q_d", t.getQ_d());
            jsonQuestion.addProperty("q_answer", t.getQ_answer());
            jsonQuestion.addProperty("q_question", t.getQ_question());
            jsonQuestion.addProperty("q_rationale", t.getQ_rationale());
            jsonQuestion.addProperty("q_uid", t.getQ_uid());
            
            ArrayList<String> list = new ArrayList<>(Arrays.asList(
                    t.getKeywords().split(", ")));
            
            int count = 1;           
            for (String keyword: list){
                jsonKeywords.addProperty(String.valueOf(count), keyword);
                count++;
            }
            
            return jsonQuestion;
        }
    }

    public class ResultDeserializer implements JsonDeserializer<ListOfResults> {

        private String date, subject;
        
        public ResultDeserializer(String date, String subject) {
            this.date = date;
            this.subject = subject;
        }

        @Override
        public ListOfResults deserialize(JsonElement json, Type type,
                JsonDeserializationContext jdc) throws JsonParseException {

            JsonObject jsonObject = json.getAsJsonObject();
            Set<Entry<String, JsonElement>> objects = jsonObject.entrySet();

            ListOfResults listOfResults = new ListOfResults();
            ArrayList<Result> results = new ArrayList<>();
            Gson gson = new Gson();

            for (Entry<String, JsonElement> entry : objects) {                
                JsonElement jsonElement = entry.getValue();
                
                Result info = gson.fromJson(jsonElement,
                        Result.class);

                ArrayList<String> subtopics = new ArrayList<>();
                JsonArray jsonArray = jsonElement.getAsJsonObject()
                        .get("Subtopics").getAsJsonArray();

                Iterator< JsonElement> itr = jsonArray.iterator();
                itr.next();
                while (itr.hasNext()) { 
                    JsonPrimitive jo = (JsonPrimitive) itr.next();
                    subtopics.add(jo.getAsString());
                }
                
                info.setSubtopics(subtopics);
                System.out.println(info.getRes_subject() + " " + subject);
                System.out.println(info.getRes_date()+ " " + date);
                
                if (subject == null || subject.equals(info.getRes_subject())){
                    System.out.println("nigga i'm in");
                    
                    if (date == null || date.replaceAll("-", "/").equals(info.getRes_date())){
                        System.out.println("ok nigga");
                        results.add(info);
                    }
                }             
            }

            listOfResults.setResults(results);
            return listOfResults;
        }

    }

    public class StudentDeserializer implements JsonDeserializer<ListOfStudents> {

        //parsing of the json file or from firebase
        @Override
        public ListOfStudents deserialize(JsonElement json, Type type,
                JsonDeserializationContext jdc) throws JsonParseException {

            JsonObject jsonObject = json.getAsJsonObject(); //get the whole reference as an object or datasnapshot
            Set<Entry<String, JsonElement>> objects = jsonObject.entrySet(); //define as a list

            //create object
            ListOfStudents listOfStudents = new ListOfStudents(); //class used to receive the whole reference
            ArrayList<Student> students = new ArrayList<>(); //contains the list of students
            Gson gson = new Gson();

            //populate arraylist
            for (Entry<String, JsonElement> entry : objects) { //equivalent of for each in android
                JsonElement jsonElement = entry.getValue(); //get all the info of that student
                Student info = gson.fromJson(jsonElement,
                        Student.class); //makes them into a class
                students.add(info); //adds to arraylist
            }

            //set arraylist to that object
            listOfStudents.setStudents(students); //sets an arraylist to that object
            
            //returns that object
            return listOfStudents;
        }

    }

}
