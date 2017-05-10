package com.vylegzv.abstract_factory.animals;

/**
 * Raccoon.
 * 
 * @author vella
 *
 */
public class Raccoon implements Animal {

  private static final String DESCR = "A raccoon";
  private static final String INTERESTING_FACT =
      "It is believed the raccoon can make over 200 different sounds";

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getInterestingFact() {
    return INTERESTING_FACT;
  }
}
