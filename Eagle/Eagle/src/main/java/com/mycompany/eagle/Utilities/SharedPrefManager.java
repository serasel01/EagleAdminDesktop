/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eagle.Utilities;

import java.util.prefs.Preferences;

/**
 *
 * @author Serasel
 */
public class SharedPrefManager {
    private Preferences prefs;
    private String USER_ID = "USER_ID";
    private String USER_NAME = "USER_NAME";

    public SharedPrefManager() {
        prefs = Preferences.userRoot();
    }
    
    public void setId(String id){
        prefs.put(USER_ID, id);
    }
    
    public String getId(){
        return prefs.get(USER_ID, null);
    }
    
    public void setName(String name){
        prefs.put(USER_NAME, name);
    }
    
    public String getName(){
        return prefs.get(USER_NAME, null);
    }
    
}
