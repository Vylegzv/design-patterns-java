package com.vylegzv.singleton;

/**
 * Lazily initialized Singleton implementation; the instance is created when a
 * client needs it, but the implementation is not thread safe.
 * 
 * @author vella
 *
 */
public final class ClassRegistrationLazyNotThreadSafe {

  private final static int CAPACITY = 30;
  private int numRegistered = 0;

  private static ClassRegistrationLazyNotThreadSafe INSTANCE;

  private ClassRegistrationLazyNotThreadSafe() {
    // to prevent Reflection from destroying the Singleton pattern
    if (INSTANCE != null) {
      throw new InstantiationError("Already instantiated");
    }
  };

  public static ClassRegistrationLazyNotThreadSafe getInstance() {
    if (INSTANCE == null)
      INSTANCE = new ClassRegistrationLazyNotThreadSafe();
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
