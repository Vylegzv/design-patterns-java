## The Builder pattern
The Builder pattern is a creational design pattern that helps in building a complex object using a step by step approach without defining constructors that require many parameters. It separates a construction of a complex object from its representation so that the same construction process can create different object representations.

### Advantages:
 * Separation between object construction and representation.
 * Better control over construction process.
 * Avoids creation of numerous constructors.
 * Allows to vary an object's internal representation.

### Disadvantages:
* Requires creating a new builder instance each time when creating a different object.

### Uses:
 * when an algorithm for creating a complex object should be independent of object's components and how they are assembled
 * when an object construction process must allow different representations for the constructed object

## Credits

* [Design Patterns: Elements of Reusable Object-Oriented Software](http://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)
* [Effective Java](https://www.amazon.com/Effective-Java-2nd-Joshua-Bloch/dp/0321356683)