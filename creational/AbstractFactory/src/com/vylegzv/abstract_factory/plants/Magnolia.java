package com.vylegzv.abstract_factory.plants;

/**
 * Magnolia
 * 
 * @author vella
 *
 */
public class Magnolia implements Plant {

  private static final String DESCR = "A magnolia tree";

  @Override
  public String getDescription() {
    return DESCR;
  }
}
