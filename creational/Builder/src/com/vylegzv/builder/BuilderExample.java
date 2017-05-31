package com.vylegzv.builder;

/**
 * The Builder pattern is a creational design pattern that helps in building a
 * complex object using a step by step approach without defining constructors
 * that require many parameters. It separates a construction of a complex object
 * from its representation so that the same construction process can create
 * different object representations.
 * <p>
 * Advantages:
 * <ul>
 * <li>Separation between object construction and representation.
 * <li>Better control over construction process.
 * <li>Avoids creation of numerous constructors.
 * <li>Allows to vary an object's internal representation.
 * </ul>
 * <p>
 * Disadvantages:
 * <ul>
 * <li>Requires creating a new builder instance each time when creating a
 * different object.
 * </ul>
 * <p>
 * Uses:
 * <ul>
 * <li>when an algorithm for creating a complex object should be independent of
 * object's components and how they are assembled
 * <li>when an object construction process must allow different representations
 * for the constructed object
 * <p>
 * In this example of a Builder pattern, we are creating a car {@link Car} with
 * required configurations (model and color) and optional configurations
 * (package and accessories). The {@link CarBuilder} class aids in construction
 * of a complex car object. It takes the required parameters ({@link Model} and
 * {@link Color}) in its constructor to build a car with default configurations.
 * We can then use {@link CarBuilder} interface methods to build additional
 * configurations ({@link Package} and/or multiple {@link Accessory}). Once we
 * are done, the {@link CarBuilder#build} method is called to return a
 * constructed {@link Car} object.
 * 
 * @author vella
 *
 */
public class BuilderExample {

  public static void main(String[] args) {

    Car convertible = new Car.CarBuilder(Model.CONVERTIBLE, Color.BLUE)
        .withPackage(new NavigationPackage()).build();

    System.out.println(convertible.toString());

    Car anotherConvertible = new Car.CarBuilder(Model.CONVERTIBLE, Color.SILVER)
        .withAccessory(Accessory.SIDE_MOLDINGS)
        .withAccessory(Accessory.PAINT_PROTECTION).build();

    System.out.println(anotherConvertible.toString());

    Car sedan = new Car.CarBuilder(Model.SEDAN, Color.BLACK)
        .withPackage(new LuxuryPackage())
        .withAccessory(Accessory.PAINT_PROTECTION)
        .withAccessory(Accessory.SIDE_MOLDINGS).build();

    System.out.println(sedan.toString());

    Car coupe = new Car.CarBuilder(Model.COUPE, Color.RED)
        .withPackage(new SportPackage()).withAccessory(Accessory.REAR_SPOILER)
        .build();

    System.out.println(coupe.toString());

    System.out.println();
  }
}
