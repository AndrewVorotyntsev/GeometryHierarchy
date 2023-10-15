package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
      Figure rectangle = new Rectangle(10, 2, "ffffff");
      Figure triangle = new Triangle(2, 3, 5, "ffffff");
      Figure circle = new Circle(9,  "ffffff");
      Collection<Figure> figures = new ArrayList<>();
      figures.add(rectangle);
      figures.add(triangle);
      figures.add(circle);
      System.out.println(GeometryCalculator.calculatePerimeters(figures));
      System.out.println(GeometryCalculator.calculateSquares(figures));
    }
}
