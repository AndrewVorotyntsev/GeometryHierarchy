package com.company;

public class Rectangle extends Figure {
  public final double height;
  public final double width;
  private String color;

  public Rectangle(double height, double width, String color) {
    this.height = height;
    this.width = width;
    this.color = color;
  }

  public double getSquare() {
    return height * width;
  }

  public double getPerimeter() {
    return 2 * (height + width);
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
