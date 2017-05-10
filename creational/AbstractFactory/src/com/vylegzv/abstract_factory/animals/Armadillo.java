package com.vylegzv.abstract_factory.animals;

/**
 * Armadillo
 * 
 * @author vella
 *
 */
public class Armadillo implements Animal {

  private static final String DESCR = "An armadillo";
  private static final String INTERESTING_FACT =
      "Common armadillo colors range from pink and dark brown to black, gray, yellow and red";

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getInterestingFact() {
    return INTERESTING_FACT;
  }
}
