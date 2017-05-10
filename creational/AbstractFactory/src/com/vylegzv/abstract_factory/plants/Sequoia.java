package com.vylegzv.abstract_factory.plants;

/**
 * Sequoia
 * 
 * @author vella
 *
 */
public class Sequoia implements Plant {

  private static final String DESCR = "A sequoia tree";

  @Override
  public String getDescription() {
    return DESCR;
  }
}
