package com.company;

public abstract class Figure {
  private String color;

  abstract public double getSquare();

  abstract public double getPerimeter();

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
