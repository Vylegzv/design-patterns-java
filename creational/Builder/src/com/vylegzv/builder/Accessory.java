package com.vylegzv.builder;

/**
 * Car accessories.
 * 
 * @author vella
 *
 */
public enum Accessory {

  PAINT_PROTECTION("paint protection film"), REAR_SPOILER(
      "rear spoiler"), SIDE_MOLDINGS("side moldings");

  private String accessory;

  Accessory(String accessory) {
    this.accessory = accessory;
  }

  @Override
  public String toString() {
    return accessory;
  }
}
