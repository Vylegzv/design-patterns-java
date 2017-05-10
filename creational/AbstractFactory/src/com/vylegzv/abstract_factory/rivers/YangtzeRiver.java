package com.vylegzv.abstract_factory.rivers;

/**
 * YangtzeRiver river.
 * 
 * @author vella
 *
 */
public class YangtzeRiver implements River {

  private static final String DESCR = "Yangtze Riger";
  private static final int LENGTH = 3434;

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public int getLength() {
    return LENGTH;
  }
}
