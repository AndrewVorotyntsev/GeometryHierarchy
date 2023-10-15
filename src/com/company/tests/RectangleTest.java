package com.company.tests;

import com.company.Figure;
import com.company.Rectangle;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

  @org.junit.jupiter.api.Test
  void getSquare() {
    double height = 10;
    double width = 2;
    Figure rectangle = new Rectangle(height, width, "ffffff");
    assertEquals(rectangle.getSquare(), height * width);
  }

  @org.junit.jupiter.api.Test
  void getPerimeter() {
    double height = 10;
    double width = 2;
    Figure rectangle = new Rectangle(height, width, "ffffff");
    assertEquals(rectangle.getPerimeter(), 2 * (height + width));
  }

  @org.junit.jupiter.api.Test
  void getColor() {
    String color = "ffffff";
    Figure rectangle = new Rectangle(1, 1, color);
    assertEquals(rectangle.getColor(), color);
  }

  @org.junit.jupiter.api.Test
  void setColor() {
    String color = "ffffff";
    Figure rectangle = new Rectangle(1, 1, color);
    String newColor = "ffff00";
    rectangle.setColor(newColor);
    assertEquals(rectangle.getColor(), newColor);
  }
}