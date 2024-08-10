# design-patterns-java

A repository to hold my understanding of the design patterns from the Head First Design Patterns book

## Design Principles

+ Ch1

1. Identify the aspects of your application that vary and separate them from what remains the same.
2. Program to an interface, not to an implementation. (This means program to a supertype.)
3. Favor composition over inheritance.

+ Ch2

4. Strive for loose coupled design between objects that interact.

+ Ch3

5. Classes should be open for extension but closed for modification.

+ Ch4

6. Depend upon abstractions. Do not depend upon concrete classes.

+ Ch8

7. Don't call us, we'll call you.


## Design Patterns

### Strategy Pattern

The strategy pattern defines a family of algorithms, encapsulates each one, & makes them interchangeable.
Strategy lets the algorithm vary independently from clients that use it.

### Observer Pattern

The observer pattern defines a one-to-many dependency between objects so that when one object changes state
all of its dependents are notified & updated automatically.

### Decorator Pattern

Decorator pattern attaches additional responsibilities to an object dynamically.
They provide a flexible alternative to subclassing for extended functionality.

### Factory Pattern

The factory method pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate.
Factory method lets a class defer instantiation to subclasses.

### Singleton Pattern

Ensures that a class has only 1 instance and provides a global point of access to that instance.

### Command Pattern

Command pattern turns a request into a stand-alone object that contains all the information about the request.
This transformation allows for parameterizing methods with different requests, queuing or logging requests, & supporting undoable operations.

### Adapter and Facade Pattern

The adapter pattern converts the interface of one class into one that the client is expecting.
Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

Facade patterns provides a unified interface to a set of interfaces in a subsystem.
Facade defines a higher-level interface that makes the subsystem easier to use.

### Template Method Pattern

Template method pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
Template method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

### Iterator and Composite Patterns

The iterator pattern provides a way to access the elements of a collection (such as a list or a tree) sequentially without exposing its underlying structure.
The pattern involves an iterator interface that defines methods for accessing and traversing the elements in a collection.
