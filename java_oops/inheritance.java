package java_oops_dsa.java_oops;


/*
===============================================================================
                         INHERITANCE IN JAVA
===============================================================================

DEFINITION
----------

Inheritance is an OOP concept where one class acquires the
properties (fields) and behaviors (methods) of another class.

It mainly provides:

    • Code Reusability
    • Better organization
    • Class hierarchy
    • Polymorphism

Example:

        Parent
          ↑
          |
        Child

The Child class can use accessible members of the Parent class.

===============================================================================
BASIC SYNTAX
===============================================================================

class Parent {

    // fields and methods

}

class Child extends Parent {

    // additional fields and methods

}

The keyword used for class inheritance is:

                        extends


===============================================================================
IMPORTANT TERMINOLOGY
===============================================================================

Parent Class
-------------
The class whose properties and methods are inherited.

Also called:

    • Superclass
    • Base class


Child Class
-----------
The class that inherits from another class.

Also called:

    • Subclass
    • Derived class


extends
-------
Keyword used to establish inheritance between two classes.


Example:

class Animal {

}

class Dog extends Animal {

}


Here:

Animal → Parent / Superclass / Base class

Dog    → Child / Subclass / Derived class


===============================================================================
WHY DO WE USE INHERITANCE?
===============================================================================

Suppose we have:

class Vehicle {

    void start() {
        System.out.println("Vehicle starts");
    }

}

Instead of rewriting start() in every class:

    Car
    Bus
    Bike

we can inherit Vehicle.

        Vehicle
        /     \
       /       \
     Car       Bus

Both Car and Bus can reuse start().

Therefore:

                INHERITANCE
                     ↓
              CODE REUSABILITY


===============================================================================
SIMPLE INHERITANCE EXAMPLE
===============================================================================

class Animal {

    void eat() {
        System.out.println("Eating");
    }

}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking");
    }

}

Dog d = new Dog();

d.eat();      // inherited from Animal
d.bark();     // own method


Dog object can access:

    eat()  → Parent method
    bark() → Child method


===============================================================================
TYPES OF INHERITANCE IN JAVA
===============================================================================

1. Single Inheritance

2. Multilevel Inheritance

3. Hierarchical Inheritance

4. Multiple Inheritance
   → NOT supported using classes
   → Can be achieved using interfaces

5. Hybrid Inheritance
   → Can be achieved using interfaces


===============================================================================
1. SINGLE INHERITANCE
===============================================================================

One child inherits from one parent.

                    Vehicle
                       ↑
                       |
                      Car

Example:

class Vehicle {

}

class Car extends Vehicle {

}


There is only ONE parent and ONE child.


===============================================================================
2. MULTILEVEL INHERITANCE
===============================================================================

Inheritance occurs in multiple levels.

                    Vehicle
                       ↑
                       |
                  FourWheeler
                       ↑
                       |
                      Car


Car inherits from FourWheeler.

FourWheeler inherits from Vehicle.

Therefore Car indirectly gets accessible members of Vehicle.


===============================================================================
3. HIERARCHICAL INHERITANCE
===============================================================================

Multiple child classes inherit from the SAME parent.

                    Vehicle
                  /         \
                 /           \
               Car           Bus


Car extends Vehicle.

Bus extends Vehicle.


===============================================================================
4. MULTIPLE INHERITANCE
===============================================================================

Multiple inheritance means:

One class inherits from MORE THAN ONE parent.

Example concept:

        Parent1       Parent2
             \         /
              \       /
               Child


Java does NOT support multiple inheritance using classes.

This means we cannot write:

class Child extends Parent1, Parent2

This is not allowed.

However, Java can achieve multiple inheritance
through INTERFACES.


===============================================================================
5. HYBRID INHERITANCE
===============================================================================

Hybrid inheritance is a combination of two or more
types of inheritance.

In Java, hybrid inheritance involving multiple inheritance
can be achieved through interfaces.


===============================================================================
IS-A RELATIONSHIP
===============================================================================

Inheritance represents an IS-A relationship.

Example:

class Animal {

}

class Dog extends Animal {

}


Dog IS-A Animal.

Car IS-A Vehicle.

Cat IS-A Animal.


The IS-A relationship is created using:

                        extends


===============================================================================
INSTANCEOF
===============================================================================

The instanceof operator is used to check whether an object
belongs to a particular class/type.

Example:

Dog d = new Dog();

d instanceof Dog

→ true

d instanceof Animal

→ true

because Dog extends Animal.


===============================================================================
WHAT CAN A SUBCLASS DO?
===============================================================================

A subclass can:

    • Use inherited fields
    • Use inherited methods
    • Declare new fields
    • Declare new methods
    • Override inherited instance methods
    • Hide inherited static methods
    • Have its own constructor
    • Invoke parent constructor using super


===============================================================================
METHOD OVERRIDING
===============================================================================

A child class can provide its own implementation of an
inherited instance method.

Example:

class Animal {

    void sound() {
        System.out.println("Animal sound");
    }

}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

}


Dog changes the implementation of sound().

This is called:

                    METHOD OVERRIDING


It is also connected to:

                    RUNTIME POLYMORPHISM


===============================================================================
PARENT REFERENCE + CHILD OBJECT
===============================================================================

Example:

Animal a = new Dog();

Here:

    Reference type  → Animal
    Object type     → Dog


When:

a.sound();

is called, Java executes the overridden Dog version
of sound() at runtime.

This is an important connection between:

        Inheritance
             ↓
        Overriding
             ↓
        Runtime Polymorphism


===============================================================================
CONSTRUCTOR AND INHERITANCE
===============================================================================

When a child object is created, the parent constructor
is executed before the child constructor.

Example:

class Parent {

    Parent() {
        System.out.println("Parent");
    }

}

class Child extends Parent {

    Child() {
        System.out.println("Child");
    }

}

Child c = new Child();


Output:

Parent
Child


The parent constructor executes first.


===============================================================================
super KEYWORD
===============================================================================

The super keyword is used to refer to the parent class.

It can be used to:

    1. Access parent variable
    2. Call parent method
    3. Call parent constructor


Example:

super();

Calls parent constructor.


super.display();

Calls parent method.


super.x;

Accesses parent variable.


===============================================================================
ADVANTAGES OF INHERITANCE
===============================================================================

1. Code Reusability

    Child can reuse parent code.

2. Abstraction

    Common functionality can be placed in a parent class.

3. Class Hierarchy

    Helps represent relationships between classes.

4. Polymorphism

    Child classes can override parent methods and provide
    different behavior.


===============================================================================
LIMITATIONS OF INHERITANCE
===============================================================================

1. Complexity

Deep inheritance hierarchies can make code difficult to understand.

2. Tight Coupling

Changes in the parent class can affect child classes.

Therefore, very deep inheritance should be avoided when
composition or interfaces provide a better design.


===============================================================================
IMPORTANT INTERVIEW POINTS
===============================================================================

Remember these:

    extends
        ↓
    Used for class inheritance


    Parent
        ↓
    Superclass / Base class


    Child
        ↓
    Subclass / Derived class


    IS-A
        ↓
    Represents inheritance


    Java supports:
        • Single
        • Multilevel
        • Hierarchical

    Multiple inheritance:
        • Not through classes
        • Possible through interfaces


    Parent reference + Child object:

        Animal a = new Dog();

        ↓

    Runtime polymorphism


===============================================================================
*/


