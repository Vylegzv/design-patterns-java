package com.vylegzv.abstract_factory.animals;

/**
 * Bengal Tiger
 * 
 * @author vella
 *
 */
public class BengalTiger implements Animal {

  private static final String DESCR = "A bengal tiger";
  private static final String INTERESTING_FACT =
      "Just like human fingerprints, the stripes on each tiger are unique";

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getInterestingFact() {
    return INTERESTING_FACT;
  }
}
