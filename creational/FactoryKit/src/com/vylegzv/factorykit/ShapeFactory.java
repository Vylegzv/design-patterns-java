package com.vylegzv.factorykit;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * A functional interface implementing the Factory Kit (map of factories)
 * pattern.
 * 
 * @author vella
 *
 */
public interface ShapeFactory {

  Shape create(ShapeType shapeType);

  static ShapeFactory shapeFactory(Consumer<ShapeBuilder> consumer) {
    Map<ShapeType, Supplier<Shape>> map = new HashMap<>();
    consumer.accept(map::put);
    return shapeType -> map.get(shapeType).get();
  }
}
