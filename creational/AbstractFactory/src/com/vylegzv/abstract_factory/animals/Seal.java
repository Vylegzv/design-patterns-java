package com.vylegzv.abstract_factory.animals;

/**
 * Seal
 * 
 * @author vella
 *
 */
public class Seal implements Animal {

  private static final String DESCR = "A seal";
  private static final String INTERESTING_FACT =
      "Seal can hold its breath for 2 hours which is a record in the animal world";

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getInterestingFact() {
    return INTERESTING_FACT;
  }
}
