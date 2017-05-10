package com.vylegzv.abstract_factory.mountains;

/**
 * Himalayas.
 * 
 * @author vella
 *
 */
public class HimalayasMountains implements Mountains {

  private static final String DESCR = "Himalayas mountain range";
  private static final String HIGHEST_PEAK = "Mountain Everest";
  private static final int LENGTH = 1500;

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
