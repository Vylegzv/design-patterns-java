package com.vylegzv.prototype;

import com.vylegzv.prototype.door.*;
import com.vylegzv.prototype.wall.*;
import com.vylegzv.prototype.window.*;

/**
 * The Prototype is a creational design pattern that allows to create objects
 * based on a template of an existing object through cloning.
 * <p>
 * Advantages:
 * <ul>
 * <li>It needs less number of classes compared to other creational patterns.
 * <li>Prototype can be customized between creations.
 * </ul>
 * <p>
 * Disadvantages:
 * <ul>
 * <li>It may be difficult to implement the process of cloning an object.
 * <li>Memory is required to hold the prototype.
 * <li>Many prototypes must be passed.
 * </ul>
 * <p>
 * Uses:
 * <ul>
 * <li>when composition, creation, and representation of objects should be
 * decoupled
 * <li>when object creation is time consuming and costly
 * <li>when you want to avoid the creation of a factory hierarchy
 * <li>when classes to be created are specified at run-time
 * <li>when required objects are similar to existing objects
 * </ul>
 * <p>
 * In this example of Prototype pattern, we are creating a house factory that
 * requires instances of {@link Wall}, {@link Door}, and {@link Window} classes
 * frequently. To avoid creating these instances every time, we create their
 * prototype instances, and then clone the prototype each time a new instance is
 * needed.
 * 
 * @author vella
 *
 */
public class PrototypeExample {

  public static void main(String[] args) {
    HouseFactory houseFactory;
    Wall wall;
    Door door;
    Window window;

    houseFactory = new HouseFactoryImpl(new BrickWall(), new GlassDoor(),
        new RoundWindow());
    wall = houseFactory.createWall();
    door = houseFactory.createDoor();
    window = houseFactory.createWindow();
    System.out.println(getHouseDescription(wall, door, window));

    houseFactory = new HouseFactoryImpl(new WoodenWall(), new WoodenDoor(),
        new SquareWindow());
    wall = houseFactory.createWall();
    door = houseFactory.createDoor();
    window = houseFactory.createWindow();
    System.out.println(getHouseDescription(wall, door, window));
  }

  private static String getHouseDescription(Wall wall, Door door,
      Window window) {
    StringBuilder descr = new StringBuilder();
    descr.append(wall.toString());
    descr.append(", ");
    descr.append(door.toString());
    descr.append(", ");
    descr.append(window.toString());
    return descr.toString();
  }
}
