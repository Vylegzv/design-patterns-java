package com.vylegzv.abstract_factory.mountains;

/**
 * Rocky mountains.
 * 
 * @author vella
 *
 */
public class RockyMountains implements Mountains {

  private static final String DESCR = "Rocky mountain range";
  private static final String HIGHEST_PEAK = "Mountain Elbert";
  private static final int LENGTH = 3000;

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