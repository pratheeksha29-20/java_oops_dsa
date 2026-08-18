package java_oops_dsa.java_oops.polymorphism;
// =============================================================================
// COMPILE-TIME POLYMORPHISM
// METHOD OVERLOADING
// =============================================================================

class Calculator {

    // Same method name
    // Different number of parameters

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Same method name
    // Different parameter types

    double add(double a, double b) {
        return a + b;
    }
}


// =============================================================================
// RUNTIME POLYMORPHISM
// METHOD OVERRIDING
// =============================================================================

class Parent {

    void show() {
        System.out.println("Parent show()");
    }

    void message() {
        System.out.println("Message from Parent");
    }
}


// =============================================================================
// CHILD CLASS
// =============================================================================

class Child extends Parent {

    // Overriding Parent's show()

    @Override
    void show() {
        System.out.println("Child show()");
    }
}


// =============================================================================
// ANOTHER CHILD CLASS
// =============================================================================

class ChildTwo extends Parent {

    @Override
    void show() {
        System.out.println("ChildTwo show()");
    }
}


// =============================================================================
// INTERFACE
// =============================================================================

interface Payment {

    void pay(double amount);
}


// =============================================================================
// UPI IMPLEMENTATION
// =============================================================================

class UPI implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}


// =============================================================================
// CARD IMPLEMENTATION
// =============================================================================

class Card implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card");
    }
}


// =============================================================================
// MAIN CLASS
// =============================================================================

public class polymorphism {

    public static void main(String[] args) {

        // =========================================================================
        // 1. COMPILE-TIME POLYMORPHISM
        // =========================================================================

        Calculator calculator = new Calculator();

        // Calls add(int, int)
        System.out.println(calculator.add(10, 20));

        // Calls add(int, int, int)
        System.out.println(calculator.add(10, 20, 30));

        // Calls add(double, double)
        System.out.println(calculator.add(10.5, 20.5));


        // =========================================================================
        // 2. NORMAL CHILD OBJECT
        // =========================================================================

        Child child = new Child();

        child.show();

        // message() is inherited from Parent
        child.message();


        // =========================================================================
        // 3. RUNTIME POLYMORPHISM
        // =========================================================================

        // Parent reference → Child object

        Parent p = new Child();

        // Child's overridden show() executes

        p.show();

        // Parent's message() executes because Child
        // has not overridden it.

        p.message();


        // =========================================================================
        // 4. SAME REFERENCE, DIFFERENT OBJECT
        // =========================================================================

        // Parent reference now points to ChildTwo

        p = new ChildTwo();

        // ChildTwo's overridden show() executes

        p.show();


        // =========================================================================
        // 5. INTERFACE + RUNTIME POLYMORPHISM
        // =========================================================================

        // Payment reference → UPI object

        Payment payment = new UPI();

        payment.pay(1000);


        // Same reference → Card object

        payment = new Card();

        payment.pay(2000);
    }
}