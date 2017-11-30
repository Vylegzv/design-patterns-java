package com.vylegzv.prototype.window;

/**
 * Square window.
 * 
 * @author vella
 *
 */
public class SquareWindow extends Window {

  @Override
  public Window clone() throws CloneNotSupportedException {
    return new SquareWindow();
  }

  @Override
  public String toString() {
    return "Square window";
  }
}
