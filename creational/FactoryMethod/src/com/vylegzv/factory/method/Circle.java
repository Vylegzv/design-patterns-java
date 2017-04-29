
package com.vylegzv.factory.method;

/**
 * Circle shape.
 * 
 * @author vella
 *
 */
public class Circle implements Shape {

  private Color color;

  public Circle(Color color) {
    this.color = color;
  }

  @Override
  public Color getShapeColor() {
    return color;
  }

  @Override
  public String toString() {
    return color + " circle";
  }
}
