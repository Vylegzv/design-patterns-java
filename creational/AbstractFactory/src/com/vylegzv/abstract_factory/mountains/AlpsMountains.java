package com.vylegzv.abstract_factory.mountains;

/**
 * Alps.
 * 
 * @author vella
 *
 */
public class AlpsMountains implements Mountains {

  private static final String DESCR = "Alps mountain range";
  private static final String HIGHEST_PEAK = "Mountain Blanc";
  private static final int LENGTH = 750;

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getHighestPeak() {
    return HIGHEST_PEAK;
  }

  @Override
  public int getLength() {
    return LENGTH;
  }
}
