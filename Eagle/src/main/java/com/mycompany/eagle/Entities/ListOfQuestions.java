/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eagle.Entities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mycompany.eagle.Utilities.FirebaseCaller;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


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

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
    

    public ListOfQuestions readQuestions() throws FileNotFoundException, IOException, 
            ParseException {
        //Read list of questions in file then save in an arraylist 
        JSONObject obj = (JSONObject) new JSONParser()
                .parse(new FileReader("ListOfQuestions.json")); 
        GsonBuilder gsonBuilder = new GsonBuilder();
        QuestionsDeserializer deserializer = new QuestionsDeserializer();
        gsonBuilder.registerTypeAdapter(ListOfQuestions.class, deserializer);
         
        Gson customGson = gsonBuilder.create();
        System.out.println(obj.toJSONString());
        ListOfQuestions questionList = customGson.fromJson(obj.toJSONString(), 
                 ListOfQuestions.class);
         
        return questionList;
    }
    
    //CREATE FUNCTION FOR DELETING A QUESTION VIA PARSING
    public void deleteQuestion (String id) throws FileNotFoundException, 
            IOException, ParseException {
        JsonObject obj = (JsonObject) new Gson().fromJson(new FileReader(
                "ListOfQuestions.json"), JsonObject.class);
        obj.getAsJsonObject("questions").remove(id);
        
        FileWriter jsonFile = new FileWriter("ListOfQuestions.json");
        jsonFile.write(new Gson().toJson(obj));
        jsonFile.flush();
    }
    
    public Question searchQuestion (String id) throws FileNotFoundException {
        JsonObject obj = (JsonObject) new Gson().fromJson(new FileReader(
                "ListOfQuestions.json"), JsonObject.class);
        JsonObject question_obj = obj.getAsJsonObject("questions")
                .getAsJsonObject(id);
        
        Question question = new Gson().fromJson(question_obj, Question.class);
        return question;
    }
    
    public String saveQuestions(ListOfQuestions readQuestions){
        GsonBuilder gsonBuilder = new GsonBuilder();
        QuestionSerializer serializer = new QuestionSerializer();
        gsonBuilder.registerTypeAdapter(ListOfQuestions.class, serializer);
        Gson customGson = gsonBuilder.create();
        return customGson.toJson(readQuestions);
    }

  
    public static class QuestionsDeserializer implements JsonDeserializer<ListOfQuestions>{

        @Override
        public ListOfQuestions deserialize(JsonElement je, java.lang.reflect.Type type, 
                JsonDeserializationContext jdc) throws JsonParseException {
            
            JsonObject jsonObject = je.getAsJsonObject();
            JsonObject questionObj = jsonObject.getAsJsonObject("questions");
            
            Set<Map.Entry<String, JsonElement>> objects = questionObj.entrySet();
             
            ListOfQuestions listOfQuestions = new ListOfQuestions();
            ArrayList<Question> questions = new ArrayList<>();
            Gson gson = new Gson();

            for (Map.Entry<String, JsonElement> entry : objects) {
                JsonElement jsonElement = entry.getValue();
                Question question = gson.fromJson(jsonElement,
                        Question.class);
                questions.add(question);
            }

            listOfQuestions.setQuestions(questions);
            return listOfQuestions;  
        }     
    }
    
     public class QuestionSerializer implements JsonSerializer<ListOfQuestions>{
   
        @Override
        public JsonElement serialize(ListOfQuestions t, Type type, 
                JsonSerializationContext jsc) {
            
            JsonObject jsonObject = new JsonObject();
            JsonObject jsonQuestionsList = new JsonObject();
            
            jsonObject.add("questions", jsonQuestionsList);
            
            for (Question question : t.getQuestions()){
                JsonObject questionObj = new JsonObject();
                questionObj.addProperty("q_a", question.getQ_a());
                questionObj.addProperty("q_b", question.getQ_b());
                questionObj.addProperty("q_c", question.getQ_c());
                questionObj.addProperty("q_d", question.getQ_d());
                
                questionObj.addProperty("q_question", question.getQ_question());
                questionObj.addProperty("q_rationale", question.getQ_rationale());
                questionObj.addProperty("q_answer", question.getQ_answer());
                questionObj.addProperty("q_uid", question.getQ_uid());
                
                questionObj.addProperty("course", question.getCourse());
                questionObj.addProperty("subject", question.getSubject());
                questionObj.addProperty("topic", question.getTopic());
                questionObj.addProperty("difficulty", question.getDifficulty());
                questionObj.addProperty("keywords", question.getKeywords());
                
                jsonQuestionsList.add(question.getQ_uid(), questionObj);
            }

            return jsonObject;
        }
    }
}
