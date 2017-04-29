package com.vylegzv.factory.method;

/**
 * The interface for creating shapes.
 * 
 * @author vella
 *
 */
public interface ShapeFactory {

  Shape createShape(Color color);
}
