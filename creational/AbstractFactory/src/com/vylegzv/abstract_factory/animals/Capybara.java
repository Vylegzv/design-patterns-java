package com.vylegzv.abstract_factory.animals;

/**
 * Capybara
 * 
 * @author vella
 *
 */
public class Capybara implements Animal {

  private static final String DESCR = "A capybara";
  private static final String INTERESTING_FACT =
      "Capybara is the largest living rodent on Earth";

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public String getInterestingFact() {
    return INTERESTING_FACT;
  }
}
