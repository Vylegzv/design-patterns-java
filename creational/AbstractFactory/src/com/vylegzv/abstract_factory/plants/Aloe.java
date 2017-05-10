package com.vylegzv.abstract_factory.plants;

/**
 * Aloe
 * 
 * @author vella
 *
 */
public class Aloe implements Plant {

  private static final String DESCR = "An aloe";

  @Override
  public String getDescription() {
    return DESCR;
  }
}
