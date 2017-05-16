package com.vylegzv.singleton;

/**
 * Enum Singleton implementation; thread safe. Since Java ensures that an enum
 * value is instantiated only once, we don't have to worry about Reflection
 * breaking the Singleton pattern. The drawback to such implementation is that
 * the enum type is not flexible, and the implementation is eager, meaning that
 * the instance will always be created even if a client doesn't need it.
 * 
 * @author vella
 *
 */
public enum ClassRegistrationEnum {

  INSTANCE;

  private final static int CAPACITY = 30;
  private int numRegistered = 0;

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
