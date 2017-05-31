package com.vylegzv.builder;

/**
 * Car navigation package.
 * 
 * @author vella
 *
 */
public class NavigationPackage implements Package {

  private static final String navigationSystem = "navigation system";
  private static final String bluetooth = "Bluetooth";
  private static final String voiceRecognition = "voice recognition";

  @Override
  public String getDescription() {
    StringBuilder str =
        new StringBuilder("a navigation package that includes ");
    str.append(navigationSystem);
    str.append(", ");
    str.append(bluetooth);
    str.append(", and ");
    str.append(voiceRecognition);
    return str.toString();
  }
}
