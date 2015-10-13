package com.example.app.model;

import java.util.List;

public class DemoApp {
    
    public static void main(String[] args){
        // g an xxxxxxxxxxxxxxxxxxxinstance of the Model
        Model model = Model.getInstance();
        
        // now you have the instance of the model, get the data from the model. 
        List<Programmer> programmers = model.getProgrammers();
        
        // note this program will appear to do nothing at the moment when you run it. 
        
        
    }
    
}
