package com.vylegzv.factory.method;

/**
 * A concrete subclass of ShapeFactory for creating circle shape objects.
 * 
 * @author vella
 *
 */
public class CircleFactory implements ShapeFactory {

  @Override
  public Shape createShape(Color color) {
    return new Circle(color);
  }
}
