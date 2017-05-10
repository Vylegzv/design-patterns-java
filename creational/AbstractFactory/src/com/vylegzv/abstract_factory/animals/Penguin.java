package com.vylegzv.abstract_factory.animals;

/**
 * Penguin
 * 
 * @author vella
 *
 */
public class Penguin implements Animal {

  private static final String DESCR = "A penguin";
  private static final String INTERESTING_FACT =
      "Penguins typically are not afraid of humans";

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getInterestingFact() {
    return INTERESTING_FACT;
  }
}
