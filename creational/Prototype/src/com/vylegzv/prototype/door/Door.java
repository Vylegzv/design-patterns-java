package com.vylegzv.prototype.door;

import com.vylegzv.prototype.Prototype;

/**
 * Door.
 * 
 * @author vella
 *
 */
public abstract class Door extends Prototype {
  
  @Override
  public abstract Door clone() throws CloneNotSupportedException;
}
