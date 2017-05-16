package com.vylegzv.singleton;

/**
 * Lazily initialized Singleton implementation; thread safe, but slow, because
 * of synchronized method.
 * 
 * @author vella
 *
 */
public final class ClassRegistrationLazyThreadSafeSlow {

  private final static int CAPACITY = 30;
  private int numRegistered = 0;

  private static ClassRegistrationLazyThreadSafeSlow INSTANCE;

  private ClassRegistrationLazyThreadSafeSlow() {
    if (INSTANCE != null) {
      throw new InstantiationError("Already instantiated");
    }
  }

  public static synchronized ClassRegistrationLazyThreadSafeSlow getInstance() {
    // to prevent Reflection from destroying the Singleton pattern
    if (INSTANCE == null)
      INSTANCE = new ClassRegistrationLazyThreadSafeSlow();
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
