package com.vylegzv.abstract_factory.plants;

/**
 * Banyan
 * 
 * @author vella
 *
 */
public class BanyanTree implements Plant {

  private static final String DESCR = "A banyan tree";

  @Override
  public String getDescription() {
    return DESCR;
  }
}
