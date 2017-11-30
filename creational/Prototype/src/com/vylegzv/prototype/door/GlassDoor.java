package com.vylegzv.prototype.door;

/**
 * Glass door.
 * 
 * @author vella
 *
 */
public class GlassDoor extends Door {

  @Override
  public Door clone() throws CloneNotSupportedException {
    return new GlassDoor();
  }

  @Override
  public String toString() {
    return "Glass door";
  }
}
