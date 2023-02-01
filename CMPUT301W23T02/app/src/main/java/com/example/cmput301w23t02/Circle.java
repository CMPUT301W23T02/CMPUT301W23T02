package com.example.cmput301w23t02;
import static java.lang.Math.*;

public class Circle extends shape {
    private Integer r;
    public Circle(int x, int y) {
        super(x, y);
    }
    public float circle_radius(){
        return (float) (PI * (r^2));
    }
}
