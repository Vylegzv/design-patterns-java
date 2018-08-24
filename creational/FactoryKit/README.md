## The Factory Kit pattern
Factory Kit is a creational design pattern that uses separate builder and factory interfaces to separate the mutable part from the immutable part.

### Advantages:
 * The processes of building and creating objects are independent, allowing for separation of mutable from immutable.
 * The client application is restricted to only registering the predefined builders but not creating them.
 * The pattern can be implemented by using only lambda's since both builder and factory are functional interfaces.

### Uses:
 * when you want to explicitly define the types of objects for the factory to create
 * when you want to separate the process of building and creating objects (e.g. when you don't want to let the user to create the builder, but let the user to register a builder created by you and have access to only a factory object)
 * when a class doesn't know in advance what types of objects it will need to create

## Credits

* [Design Pattern Reloaded](https://speakerdeck.com/forax/design-pattern-reloaded-devoxx-be-2015)