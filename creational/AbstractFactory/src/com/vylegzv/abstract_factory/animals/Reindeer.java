package com.vylegzv.abstract_factory.animals;

/**
 * Reindeer
 * 
 * @author vella
 *
 */
public class Reindeer implements Animal {

  private static final String DESCR = "A reindeer";
  private static final String INTERESTING_FACT =
      "Reindeer noses are specially designed to warm the air before it gets to their lungs";

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getInterestingFact() {
    return INTERESTING_FACT;
  }
}
