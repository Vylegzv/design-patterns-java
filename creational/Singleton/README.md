## The Singleton pattern
The Singleton is a creational design pattern that ensures that only one instance of a class is created and provides a global point of access to the object.

This example explores several ways to implement a Singleton pattern, considering the advantages and disadvantages of each implementation.

### Advantages:
* Better memory usage, because the object is not created on each request.

### Disadvantages
* It violates the Single Responsibility principle, because Singleton has two responsibilities: creating an instance of itself and creating other business logic. However, this issue can be solved by using a factory object to create business responsibilities.
* It limits code flexibility, because Singleton hides dependencies instead of exposing them through interfaces.
* It carries state during the lifetime of the application, which makes unit testing difficult.

### Uses:
* when there must be exactly one instance of a class, and it must be accessible to clients from a known access point

## Credits

* [Design Patterns: Elements of Reusable Object-Oriented Software](http://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)
* [Effective Java](https://www.amazon.com/Effective-Java-2nd-Joshua-Bloch/dp/0321356683)
* [JournalDev](http://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples)