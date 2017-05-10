package com.vylegzv.abstract_factory.plants;

/**
 * Baobab
 * 
 * @author vella
 *
 */
public class Baobab implements Plant {

  private static final String DESCR = "A baobab";

  @Override
  public String getDescription() {
    return DESCR;
  }
}
