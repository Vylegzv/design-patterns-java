package com.vylegzv.abstract_factory.plants;

/**
 * Silk floss tree.
 * 
 * @author vella
 *
 */
public class SilkFlossTree implements Plant {

  private static final String DESCR = "A silk floss tree";

  @Override
  public String getDescription() {
    return DESCR;
  }
}
