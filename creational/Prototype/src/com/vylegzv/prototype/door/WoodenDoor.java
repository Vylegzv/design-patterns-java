package com.vylegzv.prototype.door;

/**
 * Wooden door.
 * 
 * @author vella
 *
 */
public class WoodenDoor extends Door {

  @Override
  public Door clone() throws CloneNotSupportedException {
    return new WoodenDoor();
  }

  @Override
  public String toString() {
    return "Wooden door";
  }
}
