package com.vylegzv.abstract_factory.plants;

/**
 * Acacia
 * 
 * @author vella
 *
 */
public class Acacia implements Plant {

  private static final String DESCR = "An acacia";

  @Override
  public String getDescription() {
    return DESCR;
  }
}
