## The Factory Method pattern
The Factory Method pattern is a creational design pattern that defines an interface or abstract class for creating an object but defers the concrete class instantiation to subclasses.

###Advantages:
 * Loose-coupling: the client code interacts with an interface or abstract class, not implementation. So the client code will not need to modify its logic and will just work with any classes that implement that interface or extend that abstract class.
 * Maintaining code is easier since the object creation is centralized.
 * Code is consistent, making every client code to follow a specific set of rules when creating an object.

###Uses:
 * when a class doesn't know in advance what subclasses will be needed to create
 * when a class prefers its subclasses to specify the objects it creates
 * when parent classes delegate the creation of objects to their subclasses

## Credits

* [Design Patterns: Elements of Reusable Object-Oriented Software](http://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)