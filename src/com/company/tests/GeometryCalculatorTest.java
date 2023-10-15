package com.company.tests;

import com.company.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class GeometryCalculatorTest {

  @Test
  void calculatePerimeters() {
    Figure rectangle = new Rectangle(10, 2, "ffffff");
    Figure triangle = new Triangle(2, 3, 5, "ffffff");
    Figure circle = new Circle(9,  "ffffff");
    Collection<Figure> figures = new ArrayList<>();
    figures.add(rectangle);
    figures.add(triangle);
    figures.add(circle);
    assertEquals(
            GeometryCalculator.calculatePerimeters(figures),
            rectangle.getPerimeter() + triangle.getPerimeter() + circle.getPerimeter()
    );
  }

  @Test
  void calculateSquares() {
    Figure rectangle = new Rectangle(10, 2, "ffffff");
    Figure triangle = new Triangle(2, 3, 5, "ffffff");
    Figure circle = new Circle(9,  "ffffff");
    Collection<Figure> figures = new ArrayList<>();
    figures.add(rectangle);
    figures.add(triangle);
    figures.add(circle);
    assertEquals(
            GeometryCalculator.calculateSquares(figures),
            rectangle.getSquare() + triangle.getSquare() + circle.getSquare()
    );
  }
}