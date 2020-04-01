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


### Interfaces

``
The open and abstract classes are great for creating hierarchies, but sometimes they aren't enough
We also need interface type,An interface is a type that defines a behavior,
In an interface, all methods are open and a method with no implementation doesn't need an abstract
modifier
``


### the differences between an open/abstract class and an interface

* similarities

``
Both are types,
Both define behaviors as methods,
Although open classes can be instantiated directly, neither abstract classes nor interfaces can
``


* differences
``
A class can extend just one class (open or abstract), but can extend many interfaces;
An open/abstract class can have constructors;
An open/abstract class can initialize its own values;
An interface's values must be initialized in the classes that extend the interface;
An open class must declare the methods that can be overridden as open;
An abstract class could have both open and abstract methods
``


### When should we use open class or abstract class or interface

* Use open class when:

``
The class should be extended and instantiated
``

* Use abstract class when:

``
The class can't be instantiated;
A constructor is needed it;
There is initialization logic (using init blocks)
``


```
    abstract class BakeryGood(val flavour: String) {
        init {
            println("Preparing a new bakery good")
        }

        fun eat(): String {
            return "nom, nom, nom... delicious $flavour ${name()}"
        }

        abstract fun name(): String

    }
```


* Use interface when

``
Multiple inheritances must be applied;
No initialized logic is needed;
As with abstract classes, object expressions can be used with interfaces
``

```
    val somethingFried = object : Fried {
            override fun fry(): String {
                return "TEST_3"
            }
    }

```

```
My recommendation is that you should always start with an interface.
Interfaces are more straightforward and cleaner; they also allow a more modular design.
In the case that data initialization/constructors are needed, move to abstract/open.
```


### Objects

* Objects are natural singletons

``
A singleton is a type that has just one and only one instance and every object in Kotlin is a singleton;
``

* Object expressions don't need to extend any type

```
    fun main(args: Array<String>) {
        val expression = object {
            val property = ""
            fun method(): Int {
                println("from an object expressions")
                return 42
            }
        }

        val i = "${expression.method()} ${expression.property}"
        println(i)
    }


    In this case, the expression value is an object that doesn't have any specific type. We can access its
    properties and functions.
```


* object expressions without type can be used only locally, inside a
  method, or privately, inside a class


```
    class Outer {
        val internal = object {
            val property = ""
        }
    }

    fun main(args: Array<String>) {
        val outer = Outer()
        println(outer.internal.property) // Compilation error: Unresolved reference: property
    }


    In this case, the property value can't be accessed
```

### Object declarations

``
An object can also have a name. This kind of object is called an object declaration:
Objects also can extend other types: such as interface,abstract class, open class
``


### Companion objects

``
Objects declared inside a class/interface can be marked as companion objects;
methods inside the companion object can be used directly, using the class name without instantiating it
``

```
    class Cupcake(flavour: String) : BakeryGood(flavour), Bakeable {

        override fun name(): String {
            return "cupcake"
        }

        companion object {
            fun almond(): Cupcake {
                return Cupcake("almond")
            }

            fun cheese(): Cupcake {
                return Cupcake("cheese")
            }
        }
    }

```

``
Companion object's methods can't be used from instances
``

```
    fun main(args: Array<String>) {
        val myAlmondCupcake = Cupcake.almond()
        val myCheeseCupcake = myAlmondCupcake.cheese() //Compilation error: Unresolved reference: cheese
    }

```

``
Companion objects can be used outside the class as values with the name Companion
``

```
    fun main(args: Array<String>) {
        val factory: Cupcake.Companion = Cupcake.Companion
    }

```

``
Alternatively, a Companion object can have a name
``

```
    class Cupcake(flavour: String) : BakeryGood(flavour), Bakeable {

        override fun name(): String {
            return "cupcake"
        }

        companion object Factory {
            fun almond(): Cupcake {
                return Cupcake("almond")
            }

            fun cheese(): Cupcake {
                return Cupcake("cheese")
            }

        }
    }

    fun main(args: Array<String>) {
        val factory: Cupcake.Factory = Cupcake.Factory
    }

```

``
They can also be used without a name, as shown in the following code
``

```
    fun main(args: Array<String>) {
        val factory: Cupcake.Factory = Cupcake
    }

```

``
Don't be confused by this syntax. The Cupcake value without parenthesis is the companion
object; Cupcake() is an instance.
``


### Type alias

``
Type alias provides a way to define names of types that already exist. Type alias can help to make
complex types easier to read, and can also provide other hints.
``


### Safe calls


### The Elvis (?:) operator


### The (!!) operator

### Data classes

``
Creating classes whose primary purpose is to hold data is a common pattern in Kotlin;
Kotlin has a particular kind of class for this purpose: data class
``

```
    data class Item(val product: BakeryGood,
                    val unitPrice: Double,
                    val quantity: Int)

```


###  some restrictions on data class

* The primary constructor should have at least one parameter
* The primary constructor's parameters must be val or var
* Data classes can't be abstract, open, sealed, or inner

###  benefits of data classes

* Canonical methods

``
Canonical methods are the methods declared in Any .
``

* The copy() method

``
Sometimes, we want to reuse values from an existing instance.
The copy() method lets us create new instances of a data class, overriding the parameters that we want
``


```
    val myItem = Item(myAlmondCupcake, 0.40, 5)
    val mySecondItem = myItem.copy(product = myCaramelCupcake) //named parameter
```


* Destructuring methods

``
By convention, any instance of a data class that has a series of methods named component1() , component2()
and so on can be used in a destructuring declaration.
``


