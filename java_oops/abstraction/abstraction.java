package java_oops_dsa.java_oops.abstraction;

 
// =============================================================================
// ABSTRACT CLASS
// =============================================================================

abstract class Animal {

    // Instance variable
    String name;


    // Abstract class can have a constructor

    Animal(String name) {

        this.name = name;

        System.out.println("Animal constructor");
    }


    // Abstract method
    // No implementation/body

    abstract void sound();


    // Concrete method
    // Has implementation

    void eat() {

        System.out.println(name + " is eating");
    }
}


// =============================================================================
// CHILD CLASS - DOG
// =============================================================================

class Dog extends Animal {

    Dog(String name) {

        // Calls parent constructor
        super(name);

        System.out.println("Dog constructor");
    }


    // Implementing abstract method

    @Override
    void sound() {

        System.out.println(name + " barks");
    }
}


// =============================================================================
// CHILD CLASS - CAT
// =============================================================================

class Cat extends Animal {

    Cat(String name) {

        super(name);
    }


    @Override
    void sound() {

        System.out.println(name + " meows");
    }
}


// =============================================================================
// PAYMENT ABSTRACTION
// =============================================================================

abstract class Payment {

    // Abstract method

    abstract void pay(double amount);


    // Concrete method

    void paymentMessage() {

        System.out.println("Payment process started");
    }
}


// =============================================================================
// UPI
// =============================================================================

class UPI extends Payment {

    @Override
    void pay(double amount) {

        System.out.println("Paid ₹" + amount + " using UPI");
    }
}


// =============================================================================
// CARD
// =============================================================================

class Card extends Payment {

    @Override
    void pay(double amount) {

        System.out.println("Paid ₹" + amount + " using Card");
    }
}


// =============================================================================
// INTERFACE
// =============================================================================

interface Camera {

    void takePhoto();
}


interface MusicPlayer {

    void playMusic();
}


// Multiple interfaces can be implemented

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
// MAIN CLASS
// =============================================================================

public class abstraction {

    public static void main(String[] args) {

        // =========================================================================
        // ABSTRACT CLASS + CHILD OBJECT
        // =========================================================================

        Dog dog = new Dog("Bruno");

        dog.sound();

        dog.eat();


        // =========================================================================
        // ANOTHER CHILD CLASS
        // =========================================================================

        Cat cat = new Cat("Kitty");

        cat.sound();

        cat.eat();


        // =========================================================================
        // ABSTRACT CLASS REFERENCE + CHILD OBJECT
        // =========================================================================

        Animal animal = new Dog("Rocky");

        animal.sound();

        animal.eat();


        // =========================================================================
        // PAYMENT ABSTRACTION
        // =========================================================================

        Payment payment1 = new UPI();

        payment1.paymentMessage();

        payment1.pay(1000);


        Payment payment2 = new Card();

        payment2.paymentMessage();

        payment2.pay(2000);


        // =========================================================================
        // INTERFACE
        // =========================================================================

        SmartPhone phone = new SmartPhone();

        phone.takePhoto();

        phone.playMusic();
    }
}