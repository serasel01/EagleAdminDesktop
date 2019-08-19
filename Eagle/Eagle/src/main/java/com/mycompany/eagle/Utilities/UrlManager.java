/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eagle.Utilities;

/**
 *
 * @author Serasel
 */
public class UrlManager {
    private String main_url = "https://eagle-ee1b0.firebaseio.com";

    public UrlManager() {   
    }

    public String setAdmin(String admin_id) {
        return main_url + "/Admins/" + admin_id;
    }
    
    public String setStudents(){
        return main_url + "/Students";
    }
    
    public String setStudent(String student_id){
        return main_url + "/Students/" + student_id;
    }
    
    public String getPassword(){
        return "/ad_password/";
    }
    
    public String getName(){
        return "/ad_name";
    }
    
    public String getMain(){
        return main_url;
    }
    
    
}
