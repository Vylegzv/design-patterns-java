package com.vylegzv.singleton;

/**
 * Singleton implementation using "Initialization-on-demand holder" idiom. It
 * uses Java's guarantees about class initialization to make the implementation
 * thread safe. It is lazily initialized due to the fact that an inner class is
 * not loaded until a getInstance() is called.
 * 
 * @author vella
 *
 */
public class ClassRegistrationOnDemandHolder {

  private final static int CAPACITY = 30;
  private int numRegistered = 0;

  private ClassRegistrationOnDemandHolder() {}

  public static ClassRegistrationOnDemandHolder getInstance() {
    return SingletonHolder.INSTANCE;
  }

  private static class SingletonHolder {
    private static final ClassRegistrationOnDemandHolder INSTANCE =
        new ClassRegistrationOnDemandHolder();
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
