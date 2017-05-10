package com.vylegzv.abstract_factory.animals;

/**
 * Jaguar
 * 
 * @author vella
 *
 */
public class Jaguar implements Animal {

  private static final String DESCR = "A jaguar";
  private static final String INTERESTING_FACT =
      "Some jaguars are black with spots, and they are sometimes called panthers";

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getInterestingFact() {
    return INTERESTING_FACT;
  }
}
