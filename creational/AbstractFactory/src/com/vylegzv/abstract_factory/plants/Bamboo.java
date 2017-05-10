package com.vylegzv.abstract_factory.plants;

/**
 * Bamboo
 * 
 * @author vella
 *
 */
public class Bamboo implements Plant {

  private static final String DESCR = "A bamboo";

  @Override
  public String getDescription() {
    return DESCR;
  }
}
