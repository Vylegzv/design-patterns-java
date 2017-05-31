package com.vylegzv.builder;

/**
 * Car luxury package.
 * 
 * @author vella
 *
 */
public class LuxuryPackage implements Package {

  private static final String backupCamera =
      "backup camera with dynamic gridlines";
  private static final String heatedSeats = "heated and ventilated seats";
  private static final String blindSpotMonitor = "blind spot monitor";
  private static final String parkingAssist = "intuitive parking assist";

  @Override
  public String getDescription() {
    StringBuilder str = new StringBuilder("a luxury package that includes ");
    str.append(backupCamera);
    str.append(", ");
    str.append(heatedSeats);
    str.append(", ");
    str.append(blindSpotMonitor);
    str.append(", and ");
    str.append(parkingAssist);
    return str.toString();
  }
}
