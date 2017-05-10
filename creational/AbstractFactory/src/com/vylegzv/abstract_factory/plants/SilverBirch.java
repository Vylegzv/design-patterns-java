package com.vylegzv.abstract_factory.plants;

/**
 * Silver birch.
 * 
 * @author vella
 *
 */
public class SilverBirch implements Plant {

  private static final String DESCR = "A silver birch";

  @Override
  public String getDescription() {
    return DESCR;
  }
}
