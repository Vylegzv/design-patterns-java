package com.vylegzv.abstract_factory.animals;

/**
 * Koala
 * 
 * @author vella
 *
 */
public class Koala implements Animal {

  private static final String DESCR = "An armadillo";
  private static final String INTERESTING_FACT =
      "An adult koala eats about 1/2 - 1 kilogram of leaves each night";

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getInterestingFact() {
    return INTERESTING_FACT;
  }
}
