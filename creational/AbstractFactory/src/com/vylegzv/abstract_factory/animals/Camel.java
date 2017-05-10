package com.vylegzv.abstract_factory.animals;

/**
 * Camel.
 * 
 * @author vella
 *
 */
public class Camel implements Animal {

  private static final String DESCR = "A camel";
  private static final String INTERESTING_FACT =
      "Camels' eyes have three eyelids and two rows of eyelashes that prevent sand to enter their eyes";

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getInterestingFact() {
    return INTERESTING_FACT;
  }
}
