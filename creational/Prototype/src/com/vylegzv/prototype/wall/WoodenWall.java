package com.vylegzv.prototype.wall;

/**
 * Wooden wall.
 * 
 * @author vella
 *
 */
public class WoodenWall extends Wall {

  @Override
  public Wall clone() throws CloneNotSupportedException {
    return new WoodenWall();
  }

  @Override
  public String toString() {
    return "Wooden wall";
  }
}
