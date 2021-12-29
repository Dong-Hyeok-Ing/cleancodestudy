package com.example.cleancode.chapter_five.geometryobjectimproving;


import org.springframework.data.geo.Point;
import org.springframework.data.geo.Shape;

public class Square implements Shape {
    public Point topLeft;
    public double side;

    public double area() {
        return side * side;
    }
}
