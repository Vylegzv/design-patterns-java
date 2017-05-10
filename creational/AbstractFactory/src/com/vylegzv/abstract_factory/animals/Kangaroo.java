package com.vylegzv.abstract_factory.animals;

/**
 * Kangaroo
 * 
 * @author vella
 *
 */
public class Kangaroo implements Animal {

  private static final String DESCR = "A kangaroo";
  private static final String INTERESTING_FACT =
      "Kangaroos can jump up to three times their own height";

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getInterestingFact() {
    return INTERESTING_FACT;
  }
}
