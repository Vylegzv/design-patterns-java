package com.vylegzv.abstract_factory.rivers;

/**
 * Nile river.
 * 
 * @author vella
 *
 */
public class NileRiver implements River {

  private static final String DESCR = "Nile Riger";
  private static final int LENGTH = 4157;

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public int getLength() {
    return LENGTH;
  }
}
