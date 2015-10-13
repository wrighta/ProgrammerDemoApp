package com.example.app.model;

import java.util.List;

public class DemoApp {
    
    public static void main(String[] args){
        Model model = Model.getInstance();
        
        List<Programmer> programmers = model.getProgrammers();
        
    }
    
}
