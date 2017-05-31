package com.vylegzv.builder;

/**
 * Car sport package.
 * 
 * @author vella
 *
 */
public class SportPackage implements Package {

  private static final String sportSuspension = "sport suspension";
  private static final String sportWheel = "sport steering wheel";
  private static final String sportBrakes = "sport break system";

  @Override
  public String getDescription() {
    StringBuilder str = new StringBuilder("a sport package that includes ");
    str.append(sportSuspension);
    str.append(", ");
    str.append(sportWheel);
    str.append(", and ");
    str.append(sportBrakes);
    return str.toString();
  }
}
