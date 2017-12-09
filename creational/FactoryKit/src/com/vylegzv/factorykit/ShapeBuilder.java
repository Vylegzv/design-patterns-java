package com.vylegzv.factorykit;

import java.util.function.Supplier;

/**
 * A functional interface that helps to register a specific builder with the
 * factory.
 * 
 * @author vella
 *
 */
public interface ShapeBuilder {
  void register(ShapeType shapeType, Supplier<Shape> supplier);
}
