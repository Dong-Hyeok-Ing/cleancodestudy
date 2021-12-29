package com.example.cleancode.chapter_five.geometryobjectimproving;

import org.springframework.data.geo.Point;
import org.springframework.data.geo.Shape;

public class Rectangle implements Shape{
    public Point topLeft;
    public double height;
    public double width;

    public double area() {
        return height * width;
    }
}
