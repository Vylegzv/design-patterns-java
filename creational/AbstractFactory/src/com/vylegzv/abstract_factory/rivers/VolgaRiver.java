package com.vylegzv.abstract_factory.rivers;

/**
 * Volga river.
 * 
 * @author vella
 *
 */
public class VolgaRiver implements River {

  private static final String DESCR = "Volga Riger";
  private static final int LENGTH = 2290;

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public int getLength() {
    return LENGTH;
  }
}
