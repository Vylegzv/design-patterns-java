package com.vylegzv.abstract_factory.animals;

/**
 * Wild boar.
 * 
 * @author vella
 *
 */
public class WildBoar implements Animal {

  private static final String DESCR = "A wild boar";
  private static final String INTERESTING_FACT =
      "Wild boars are nocturnal animals, spending 12 hours in sleep during the day";

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getInterestingFact() {
    return INTERESTING_FACT;
  }
}
