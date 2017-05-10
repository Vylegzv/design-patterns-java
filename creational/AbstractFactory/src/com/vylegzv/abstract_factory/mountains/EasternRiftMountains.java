package com.vylegzv.abstract_factory.mountains;

/**
 * Eastern Rift Mountains.
 * 
 * @author vella
 *
 */
public class EasternRiftMountains implements Mountains {

  private static final String DESCR = "Eastern Rift mountain range";
  private static final String HIGHEST_PEAK = "Mountain Kilimanjaro";
  private static final int LENGTH = 3700;

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
