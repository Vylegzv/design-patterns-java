package com.vylegzv.builder;

/**
 * Car color.
 * 
 * @author vella
 *
 */
public enum Color {

  BLACK, WHITE, BLUE, GREY, RED, SILVER;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
