package com.vylegzv.factory.method;

/**
 * Square shape.
 * 
 * @author vella
 *
 */
public class Square implements Shape {

  private Color color;

  public Square(Color color) {
    this.color = color;
  }

  @Override
  public Color getShapeColor() {
    return color;
  }

  @Override
  public String toString() {
    return color + " square";
  }
}
