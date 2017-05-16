package com.vylegzv.singleton;

/**
 * The Singleton is a creational design pattern that ensures that only one
 * instance of a class is created and provides a global point of access to the
 * object.
 * <p>
 * Advantages:
 * <ul>
 * <li>Better memory usage, because the object is not created on each request.
 * </ul>
 * Disadvantages:
 * <ul>
 * <li>It violates the Single Responsibility principle, because Singleton has
 * two responsibilities: creating an instance of itself and creating other
 * business logic. However, this issue can be solved by using a factory object
 * to create business responsibilities.
 * <li>It limits code flexibility, because Singleton hides dependencies instead
 * of exposing them through interfaces.
 * <li>It carries state during the lifetime of the application, which makes unit
 * testing difficult.
 * </ul>
 * <p>
 * Uses:
 * <ul>
 * <li>when there must be exactly one instance of a class, and it must be
 * accessible to clients from a known access point
 * </ul>
 * <p>
 * In this example shows how a school/college class registration can be
 * implemented as a Singleton. There various ways of implementing Singleton. One
 * way is eager implementation {@link ClassRegistrationEager}. It is thread
 * safe, but has a drawback, because the instance will be always created at the
 * time of class loading.
 * <p>
 * Another way is of implementing a Singleton is using enum
 * {@link ClassRegistrationEnum}. It is thread safe and immune to Reflection
 * trying to destroy the Singleton. However, the disadvantage of this
 * implementation is that it is also eager, and the enum type is not flexible.
 * <p>
 * {@link ClassRegistrationLazyNotThreadSafe} is an example of lazily
 * initialized Singleton, where the instance is created only when a client needs
 * it. But the implementation is not thread safe and should be only used in
 * single-threaded environments.
 * <p>
 * {@link ClassRegistrationLazyThreadSafeSlow} is an example of lazily
 * initialized and thread-safe Singleton implementation. The disadvantage is
 * that it is slow, because the whole instance access method is synchronized.
 * <p>
 * {@link ClassRegistrationLazyThreadSafeFaster} is an example of lazily
 * initialized, thread-safe, and faster Singleton implementation. It only
 * synchronizes the specific part of access method to avoid the extra overhead.
 * <p>
 * {@link ClassRegistrationOnDemandHolder} shows yet another way to create
 * lazily initialized, thread-safe, and faster implementation that uses Java's
 * guarantees about class initialization.
 * 
 * @author vella
 *
 */
public class SingletonExample {

  public static void main(String[] args) {

    // eagerly
    ClassRegistrationEager classRegEager1 =
        ClassRegistrationEager.getInstance();
    ClassRegistrationEager classRegEager2 =
        ClassRegistrationEager.getInstance();
    classRegEager1.register();
    System.out.println("Eager Singleton --- Number registered: "
        + classRegEager2.getNumRegistered());
    classRegEager2.register();
    System.out.println("Eager Singleton --- Number registered: "
        + classRegEager1.getNumRegistered());

    // enum
    ClassRegistrationEnum classRegEnum1 = ClassRegistrationEnum.INSTANCE;
    ClassRegistrationEnum classRegEnum2 = ClassRegistrationEnum.INSTANCE;
    classRegEnum1.register();
    System.out.println("Enum Singleton --- Number registered: "
        + classRegEnum2.getNumRegistered());
    classRegEnum2.register();
    System.out.println("Enum Singleton --- Number registered: "
        + classRegEnum1.getNumRegistered());

    // lazy, not thread safe
    ClassRegistrationLazyNotThreadSafe classRegLazyUnsafe1 =
        ClassRegistrationLazyNotThreadSafe.getInstance();
    ClassRegistrationLazyNotThreadSafe classRegLazyUnsafe2 =
        ClassRegistrationLazyNotThreadSafe.getInstance();
    classRegLazyUnsafe1.register();
    System.out.println("Lazy Not Thread Safe Singleton --- Number registered: "
        + classRegLazyUnsafe2.getNumRegistered());
    classRegLazyUnsafe2.register();
    System.out.println("Lazy Not Thread Safe Singleton --- Number registered: "
        + classRegLazyUnsafe1.getNumRegistered());

    // lazy, thread safe, slow
    ClassRegistrationLazyThreadSafeSlow classRegLazySafeSlow1 =
        ClassRegistrationLazyThreadSafeSlow.getInstance();
    ClassRegistrationLazyThreadSafeSlow classRegLazySafeSlow2 =
        ClassRegistrationLazyThreadSafeSlow.getInstance();
    classRegLazySafeSlow1.register();
    System.out.println("Lazy Thread Safe Slow Singleton --- Number registered: "
        + classRegLazySafeSlow2.getNumRegistered());
    classRegLazySafeSlow2.register();
    System.out.println("Lazy Thread Safe Slow Singleton --- Number registered: "
        + classRegLazySafeSlow1.getNumRegistered());

    // lazy, thread safe, faster
    ClassRegistrationLazyThreadSafeFaster classRegLazySafeFaster1 =
        ClassRegistrationLazyThreadSafeFaster.getInstance();
    ClassRegistrationLazyThreadSafeFaster classRegLazySafeFaster2 =
        ClassRegistrationLazyThreadSafeFaster.getInstance();
    classRegLazySafeFaster1.register();
    System.out
        .println("Lazy Thread Safe Faster Singleton --- Number registered: "
            + classRegLazySafeFaster2.getNumRegistered());
    classRegLazySafeFaster2.register();
    System.out
        .println("Lazy Thread Safe Faster Singleton --- Number registered: "
            + classRegLazySafeFaster1.getNumRegistered());

    // on-demand-holder
    ClassRegistrationOnDemandHolder classRegOnDemandHolder1 =
        ClassRegistrationOnDemandHolder.getInstance();
    ClassRegistrationOnDemandHolder classRegOnDemandHolder2 =
        ClassRegistrationOnDemandHolder.getInstance();
    classRegOnDemandHolder1.register();
    System.out
        .println("On-demand-holder idiom Singleton --- Number registered: "
            + classRegOnDemandHolder2.getNumRegistered());
    classRegOnDemandHolder2.register();
    System.out
        .println("On-demand-holder idiom Singleton --- Number registered: "
            + classRegOnDemandHolder1.getNumRegistered());
  }
}
