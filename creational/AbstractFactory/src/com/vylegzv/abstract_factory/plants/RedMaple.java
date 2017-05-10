package com.vylegzv.abstract_factory.plants;

/**
 * Red maple.
 * 
 * @author vella
 *
 */
public class RedMaple implements Plant {

  private static final String DESCR = "A red maple tree";

  @Override
  public String getDescription() {
    return DESCR;
  }
}
