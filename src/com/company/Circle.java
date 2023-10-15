package com.company;

public class Circle extends Figure {
  final public double radius;
  private String color;

  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  @Override
  public double getSquare() {
    return Math.PI * Math.pow(radius, 2);
  }

  @Override
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
