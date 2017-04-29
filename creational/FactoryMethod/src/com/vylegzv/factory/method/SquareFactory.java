package com.vylegzv.factory.method;

/**
 * A concrete subclass of ShapeFactory for creating square shape objects.
 * 
 * @author vella
 *
 */
public class SquareFactory implements ShapeFactory {

  @Override
  public Shape createShape(Color color) {
    return new Square(color);
  }

}
