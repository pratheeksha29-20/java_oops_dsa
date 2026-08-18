package java_oops_dsa.java_oops.interfaces;
// =============================================================================
// BASIC INTERFACE
// =============================================================================

interface Animal {

    // Interface method is public + abstract by default
    void sound();
}


// =============================================================================
// IMPLEMENTING INTERFACE
// =============================================================================

class Dog implements Animal {

    // Must provide implementation of sound()

    @Override
    public void sound() {

        System.out.println("Dog barks");
    }
}


// =============================================================================
// ANOTHER IMPLEMENTING CLASS
// =============================================================================

class Cat implements Animal {

    @Override
    public void sound() {

        System.out.println("Cat meows");
    }
}


// =============================================================================
// INTERFACE WITH VARIABLE
// =============================================================================

interface Constants {

    // Automatically:
    // public static final

    int VALUE = 100;
}


// =============================================================================
// MULTIPLE INTERFACES
// =============================================================================

interface Camera {

    void takePhoto();
}


interface MusicPlayer {

    void playMusic();
}


// One class can implement multiple interfaces.

class SmartPhone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {

        System.out.println("Taking photo");
    }


    @Override
    public void playMusic() {

        System.out.println("Playing music");
    }
}


// =============================================================================
// PAYMENT INTERFACE
// =============================================================================

interface Payment {

    void pay(double amount);
}


// =============================================================================
// UPI
// =============================================================================

class UPI implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println("Paid ₹" + amount + " using UPI");
    }
}


// =============================================================================
// CARD
// =============================================================================

class Card implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println("Paid ₹" + amount + " using Card");
    }
}


// =============================================================================
// DEFAULT + STATIC METHODS
// =============================================================================

interface Vehicle {

    // Abstract method

    void drive();


    // Default method has implementation

    default void start() {

        System.out.println("Vehicle started");
    }


    // Static method belongs to interface

    static void info() {

        System.out.println("This is a Vehicle interface");
    }
}


// =============================================================================
// IMPLEMENTING VEHICLE
// =============================================================================

class Car implements Vehicle {

    @Override
    public void drive() {

        System.out.println("Car is driving");
    }

    // start() does not need to be implemented
    // because Vehicle already provides a default implementation.
}


// =============================================================================
// INTERFACE EXTENSION
// =============================================================================

interface A {

    void methodA();
}


interface B extends A {

    void methodB();
}


// B inherits methodA() from A.
// Therefore a class implementing B must implement:
// methodA()
// methodB()

class Test implements B {

    @Override
    public void methodA() {

        System.out.println("Method A");
    }


    @Override
    public void methodB() {

        System.out.println("Method B");
    }
}


// =============================================================================
// MAIN
// =============================================================================

public class interfaceDemo {

    public static void main(String[] args) {


        // =========================================================================
        // 1. BASIC INTERFACE
        // =========================================================================

        Dog dog = new Dog();

        dog.sound();


        Cat cat = new Cat();

        cat.sound();


        // =========================================================================
        // 2. INTERFACE VARIABLE
        // =========================================================================

        System.out.println(Constants.VALUE);


        // =========================================================================
        // 3. MULTIPLE INTERFACES
        // =========================================================================

        SmartPhone phone = new SmartPhone();

        phone.takePhoto();

        phone.playMusic();


        // =========================================================================
        // 4. INTERFACE + RUNTIME POLYMORPHISM
        // =========================================================================

        /*
        Interface reference
              ↓
        UPI object
        */

        Payment payment1 = new UPI();

        payment1.pay(1000);


        /*
        Same interface reference
              ↓
        Different object
        */

        Payment payment2 = new Card();

        payment2.pay(2000);


        // =========================================================================
        // 5. DEFAULT METHOD
        // =========================================================================

        Car car = new Car();

        car.start();

        car.drive();


        // =========================================================================
        // 6. STATIC INTERFACE METHOD
        // =========================================================================

        Vehicle.info();


        // =========================================================================
        // 7. INTERFACE EXTENSION
        // =========================================================================

        Test test = new Test();

        test.methodA();

        test.methodB();

    }
}