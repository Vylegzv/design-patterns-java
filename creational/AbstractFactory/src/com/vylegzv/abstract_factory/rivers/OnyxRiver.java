package com.vylegzv.abstract_factory.rivers;

/**
 * Onyx river.
 * 
 * @author vella
 *
 */
public class OnyxRiver implements River {

  private static final String DESCR = "Onyx River";
  private static final int LENGTH = 25;

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public int getLength() {
    return LENGTH;
  }
}
