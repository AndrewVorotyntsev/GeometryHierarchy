package com.company.tests;

import com.company.Figure;
import com.company.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

  @Test
  void getSquare() {
    double a = 10;
    double b = 2;
    double c = 3;
    Figure triangle = new Triangle(a, b, c, "ffffff");
    double perimeter = triangle.getPerimeter();
    double square = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
    assertEquals(triangle.getSquare(), square);
  }

  @Test
  void getPerimeter() {
    double a = 10;
    double b = 2;
    double c = 3;
    Figure triangle = new Triangle(a, b, c, "ffffff");
    assertEquals(triangle.getPerimeter(), a + b + c);
  }

  @Test
  void getColor() {
    String color = "ffffff";
    Figure triangle = new Triangle(1, 1, 1, color);
    assertEquals(triangle.getColor(), color);
  }

  @Test
  void setColor() {
    String color = "ffffff";
    Figure triangle = new Triangle(1, 1, 1, color);
    String newColor = "ffff00";
    triangle.setColor(newColor);
    assertEquals(triangle.getColor(), newColor);
  }
}