package com.vylegzv.abstract_factory.rivers;

/**
 * Murray River
 * 
 * @author vella
 *
 */
public class MurrayRiver implements River {

  private static final String DESCR = "Murray Riger";
  private static final int LENGTH = 1558;

  @Override
  public String getDescription() {
    return DESCR;
  }

  @Override
  public int getLength() {
    return LENGTH;
  }
}
