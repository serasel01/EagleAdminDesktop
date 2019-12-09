
package com.mycompany.eagle.Entities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ListOfSubjects {
    private ArrayList<String> subjects, topics;

    public ListOfSubjects() {
    }
    
    public ListOfSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<String> getTopics() {
        return topics;
    }

    public void setTopics(ArrayList<String> topics) {
        this.topics = topics;
    }
    
    public ArrayList<String> readSubjects(String course) 
            throws FileNotFoundException, IOException, ParseException {
        //Read list of questions in file then save in an arraylist 
        JSONObject obj = (JSONObject) new JSONParser()
                .parse(new FileReader("SubjectsAndTopics.json")); 
        GsonBuilder gsonBuilder = new GsonBuilder();
        SubjectsDeserializer deserializer = new SubjectsDeserializer(course);
        gsonBuilder.registerTypeAdapter(ListOfSubjects.class, deserializer);
         
        Gson customGson = gsonBuilder.create();
        ListOfSubjects subjectList = customGson.fromJson(obj.toJSONString(), 
                 ListOfSubjects.class);
         
        return subjectList.getSubjects();
    }
    
    public ArrayList<String> readTopics(String course, String subject) 
            throws FileNotFoundException, IOException, ParseException {
        
        JSONObject obj = (JSONObject) new JSONParser()
                .parse(new FileReader("SubjectsAndTopics.json")); 
        GsonBuilder gsonBuilder = new GsonBuilder();
        SubjectsDeserializer deserializer = new SubjectsDeserializer(course, subject);
        gsonBuilder.registerTypeAdapter(ListOfSubjects.class, deserializer);
         
        Gson customGson = gsonBuilder.create();
        ListOfSubjects subjectList = customGson.fromJson(obj.toJSONString(), 
                 ListOfSubjects.class);
         
        return subjectList.getTopics();
    }

    private static class SubjectsDeserializer implements 
            JsonDeserializer<ListOfSubjects>{
        private String course, subject;
        
        public SubjectsDeserializer() {
        }

        private SubjectsDeserializer(String course) {
             this.course = course;
        }

        private SubjectsDeserializer(String course, String subject) {
            this.course = course;
            this.subject = subject;
        }

        @Override
        public ListOfSubjects deserialize(JsonElement je, Type type, 
                JsonDeserializationContext jdc) throws JsonParseException {
            JsonObject jsonObject = je.getAsJsonObject();
            JsonObject questionObj = jsonObject.getAsJsonObject(course);
            ListOfSubjects listOfSubjects = new ListOfSubjects();
            
            if (subject != null){
                JsonObject subjectObj = questionObj.getAsJsonObject(subject);
                System.out.println(subject);
                Set<Map.Entry<String, JsonElement>> objects = subjectObj.entrySet();
                           
                ArrayList<String> topics = new ArrayList<>();
            
                for (Map.Entry<String, JsonElement> entry : objects) {
                    String topic = entry.getValue().getAsString();
                    topics.add(topic);
                }

                listOfSubjects.setTopics(topics);
                
            } else {
                System.out.println(course);
                Set<Map.Entry<String, JsonElement>> objects = questionObj.entrySet();
                ArrayList<String> subjects = new ArrayList<>();
            
                for (Map.Entry<String, JsonElement> entry : objects) {
                    String subject = entry.getKey();
                    subjects.add(subject);
            }

            listOfSubjects.setSubjects(subjects);
            }
            
            
            return listOfSubjects;            
        }
    }    
}
