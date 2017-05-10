package com.vylegzv.abstract_factory.animals;

/**
 * Skunk
 * 
 * @author vella
 *
 */
public class Skunk implements Animal {

  private static final String DESCR = "A skunk";
  private static final String INTERESTING_FACT =
      "Skunks can survive a snake bite";

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getInterestingFact() {
    return INTERESTING_FACT;
  }
}
