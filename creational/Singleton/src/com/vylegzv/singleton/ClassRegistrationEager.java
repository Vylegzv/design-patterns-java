package com.vylegzv.singleton;

/**
 * Eagerly initialized Singleton implementation; thread safe, but has a
 * drawback, because the instance will be always created at the time of class
 * loading, whether client needs it or not.
 * 
 * @author vella
 *
 */
public final class ClassRegistrationEager {

  private final static int CAPACITY = 30;
  private int numRegistered = 0;

  private static final ClassRegistrationEager INSTANCE =
      new ClassRegistrationEager();

  private ClassRegistrationEager() {};

  public static ClassRegistrationEager getInstance() {
    return INSTANCE;
  }

  public void register() {
    if (!isFull())
      numRegistered++;
  }

  public int getNumRegistered() {
    return numRegistered;
  }

  public void setNumRegistered(int numRegistered) {
    this.numRegistered = numRegistered;
  }

  public boolean isFull() {
    return numRegistered == CAPACITY;
  }
}
