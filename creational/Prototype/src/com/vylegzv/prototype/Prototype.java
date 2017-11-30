package com.vylegzv.prototype;

/**
 * Prototype interface.
 * 
 * @author vella
 *
 */
public abstract class Prototype implements Cloneable {

  @Override
  public abstract Object clone() throws CloneNotSupportedException;
}
