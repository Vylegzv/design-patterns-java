package com.vylegzv.abstract_factory.plants;

/**
 * Eucalyptus
 * 
 * @author vella
 *
 */
public class Eucalyptus implements Plant {

  private static final String DESCR = "An eucalyptus";

  @Override
  public String getDescription() {
    return DESCR;
  }
}