// =============================================================================
// 1. PARENT CLASS
// =============================================================================

class Vehicle {

    // Parent class variable

    String type = "Vehicle";


    // Parent class method

    void start() {

        System.out.println("Vehicle starts");

    }


    void stop() {

        System.out.println("Vehicle stops");

    }

}


// =============================================================================
// 2. SINGLE INHERITANCE
// =============================================================================

class Car extends Vehicle {

    /*
    Car inherits:

        type
        start()
        stop()

    from Vehicle.
    */


    // Child's own method

    void drive() {

        System.out.println("Car is driving");

    }

}


// =============================================================================
// 3. MULTILEVEL INHERITANCE
// =============================================================================

class FourWheeler extends Vehicle {

    void wheels() {

        System.out.println("Has four wheels");

    }

}


class SportsCar extends FourWheeler {

    void turbo() {

        System.out.println("Turbo enabled");

    }

}


// =============================================================================
// 4. HIERARCHICAL INHERITANCE
// =============================================================================

class Bus extends Vehicle {

    void passengerMode() {

        System.out.println("Bus carries passengers");

    }

}


// =============================================================================
// 5. METHOD OVERRIDING
// =============================================================================

class Animal {

    void sound() {

        System.out.println("Animal makes a sound");

    }

}


class Dog extends Animal {

    /*
    Dog inherits sound() from Animal.

    But Dog provides its OWN implementation.

    This is METHOD OVERRIDING.
    */

    @Override
    void sound() {

        System.out.println("Dog barks");

    }

}


// =============================================================================
// 6. PARENT CONSTRUCTOR + CHILD CONSTRUCTOR
// =============================================================================

