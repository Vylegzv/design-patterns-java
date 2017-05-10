package com.vylegzv.abstract_factory.animals;

/**
 * Lion
 * 
 * @author vella
 *
 */
public class Lion implements Animal {

  private static final String DESCR = "A lion";
  private static final String INTERESTING_FACT =
      "The lion is the only mammal of the cat family to have a tufted tail";

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getInterestingFact() {
    return INTERESTING_FACT;
  }
}
