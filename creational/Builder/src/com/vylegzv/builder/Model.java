package com.vylegzv.builder;

/**
 * Car type.
 * 
 * @author vella
 *
 */
public enum Model {

  SEDAN, COUPE, CONVERTIBLE;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
