package com.vylegzv.abstract_factory.plants;

/**
 * European larch tree.
 * 
 * @author vella
 *
 */
public class EuropeanLarchTree implements Plant {

  private static final String DESCR = "A european larch tree";

  @Override
  public String getDescription() {
    return DESCR;
  }
}
