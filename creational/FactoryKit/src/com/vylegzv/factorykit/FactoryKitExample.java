package com.vylegzv.factorykit;

/**
 * Factory Kit is a creational design pattern that uses separate builder and
 * factory interfaces to separate the mutable part from the immutable part.
 * <p>
 * Advantages:
 * <ul>
 * <li>The processes of building and creating objects are independent, allowing
 * for separation of mutable from immutable.
 * <li>The client application is restricted to only registering the predefined
 * builders but not creating them.
 * <li>The pattern can be implemented by using only lambda's since both builder
 * and factory are functional interfaces.
 * </ul>
 * <p>
 * Uses:
 * <ul>
 * <li>when you want to explicitly define the types of objects for the factory
 * to create
 * <li>when you want to separate the process of building and creating objects
 * (e.g. when you don't want to let the user to create the builder, but let the
 * user to register a builder created by you and have access to only a factory
 * object)
 * <li>when a class doesn't know in advance what types of objects it will need
 * to create
 * </ul>
 * <p>
 * In this example of Factory Kit pattern, the {@link ShapeBuilder} is used to
 * build {@link Shape} objects. Different builders for different {@link Shape}
 * types are registered with the {@link ShapeFactory}, which actually creates
 * the {@link Shape} objects.
 * 
 * @author vella
 *
 */
public class FactoryKitExample {

  public static void main(String[] args) {
    ShapeFactory shapeFactory = ShapeFactory.shapeFactory(shapeBuilder -> {
      shapeBuilder.register(ShapeType.CIRCLE, Circle::new);
      shapeBuilder.register(ShapeType.RECTANGLE, Rectangle::new);
      shapeBuilder.register(ShapeType.SQUARE, Square::new);
      shapeBuilder.register(ShapeType.TRIANGLE, Triangle::new);
    });

    Shape shape = shapeFactory.create(ShapeType.CIRCLE);
    System.out.println(shape.toString());

    shape = shapeFactory.create(ShapeType.TRIANGLE);
    System.out.println(shape.toString());
  }
}