class Parent {

    Parent() {

        System.out.println("Parent constructor");

    }

}


class Child extends Parent {

    Child() {

        /*
        super() is automatically called here
        if we do not explicitly write it.

        Therefore Parent constructor executes first.
        */

        System.out.println("Child constructor");

    }

}


// =============================================================================
// 7. SUPER KEYWORD
// =============================================================================

class ParentExample {

    int x = 10;


    void display() {

        System.out.println("Parent display()");

    }

}


class ChildExample extends ParentExample {

    int x = 20;


    void show() {

        // Access child variable

        System.out.println("Child x = " + x);


        // Access parent variable

        System.out.println("Parent x = " + super.x);


        // Call parent method

        super.display();

    }

}


// =============================================================================
// 8. MULTIPLE INHERITANCE THROUGH INTERFACES
// =============================================================================

interface LandVehicle {

    default void landInfo() {

        System.out.println("This is a Land Vehicle");

    }

}


interface WaterVehicle {

    default void waterInfo() {

        System.out.println("This is a Water Vehicle");

    }

}


/*
A class can implement multiple interfaces.

This gives Java a way to achieve multiple inheritance
of behavior through interfaces.
*/

class AmphibiousVehicle implements LandVehicle, WaterVehicle {

    void info() {

        System.out.println("This vehicle can move on land and water");

    }

}


// =============================================================================
// MAIN CLASS
// =============================================================================

public class inheritance {

    public static void main(String[] args) {


        // =========================================================================
        // SINGLE INHERITANCE
        // =========================================================================

        System.out.println("----- SINGLE INHERITANCE -----");

        Car car = new Car();


        // Method inherited from Vehicle

        car.start();


        // Method belonging to Car

        car.drive();


        // Another inherited method

        car.stop();


        // =========================================================================
        // MULTILEVEL INHERITANCE
        // =========================================================================

        System.out.println("\n----- MULTILEVEL INHERITANCE -----");

        SportsCar sportsCar = new SportsCar();


        // From Vehicle

        sportsCar.start();


        // From FourWheeler

        sportsCar.wheels();


        // From SportsCar

        sportsCar.turbo();


        // =========================================================================
        // HIERARCHICAL INHERITANCE
        // =========================================================================

        System.out.println("\n----- HIERARCHICAL INHERITANCE -----");

        Bus bus = new Bus();


        // Inherited from Vehicle

        bus.start();


        // Bus's own method

        bus.passengerMode();


        // =========================================================================
        // METHOD OVERRIDING
        // =========================================================================

        System.out.println("\n----- METHOD OVERRIDING -----");

        Dog dog = new Dog();

        dog.sound();


        /*
        Dog's sound() executes instead of Animal's sound().

        Why?

        Because Dog overrides sound().
        */


        // =========================================================================
        // RUNTIME POLYMORPHISM
        // =========================================================================

        System.out.println("\n----- RUNTIME POLYMORPHISM -----");

        /*
        Parent reference
                ↓
        points to
                ↓
        Child object
        */

        Animal animal = new Dog();


        /*
        Although reference type is Animal,

        actual object is Dog.

        Therefore overridden Dog sound() executes.
        */

        animal.sound();


        // =========================================================================
        // CONSTRUCTOR CHAINING
        // =========================================================================

        System.out.println("\n----- CONSTRUCTOR CHAINING -----");

        Child child = new Child();


        /*
        Output:

        Parent constructor
        Child constructor

        Parent constructor executes first.
        */


        // =========================================================================
        // SUPER KEYWORD
        // =========================================================================

        System.out.println("\n----- SUPER KEYWORD -----");

        ChildExample example = new ChildExample();

        example.show();


        // =========================================================================
        // INSTANCEOF
        // =========================================================================

        System.out.println("\n----- INSTANCEOF -----");

        System.out.println(dog instanceof Dog);

        System.out.println(dog instanceof Animal);


        /*
        Both are true.

        Dog is a Dog.

        Dog is also an Animal because:

            Dog extends Animal
        */


        // =========================================================================
        // MULTIPLE INHERITANCE THROUGH INTERFACES
        // =========================================================================

        System.out.println("\n----- MULTIPLE INHERITANCE THROUGH INTERFACES -----");

        AmphibiousVehicle vehicle = new AmphibiousVehicle();

        vehicle.info();

        vehicle.landInfo();

        vehicle.waterInfo();


        /*
        AmphibiousVehicle implements:

            LandVehicle
            WaterVehicle

        Therefore it can use methods from both interfaces.
        */

    }
}