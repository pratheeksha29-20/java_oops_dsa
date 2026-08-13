package java_oops_dsa.java_oops;



/*
===============================================================================
                         CONSTRUCTORS IN JAVA
===============================================================================

A constructor is a special member of a class that is automatically called
when an object is created.

Main purpose:
    Initialize the state/data of an object.

Example:

Student s1 = new Student("Pratheeksha", 101, 85);

Execution:

    new Student(...)
          ↓
    Constructor is called
          ↓
    Object is initialized


===============================================================================
RULES OF CONSTRUCTORS
===============================================================================

1. Constructor name must be the SAME as the class name.

2. Constructor does NOT have a return type.

   Not even void.

3. Constructor can accept parameters.


===============================================================================
TYPES OF CONSTRUCTORS
===============================================================================

1. Default / No-Argument Constructor
2. Parameterized Constructor
3. Copy Constructor
4. Private Constructor


===============================================================================
1. DEFAULT / NO-ARGUMENT CONSTRUCTOR
===============================================================================

A constructor without parameters.

Example:

Student() {

}

If no constructor is explicitly written,
Java can provide a default no-argument constructor.


===============================================================================
2. PARAMETERIZED CONSTRUCTOR
===============================================================================

A constructor that accepts parameters.

Example:

Student(String name, int rollNo) {

    this.name = name;
    this.rollNo = rollNo;

}

It is used to initialize an object with user-provided values.


===============================================================================
3. COPY CONSTRUCTOR
===============================================================================

Java does not provide a built-in copy constructor like C++.

We can create our own copy constructor.

It accepts another object of the SAME CLASS.

Example:

Student(Student other) {

    this.name = other.name;
    this.rollNo = other.rollNo;

}

It copies the data from one object into another object.


===============================================================================
4. PRIVATE CONSTRUCTOR
===============================================================================

A private constructor cannot be accessed from outside its class.

Common uses:

    • Singleton pattern
    • Utility / helper classes

Example:

private Student() {

}


===============================================================================
CONSTRUCTOR OVERLOADING
===============================================================================

A class can have multiple constructors if their parameter lists are different.

Example:

Student()

Student(String name)

Student(String name, int rollNo)

Student(String name, int rollNo, int marks)

The correct constructor is selected based on the arguments passed.


===============================================================================
`this` KEYWORD
===============================================================================

When a constructor parameter has the same name as an instance variable:

String name;

Student(String name) {

    this.name = name;

}

Here:

    this.name
        ↓
    Instance variable of the current object

    name
        ↓
    Constructor parameter


===============================================================================
CONSTRUCTOR VS METHOD
===============================================================================

CONSTRUCTOR:

    • Same name as class
    • No return type
    • Called automatically during object creation
    • Used mainly for initialization

METHOD:

    • Can have any valid name
    • Has a return type or void
    • Called explicitly
    • Used to perform an operation


===============================================================================
*/


// =============================================================================
// STUDENT CLASS
// =============================================================================

class Student {

    // =========================================================================
    // INSTANCE VARIABLES
    // =========================================================================

    String name;

    int rollNo;

    int marks;


    // =========================================================================
    // 1. DEFAULT / NO-ARGUMENT CONSTRUCTOR
    // =========================================================================

    Student() {

        name = "Unknown";

        rollNo = 0;

        marks = 0;

    }


    // =========================================================================
    // 2. PARAMETERIZED CONSTRUCTOR
    // =========================================================================

    Student(String name, int rollNo, int marks) {

        /*
        this.name
            ↓
        Instance variable belonging to the current object.

        name
            ↓
        Parameter received by the constructor.
        */

        this.name = name;

        this.rollNo = rollNo;

        this.marks = marks;

    }


    // =========================================================================
    // 3. COPY CONSTRUCTOR
    // =========================================================================

    Student(Student other) {

        /*
        'other' refers to another Student object.

        We copy its data into the new object.
        */

        this.name = other.name;

        this.rollNo = other.rollNo;

        this.marks = other.marks;

    }


    // =========================================================================
    // METHOD
    // =========================================================================

    void display() {

        System.out.println("Name   : " + name);

        System.out.println("RollNo : " + rollNo);

        System.out.println("Marks  : " + marks);

    }

}


// =============================================================================
// PRIVATE CONSTRUCTOR EXAMPLE
// =============================================================================

class Utility {

    /*
    Private constructor prevents objects of this class
    from being created from outside the class.
    */

    private Utility() {

        System.out.println("Private constructor called");

    }


    // Static method can be called without creating an object.

    static void displayMessage() {

        System.out.println("Utility method called");

    }

}


// =============================================================================
// MAIN CLASS
// =============================================================================

public class constructors {

    public static void main(String[] args) {


        // =========================================================================
        // 1. DEFAULT CONSTRUCTOR
        // =========================================================================

        Student s1 = new Student();

        System.out.println("Object 1 - Default Constructor:");

        s1.display();


        // =========================================================================
        // 2. PARAMETERIZED CONSTRUCTOR
        // =========================================================================

        Student s2 = new Student(
                "Pratheeksha",
                101,
                85
        );

        System.out.println("\nObject 2 - Parameterized Constructor:");

        s2.display();


        // =========================================================================
        // 3. COPY CONSTRUCTOR
        // =========================================================================

        Student s3 = new Student(s2);

        System.out.println("\nObject 3 - Copy Constructor:");

        s3.display();


        // =========================================================================
        // 4. PRIVATE CONSTRUCTOR
        // =========================================================================

        /*
        The following would cause an ERROR:

        Utility u = new Utility();

        Why?

        Utility() is private.

        Therefore, it cannot be accessed from outside the Utility class.
        */

        Utility.displayMessage();


        // =========================================================================
        // UNDERSTANDING THE OBJECTS
        // =========================================================================

        /*
        s1
        ↓
        Default constructor
        ↓
        name   = Unknown
        rollNo = 0
        marks  = 0


        s2
        ↓
        Parameterized constructor
        ↓
        name   = Pratheeksha
        rollNo = 101
        marks  = 85


        s3
        ↓
        Copy constructor
        ↓
        Copies values from s2
        ↓
        name   = Pratheeksha
        rollNo = 101
        marks  = 85


        IMPORTANT:

        s2 and s3 have the SAME DATA.

        But s2 and s3 are still DIFFERENT OBJECTS.
        */


        // =========================================================================
        // FINAL OUTPUT
        // =========================================================================

        /*
        Object 1 - Default Constructor:
        Name   : Unknown
        RollNo : 0
        Marks  : 0

        Object 2 - Parameterized Constructor:
        Name   : Pratheeksha
        RollNo : 101
        Marks  : 85

        Object 3 - Copy Constructor:
        Name   : Pratheeksha
        RollNo : 101
        Marks  : 85

        Utility method called
        */

    }
}
