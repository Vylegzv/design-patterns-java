package com.vylegzv.abstract_factory.plants;

/**
 * Rubber tree.
 * 
 * @author vella
 *
 */
public class RubberTree implements Plant {

  private static final String DESCR = "A rubber tree";

  @Override
  public String getDescription() {
    return DESCR;
  }
}
