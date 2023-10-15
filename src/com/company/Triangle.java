package com.company;

public class Triangle extends Figure{
  public final double a;
  public final double b;
  public final double c;
  private String color;

  public Triangle(double a, double b, double c, String color) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.color = color;
  }

  @Override
  public double getSquare() {
    double perimeter = getPerimeter();
    return Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
  }

  @Override
  public double getPerimeter() {
    return a + b + c;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
