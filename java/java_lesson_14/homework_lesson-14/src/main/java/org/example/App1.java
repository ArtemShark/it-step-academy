package org.example;

import org.example.Task1.Rectangle;
import org.example.Task1.Rhombus;
import org.example.Task1.Square;
import org.example.Task1.Triangle;

public class App1 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 5);
        Rectangle rectangle = new Rectangle(10, 5);
        Square square = new Square(10);
        Rhombus rhombus = new Rhombus(10, 8);

        System.out.println("Area of a triangle with base 10 and height 5: " + triangle.area());
        System.out.println("Area of a rectangle with sides 10 and 5: " + rectangle.area());
        System.out.println("Area of a square with side 10: " + square.area());
        System.out.println("Area of a rhombus with diagonals 10 and 8: " + rhombus.area());
    }
}

