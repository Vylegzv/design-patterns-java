package com.vylegzv.abstract_factory.animals;

/**
 * Dingo
 * 
 * @author vella
 *
 */
public class Dingo implements Animal {

  private static final String DESCR = "A dingo";
  private static final String INTERESTING_FACT =
      "Unlike dogs, dingo does not bark, but howls like a wolf";

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getInterestingFact() {
    return INTERESTING_FACT;
  }
}