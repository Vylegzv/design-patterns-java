package com.vylegzv.abstract_factory.plants;

/**
 * European ash tree.
 * 
 * @author vella
 *
 */
public class EuropeanAshTree implements Plant {

  private static final String DESCR = "A european ash tree";

  @Override
  public String getDescription() {
    return DESCR;
  }
}