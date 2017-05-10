package com.vylegzv.abstract_factory.plants;

/**
 * Moss.
 * 
 * @author vella
 *
 */
public class Moss implements Plant {

  private static final String DESCR = "A moss";

  @Override
  public String getDescription() {
    return DESCR;
  }
}
