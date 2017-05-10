package com.vylegzv.abstract_factory.animals;

/**
 * A bison
 * 
 * @author vella
 *
 */
public class Bison implements Animal {

  private static final String DESCR = "A bison";
  private static final String INTERESTING_FACT =
      "Despite their large size, bisons are very fast, running at 40 miles per hour";

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getInterestingFact() {
    return INTERESTING_FACT;
  }
}
