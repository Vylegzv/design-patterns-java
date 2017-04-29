package com.vylegzv.factory.method;

/**
 * The Factory Method is a creational design pattern that defines an interface
 * or abstract class for creating an object but defers the concrete class
 * instantiation to subclasses.
 * <p>
 * Advantages:
 * <ul>
 * <li>Loose-coupling: the client code interacts with an interface or abstract
 * class, not implementation. So the client code will not need to modify its
 * logic and will just work with any classes that implement that interface or
 * extend that abstract class.
 * <li>Maintaining code is easier since the object creation is centralized
 * <li>Code is consistent, making every client code to follow a specific set of
 * rules when creating an object
 * </ul>
 * <p>
 * Uses:
 * <ul>
 * <li>when a class doesn't know in advance what subclasses will be needed to
 * create
 * <li>when a class prefers its subclasses to specify the objects it creates
 * <li>when parent classes delegate the creation of objects to their subclasses
 * </ul>
 * <p>
 * In this example of Factory Method pattern, the {@link ShapeFactory} interface
 * has a {@link ShapeFactory#createShape} method for creating {@link Shape}
 * objects of a certain {@link Color}. The concrete {@link CircleFactory},
 * {@link SquareFactory} subclasses override the method to produce concrete
 * {@link Circle}, {@link Square} objects.
 * 
 * @author vella
 *
 */
public class FactoryMethodExample {

  private final ShapeFactory shapeFactory;


  /**
   * Instantiates a {@link FactoryMethodExample} that uses {@link ShapeFactory}
   * to create {@link Shape} objects, without concerning itself about which
   * concrete implementation of {@link ShapeFactory} it is using.
   *
   * @param shapeFactory the shape factory
   */
  public FactoryMethodExample(ShapeFactory shapeFactory) {
    this.shapeFactory = shapeFactory;
  }

  public static void main(String[] args) {
    // create circles
    FactoryMethodExample main = new FactoryMethodExample(new CircleFactory());
    main.createShape(Color.BLUE);
    main.createShape(Color.GREEN);

    // now create squares
    main = new FactoryMethodExample(new SquareFactory());
    main.createShape(Color.RED);
    main.createShape(Color.YELLOW);
  }

  private void createShape(Color color) {
    Shape shape;
    shape = shapeFactory.createShape(color);
    System.out.println(shape.toString());
  }
}
