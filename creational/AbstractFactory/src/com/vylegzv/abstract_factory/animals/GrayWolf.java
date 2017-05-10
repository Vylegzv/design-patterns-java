package com.vylegzv.abstract_factory.animals;

/**
 * Gray wolf.
 * 
 * @author vella
 *
 */
public class GrayWolf implements Animal {

  private static final String DESCR = "A gray wolf";
  private static final String INTERESTING_FACT =
      "Gray wolves can be gray, white, black or silvery";

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getInterestingFact() {
    return INTERESTING_FACT;
  }
}
