package com.vylegzv.abstract_factory.animals;

/**
 * Orangutan
 * 
 * @author vella
 *
 */
public class Orangutan implements Animal {

  private static final String DESCR = "An orangutan";
  private static final String INTERESTING_FACT =
      "Orangutan children will stay with their mothers for 7 or 8 years until they develop the skills to survive on their own";

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getInterestingFact() {
    return INTERESTING_FACT;
  }
}
