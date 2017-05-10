package com.vylegzv.abstract_factory.animals;

/**
 * Coyote
 * 
 * @author vella
 *
 */
public class Coyote implements Animal {

  private static final String DESCR = "A coyote";
  private static final String INTERESTING_FACT =
      "Coyotes can jump horizontal distances of up to 4 meters";

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getInterestingFact() {
    return INTERESTING_FACT;
  }
}
