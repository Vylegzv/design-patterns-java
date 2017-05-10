## The Factory Method pattern
The Abstract Factory is a creational design pattern that defines an interface or abstract class for creating families of related objects without specifying their concrete subclasses. It is a "factory of factories" that encapsulates individual factories that have a common theme.

### Advantages:
 * Loose-coupling: the client code interacts with an interface or abstract class, not implementation. So the client code will not need to modify its logic and will just work with any user-defined concrete product classes.
 * Exchanging product families is easy since a class of a concrete factory appears only once in the client application, where it is instantiated.
 * Abstract Factory enforces consistency among product objects; the objects in a family are designed to work together, and an application uses objects from only one family at a time.

### Disadvantages:
* Adding new products is cumbersome since the Abstract Factory interface provides a fixed set of objects that can be created; supporting new kinds of objects requires extending the factory interface, which means changing the Abstract Factory class and all its subclasses.

### Uses:
 * when a system needs to be independent from the way its objects are created
 * when a system should be configured with multiple families of objects
 * when a family of related objects is designed to be only used together
 * when a system needs to interact with a library of product objects, which should reveal only their interfaces, not implementation

## Credits

* [Design Patterns: Elements of Reusable Object-Oriented Software](http://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)