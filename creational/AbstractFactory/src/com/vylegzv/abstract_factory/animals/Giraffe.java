package com.vylegzv.abstract_factory.animals;

/**
 * Giraffe
 * 
 * @author vella
 *
 */
public class Giraffe implements Animal {

  private static final String DESCR = "A giraffe";
  private static final String INTERESTING_FACT =
      "The giraffe is the tallest mammal in the world, with even new-born babies being taller than most humans";

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getInterestingFact() {
    return INTERESTING_FACT;
  }
}
