package com.vylegzv.prototype.wall;

/**
 * Brick wall.
 * 
 * @author vella
 *
 */
public class BrickWall extends Wall {

  @Override
  public Wall clone() throws CloneNotSupportedException {
    return new BrickWall();
  }

  @Override
  public String toString() {
    return "Brick wall";
  }
}
