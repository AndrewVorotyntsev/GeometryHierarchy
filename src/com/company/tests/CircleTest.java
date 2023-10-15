package com.company.tests;

import com.company.Circle;
import com.company.Figure;
import com.company.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

  @Test
  void getSquare() {
    double radius = 10;
    Figure circle = new Circle(radius, "ffffff");
    assertEquals(circle.getSquare(), Math.PI * Math.pow(radius, 2));
  }

  @Test
  void getPerimeter() {
    double radius = 10;
    Figure circle = new Circle(radius, "ffffff");
    assertEquals(circle.getPerimeter(),  2 * Math.PI * radius);
  }

  @Test
  void getColor() {
    String color = "ffffff";
    Figure circle = new Circle(1,  color);
    assertEquals(circle.getColor(), color);
  }

  @Test
  void setColor() {
    String color = "ffffff";
    Figure circle = new Circle(1,  color);
    String newColor = "ffff00";
    circle.setColor(newColor);
    assertEquals(circle.getColor(), newColor);
  }
}