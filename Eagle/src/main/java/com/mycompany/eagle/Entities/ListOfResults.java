/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eagle.Entities;

import java.util.ArrayList;

/**
 *
 * @author Serasel
 */
public class ListOfResults {
    private ArrayList<Result> results;

    public ListOfResults(ArrayList<Result> results) {
        this.results = results;
    }

    public ListOfResults() {
    }
    
    

    public ArrayList<Result> getResults() {
        return results;
    }

    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }
    
    
}
