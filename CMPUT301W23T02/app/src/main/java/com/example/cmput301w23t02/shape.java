package com.example.cmput301w23t02;

import android.graphics.drawable.shapes.Shape;

public abstract class shape {
    String color = "blue";
    protected int x = 0, y = 0;
    public shape(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
