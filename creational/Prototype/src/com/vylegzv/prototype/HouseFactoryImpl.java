package com.vylegzv.prototype;

import com.vylegzv.prototype.door.Door;
import com.vylegzv.prototype.wall.Wall;
import com.vylegzv.prototype.window.Window;

/**
 * HouseFactory implementation.
 * 
 * @author vella
 *
 */
public class HouseFactoryImpl implements HouseFactory {

  private Wall wall;
  private Door door;
  private Window window;

  public HouseFactoryImpl(Wall wall, Door door, Window window) {
    this.wall = wall;
    this.door = door;
    this.window = window;
  }

  @Override
  public Wall createWall() {
    try {
      return wall.clone();
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }

  @Override
  public Door createDoor() {
    try {
      return door.clone();
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }

  @Override
  public Window createWindow() {
    try {
      return window.clone();
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }
}
