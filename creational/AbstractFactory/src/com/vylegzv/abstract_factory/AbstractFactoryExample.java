package com.vylegzv.abstract_factory;

import com.vylegzv.abstract_factory.animals.Animal;
import com.vylegzv.abstract_factory.continent.AfricaContinentFactory;
import com.vylegzv.abstract_factory.continent.AntarcticaContinentFactory;
import com.vylegzv.abstract_factory.continent.AustraliaContinentFactory;
import com.vylegzv.abstract_factory.continent.ContinentFactory;
import com.vylegzv.abstract_factory.continent.EuropeContinentFactory;
import com.vylegzv.abstract_factory.continent.NorthAmericaContinentFactory;
import com.vylegzv.abstract_factory.continent.SouthAmericaContinentFactory;
import com.vylegzv.abstract_factory.mountains.Mountains;
import com.vylegzv.abstract_factory.plants.Plant;
import com.vylegzv.abstract_factory.rivers.River;

/**
 * The Abstract Factory is a creational design pattern that defines an interface
 * or abstract class for creating families of related objects without specifying
 * their concrete subclasses. It is a "factory of factories" that encapsulates
 * individual factories that have a common theme.
 * <p>
 * Advantages:
 * <ul>
 * <li>Loose-coupling: the client code interacts with an interface or abstract
 * class, not implementation. So the client code will not need to modify its
 * logic and will just work with any user-defined concrete product classes.
 * <li>Exchanging product families is easy since a class of a concrete factory
 * appears only once in the client application, where it is instantiated.
 * <li>Abstract Factory enforces consistency among product objects; the objects
 * in a family are designed to work together, and an application uses objects
 * from only one family at a time.
 * </ul>
 * <p>
 * Disadvantages:
 * <ul>
 * <li>Adding new products is cumbersome since the Abstract Factory interface
 * provides a fixed set of objects that can be created; supporting new kinds of
 * objects requires extending the factory interface, which means changing the
 * Abstract Factory class and all its subclasses.
 * </ul>
 * <p>
 * Uses:
 * <ul>
 * <li>when a system needs to be independent from the way its objects are
 * created
 * <li>when a system should be configured with multiple families of objects
 * <li>when a family of related objects is designed to be only used together
 * <li>when a system needs to interact with a library of product objects, which
 * should reveal only their interfaces, not implementation
 * </ul>
 * <p>
 * In this example of Abstract Factory pattern, the {@link ContinentFactory}
 * interface has a {@link ContinentFactory#createMountains},
 * {@link ContinentFactory#createRiver}, {@link ContinentFactory#createPlants},
 * and {@link ContinentFactory#createAnimals} methods for creating
 * {@link Mountains}, {@link River}, {@link Plant}, and {@link Animal} objects.
 * The concrete factory implementations ({@link AfricaContinentFactory},
 * {@link AntarcticaContinentFactory}, {@link AsiaContinentFactory},
 * {@link AustraliaContinentFactory}, {@link AsiaContinentFactory},
 * {@link EuropeContinentFactory}, {@link NorthAmericaContinentFactory},
 * {@link SouthAmericaContinentFactory}) create concrete mountains, rivers,
 * plants, and animals specific for each continent.
 * 
 * @author vella
 *
 */
public class AbstractFactoryExample {

  private final ContinentFactory continentFactory;
  private Mountains mountains;
  private River river;
  private Plant[] plants;
  private Animal[] animals;

  public AbstractFactoryExample(ContinentFactory continentFactory) {
    this.continentFactory = continentFactory;
  }

  public static void main(String[] args) {
    // create North America
    AbstractFactoryExample example =
        new AbstractFactoryExample(new NorthAmericaContinentFactory());
    example.createContinent();
    example.printContinentDetails("North America");

    // create Europe
    example = new AbstractFactoryExample(new EuropeContinentFactory());
    example.createContinent();
    example.printContinentDetails("Europe");

    // create Africa
    example = new AbstractFactoryExample(new AfricaContinentFactory());
    example.createContinent();
    example.printContinentDetails("Africa");

    // create South America
    example = new AbstractFactoryExample(new SouthAmericaContinentFactory());
    example.createContinent();
    example.printContinentDetails("South America");

    // create Australia
    example = new AbstractFactoryExample(new AustraliaContinentFactory());
    example.createContinent();
    example.printContinentDetails("Australia");

    // create Asia
    example = new AbstractFactoryExample(new AustraliaContinentFactory());
    example.createContinent();
    example.printContinentDetails("Asia");

    // create Antarctica
    example = new AbstractFactoryExample(new AntarcticaContinentFactory());
    example.createContinent();
    example.printContinentDetails("Antarctica");
  }

  private void createContinent() {
    mountains = continentFactory.createMountains();
    river = continentFactory.createRiver();
    plants = continentFactory.createPlants();
    animals = continentFactory.createAnimals();
  }

  private void printContinentDetails(String name) {
    System.out.println(name);
    System.out.println("Mountains: " + mountains.getDescription());
    System.out.println("River: " + river.getDescription());
    System.out.print("Plants: ");
    for (int i = 0; i < plants.length; i++) {
      System.out.print(plants[i].getDescription());
      if (i < plants.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println();
    System.out.print("Animals: ");
    for (int i = 0; i < animals.length; i++) {
      System.out.print(animals[i].getDescription());
      if (i < animals.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("\n");
  }
}
