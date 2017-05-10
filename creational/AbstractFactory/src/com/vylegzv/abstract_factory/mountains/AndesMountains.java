package com.vylegzv.abstract_factory.mountains;

/**
 * Andes.
 * 
 * @author vella
 *
 */
public class AndesMountains implements Mountains {

  private static final String DESCR = "Andes mountain range";
  private static final String HIGHEST_PEAK = "Mountain Aconcagua";
  private static final int LENGTH = 4300;

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
