package com.vylegzv.abstract_factory.rivers;

/**
 * Amazon river.
 * 
 * @author vella
 *
 */
public class AmazonRiver implements River {

  private static final String DESCR = "Amazon Riger";
  private static final int LENGTH = 3915;

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public int getLength() {
    return LENGTH;
  }
}
