package com.example.cmput301w23t02;

public abstract class shape {
    String color = "blue";
    private int x = 0, y = 0;
    public shape(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

public class rectangle extends shape {
    public rectange(int x, int y){
        super(x, y);
    }
}

