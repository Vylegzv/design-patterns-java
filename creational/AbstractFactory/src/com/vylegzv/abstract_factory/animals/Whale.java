package com.vylegzv.abstract_factory.animals;

/**
 * Whale
 * 
 * @author vella
 *
 */
public class Whale implements Animal {

  private static final String DESCR = "A whale";
  private static final String INTERESTING_FACT =
      "The closest living relative to whales are hippos";

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getInterestingFact() {
    return INTERESTING_FACT;
  }
}
