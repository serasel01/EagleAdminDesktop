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
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mycompany.eagle.Entities.ListOfCourses;
import com.mycompany.eagle.Entities.Question;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.util.ArrayList;
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
        response = firebase.get();
        return response.getRawBody().replaceAll("^\"|\"$", "");
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
        response = firebase.get();
        GsonBuilder gsonBuilder = new GsonBuilder();
        StudentDeserializer deserializer = new StudentDeserializer();
        gsonBuilder.registerTypeAdapter(ListOfStudents.class, deserializer);

        Gson customGson = gsonBuilder.create();
        ListOfStudents customObject = customGson.fromJson(response.getRawBody()
                .replaceAll("^\"|\"$", ""), ListOfStudents.class);
        
        return customObject.getStudents();
    }
    
    public void addQuestion(Question question) throws FirebaseException, 
            UnsupportedEncodingException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        QuestionSerializer serializer = new QuestionSerializer();
        gsonBuilder.registerTypeAdapter(Question.class, serializer);
        
        Gson customGson = gsonBuilder.create();
        System.out.println(customGson.toJson(question));
        response = firebase.put("BSECE_Subjects", customGson.toJson(question));
    }
    
    public void addStudent(String id, String name, String course) 
            throws FirebaseException, UnsupportedEncodingException {
        
        Student student = new Student(course, id, name);
        response = firebase.put( id, new Gson().toJson(student));

    }

    public class QuestionSerializer implements JsonSerializer<Question>{
   
        @Override
        public JsonElement serialize(Question t, Type type, 
                JsonSerializationContext jsc) {
            
            JsonObject jsonCourse = new JsonObject();
            JsonObject jsonSubject = new JsonObject();
            JsonObject jsonTopic = new JsonObject();
            JsonObject jsonDifficulty = new JsonObject();
            JsonObject jsonNumber = new JsonObject();
            
            jsonCourse.add("Mathematics", jsonSubject);
            jsonSubject.add("Algebra 1", jsonTopic);
            jsonTopic.add("Easy", jsonDifficulty);
            jsonDifficulty.add("5", jsonNumber);
            jsonNumber.addProperty("q_question", t.getQ_question());
            
            return jsonCourse;
        }
    }

    public class StudentDeserializer implements JsonDeserializer<ListOfStudents> {

        @Override
        public ListOfStudents deserialize(JsonElement json, Type type,
                JsonDeserializationContext jdc) throws JsonParseException {

            JsonObject jsonObject = json.getAsJsonObject();
            Set<Entry<String, JsonElement>> objects = jsonObject.entrySet();

            ListOfStudents listOfStudents = new ListOfStudents();
            ArrayList<Student> students = new ArrayList<>();
            Gson gson = new Gson();

            for (Entry<String, JsonElement> entry : objects) {
                JsonElement jsonElement = entry.getValue();
                Student info = gson.fromJson(jsonElement,
                        Student.class);
                students.add(info);
            }

            listOfStudents.setStudents(students);
            return listOfStudents;
        }

    }

}
