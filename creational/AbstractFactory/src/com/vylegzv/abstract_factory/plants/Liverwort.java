package com.vylegzv.abstract_factory.plants;

/**
 * Liverwort
 * 
 * @author vella
 *
 */
public class Liverwort implements Plant {

  private static final String DESCR = "A liverwort";

  @Override
  public String getDescription() {
    return DESCR;
  }
}
