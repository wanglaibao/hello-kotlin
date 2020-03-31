# Kotlin – Data Types, Objects, and Classes

* Classes
* Abstract classes
* Interfaces
* Objects

* Inheritance
* Generics
* Type alias
* Null types
* Kotlin's type system
* Other types

### Classes

``
    a class is a template that provides a state, a
    behavior, and a type to instances
    In Kotlin, types can be inferred
``

### Properties

``
In Kotlin, a class's state is represented by properties
``


### Methods

``
In Kotlin, a class's behavior is defined by methods. Technically, a method is a member function
``


### Inheritance

``
In Kotlin, we can't extend a class that isn't open
The process of moving common behaviors and states to a parent class is called generalisation.
The process of extending classes and overriding behavior in a hierarchy is called specialisation.
Rule of thumb
Put general states and behaviors at the top of the hierarchy (generalisation), and
specific states and behaviors in subclasses (specialisation).
``

### abstract class

``
An abstract class is a class designed solely to be extended. An abstract class can't be instantiated
What makes abstract different from open
Both modifiers let us extend a class, but open lets us instantiate while abstract does not
Now that we can't instantiate abstract class, our open method in the abstract class isn't that useful anymore, and
all our subclasses override it anyway.
A method marked as abstract doesn't have a body, just the signature declaration
In Kotlin, a signature is composed of the method's name, its number,
the type of parameters, and the return type
``

### object expression

``
An object expression defines an instance of an
anonymous class that extends a type
``

```
fun main(args: Array<String>) {
    val mario = Customer("Mario")
    mario.eats(object : BakeryGood("TEST_1") {
        override fun name(): String {
                return "TEST_2"
        }
    })
}
```

``
Remember that an object expression is an instance, so it can be used to declare values
``

```
    val food: BakeryGood = object : BakeryGood("TEST_1") {
            override fun name(): String {
                return "TEST_2"
            }
    }

    mario.eats(food)
```