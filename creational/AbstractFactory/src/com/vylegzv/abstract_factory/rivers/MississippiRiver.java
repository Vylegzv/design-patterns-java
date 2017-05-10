package com.vylegzv.abstract_factory.rivers;

/**
 * MississippiRiver river.
 * 
 * @author vella
 *
 */
public class MississippiRiver implements River {

  private static final String DESCR = "Mississippi Riger";
  private static final int LENGTH = 2540;

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public int getLength() {
    return LENGTH;
  }
}
