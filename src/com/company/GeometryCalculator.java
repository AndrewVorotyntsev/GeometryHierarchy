package com.company;

import java.util.Collection;

public class GeometryCalculator {
  public static double calculatePerimeters(Collection<Figure> figures) {
    double totalPerimeter = 0;
    for(Figure figure : figures) {
      totalPerimeter += figure.getPerimeter();
    }
    return totalPerimeter;
  }

  public static double calculateSquares(Collection<Figure> figures) {
    double totalSquares = 0;
    for(Figure figure : figures) {
      totalSquares += figure.getSquare();
    }
    return totalSquares;
  }
}
