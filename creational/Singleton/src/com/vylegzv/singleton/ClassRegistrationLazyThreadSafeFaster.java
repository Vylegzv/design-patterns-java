package com.vylegzv.singleton;

/**
 * Lazily initialized Singleton implementation; thread safe. It uses "double
 * checked locking" principle to synchronize only the specific part of a method
 * to avoid the extra overhead. The synchronized block is used inside the if
 * condition with an extra check to ensure that only one instance of Singleton
 * is created.
 * 
 * @author vella
 *
 */
public final class ClassRegistrationLazyThreadSafeFaster {

  private final static int CAPACITY = 30;
  private int numRegistered = 0;

  private static volatile ClassRegistrationLazyThreadSafeFaster INSTANCE;

  private ClassRegistrationLazyThreadSafeFaster() {
    // to prevent Reflection from destroying the Singleton pattern
    if (INSTANCE != null) {
      throw new InstantiationError("Already instantiated");
    }
  };

  public static ClassRegistrationLazyThreadSafeFaster getInstance() {

    // use local variable to increase performance
    ClassRegistrationLazyThreadSafeFaster theInstance = INSTANCE;

    if (theInstance == null) {
      synchronized (ClassRegistrationLazyThreadSafeFaster.class) {
        theInstance = INSTANCE;
        if (theInstance == null) {
          INSTANCE = theInstance = new ClassRegistrationLazyThreadSafeFaster();
        }
      }
    }
    return theInstance;
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
