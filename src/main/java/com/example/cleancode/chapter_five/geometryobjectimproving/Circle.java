package com.example.cleancode.chapter_five.geometryobjectimproving;

import org.springframework.data.geo.Point;
import org.springframework.data.geo.Shape;

public class Circle implements Shape{
    public final double PI = 3.141592653589793;
    public Point center;
    public double radius;

    public double area() {
        return PI * radius * radius;
    }
}
