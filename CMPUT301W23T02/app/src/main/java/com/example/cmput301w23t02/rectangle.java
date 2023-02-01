package com.example.cmput301w23t02;

public class rectangle extends shape {
    public rectangle(int x, int y){
        super(x, y);
    }
    public int rectangle_area(){
        return x * y ;
    }
    public String message(){
        return "just practicing";
    }

}