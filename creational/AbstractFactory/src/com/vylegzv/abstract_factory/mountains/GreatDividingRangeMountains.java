package com.vylegzv.abstract_factory.mountains;

/**
 * Great Dividing Range.
 * 
 * @author vella
 *
 */
public class GreatDividingRangeMountains implements Mountains {

  private static final String DESCR = "Great Dividing mountain range";
  private static final String HIGHEST_PEAK = "Mountain Kosciuszko";
  private static final int LENGTH = 2200;

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
