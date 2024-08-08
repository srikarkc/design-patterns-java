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
