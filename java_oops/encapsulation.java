package java_oops_dsa.java_oops;

/*
===============================================================================
                         ENCAPSULATION IN JAVA
===============================================================================

DEFINITION
----------

Encapsulation is an OOP principle that binds DATA and METHODS together
into a single unit, usually a CLASS.

It also restricts direct access to data and provides controlled access
through methods.

Example:

class Programmer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


===============================================================================
HOW ENCAPSULATION IS ACHIEVED
===============================================================================

Main approach:

    1. Declare data members as PRIVATE.

    2. Provide PUBLIC getter and setter methods.

Example:

private String name;

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}


===============================================================================
GETTER
===============================================================================

A getter is used to READ / GET private data.

Example:

public String getName() {

    return name;

}


Flow:

private data
     ↓
 getter()
     ↓
outside code


===============================================================================
SETTER
===============================================================================

A setter is used to MODIFY / SET private data.

Example:

public void setName(String name) {

    this.name = name;

}


Flow:

outside value
     ↓
 setter()
     ↓
private data


===============================================================================
WHY USE GETTERS AND SETTERS?
===============================================================================

Because they provide CONTROLLED ACCESS.

A setter can validate data before storing it.

Example:

public void setAge(int age) {

    if(age >= 0) {

        this.age = age;

    }

}

Therefore invalid data can be rejected.


===============================================================================
DATA HIDING VS ENCAPSULATION
===============================================================================

DATA HIDING
-----------

Focus:

    Restricting direct access to data.

Example:

private int balance;


ENCAPSULATION
-------------

Focus:

    Wrapping data and methods together inside a class.

Example:

class Account {

    private int balance;

    public int getBalance() {
        return balance;
    }

}


Data hiding is a narrower concept.

Encapsulation is a broader concept that involves organizing
data and methods together and can use data hiding for protection.


===============================================================================
ADVANTAGES
===============================================================================

• Data Hiding
• Improved Maintainability
• Enhanced Security
• Code Reusability
• Better Modularity


===============================================================================
DISADVANTAGES
===============================================================================

• Increased Code Complexity
• Minor Performance Overhead
• Less Flexibility if access is over-restricted


===============================================================================
*/


// =============================================================================
// ENCAPSULATED CLASS
// =============================================================================

class Programmer {

    // =========================================================================
    // PRIVATE DATA
    // =========================================================================

    /*
    The data is private.

    Therefore, outside classes cannot directly access these variables.
    */

    private String name;

    private int age;

    private double salary;


    // =========================================================================
    // GETTER FOR NAME
    // =========================================================================

    public String getName() {

        return name;

    }


    // =========================================================================
    // SETTER FOR NAME
    // =========================================================================

    public void setName(String name) {

        this.name = name;

    }


    // =========================================================================
    // GETTER FOR AGE
    // =========================================================================

    public int getAge() {

        return age;

    }


    // =========================================================================
    // SETTER FOR AGE WITH VALIDATION
    // =========================================================================

    public void setAge(int age) {

        /*
        We can validate the value before storing it.

        This is one advantage of controlled access.
        */

        if(age >= 0) {

            this.age = age;

        }
        else {

            System.out.println("Age cannot be negative.");

        }

    }


    // =========================================================================
    // GETTER FOR SALARY
    // =========================================================================

    public double getSalary() {

        return salary;

    }


    // =========================================================================
    // SETTER FOR SALARY WITH VALIDATION
    // =========================================================================

    public void setSalary(double salary) {

        if(salary >= 0) {

            this.salary = salary;

        }
        else {

            System.out.println("Salary cannot be negative.");

        }

    }

}


// =============================================================================
// MAIN CLASS
// =============================================================================

public class encapsulation {

    public static void main(String[] args) {


        // =========================================================================
        // CREATE OBJECT
        // =========================================================================

        Programmer p = new Programmer();


        // =========================================================================
        // SET DATA USING SETTERS
        // =========================================================================

        p.setName("Pratheeksha");

        p.setAge(21);

        p.setSalary(50000);


        // =========================================================================
        // GET DATA USING GETTERS
        // =========================================================================

        System.out.println("Name   : " + p.getName());

        System.out.println("Age    : " + p.getAge());

        System.out.println("Salary : " + p.getSalary());


        // =========================================================================
        // VALIDATION
        // =========================================================================

        /*
        Trying to set invalid data:

        The setter checks the value before modifying
        the private variable.
        */

        p.setAge(-5);

        p.setSalary(-1000);


        // =========================================================================
        // DIRECT ACCESS IS NOT ALLOWED
        // =========================================================================

        /*
        The following statements would produce compilation errors:

        p.name = "Rahul";
        p.age = -10;
        p.salary = -5000;

        Why?

        Because name, age and salary are PRIVATE.

        They can only be accessed through the methods
        provided by the Programmer class.
        */

    }
}