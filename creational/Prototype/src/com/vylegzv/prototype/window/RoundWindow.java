package com.vylegzv.prototype.window;

/**
 * Round window.
 * 
 * @author vella
 *
 */
public class RoundWindow extends Window {

  @Override
  public Window clone() throws CloneNotSupportedException {
    return new RoundWindow();
  }

  @Override
  public String toString() {
    return "Round window";
  }
}
