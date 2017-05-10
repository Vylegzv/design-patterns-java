package com.vylegzv.abstract_factory.animals;

/**
 * Panda.
 * 
 * @author vella
 *
 */
public class Panda implements Animal {

  private static final String DESCR = "A panda";
  private static final String INTERESTING_FACT =
      "Pandas rely on spatial memory, not visual memory";

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getInterestingFact() {
    return INTERESTING_FACT;
  }
}
