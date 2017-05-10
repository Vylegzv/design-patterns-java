package com.vylegzv.abstract_factory.mountains;

/**
 * Transantarctic Mountains.
 * 
 * @author vella
 *
 */
public class TransantarcticMountains implements Mountains {

  private static final String DESCR = "Transantarctic mountain range";
  private static final String HIGHEST_PEAK = "Mountain Kirkpatrick";
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
