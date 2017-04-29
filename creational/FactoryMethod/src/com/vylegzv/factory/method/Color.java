package com.vylegzv.factory.method;

/**
 * Color enum.
 * 
 * @author vella
 *
 */
public enum Color {

  RED("red"), BLUE("blue"), GREEN("green"), YELLOW("yellow"), WHITE(
      "white"), BLACK("black");

  private String color;

  private Color(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return color;
  }
}
