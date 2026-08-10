package methods;

public class method {

    // ======================================================
    // User Defined Method (No Parameters, No Return Value)
    // ======================================================

    public void displayMessage() {
        System.out.println("Welcome to Java Methods");
    }

    // ======================================================
    // User Defined Method (With Parameters)
    // ======================================================

    public void greet(String name) {
        System.out.println("Hello " + name);
    }

    // ======================================================
    // Method Returning Integer
    // ======================================================

    public int add(int a, int b) {
        return a + b;
    }

    // ======================================================
    // Static Method
    // ======================================================

    public static void displayCollege() {
        System.out.println("JSS Science and Technology University");
    }

    // ======================================================
    // Main Method
    // ======================================================

    public static void main(String[] args) {

        // Creating Object
        method obj = new method();

        // Calling Instance Method
        obj.displayMessage();

        // Calling Method with Parameters
        obj.greet("Pratheeksha");

        // Calling Method with Return Value
        int sum = obj.add(10, 20);
        System.out.println("Sum = " + sum);

        // Calling Static Method
        method.displayCollege();

        // Calling Predefined Methods
        System.out.println("Square Root = " + Math.sqrt(25));
        System.out.println("Random Number = " + Math.random());
        System.out.println("Maximum = " + Math.max(10, 50));
    }
}


/*
===============================================================================
                                JAVA METHODS
===============================================================================

Definition
----------
A Method is a block of code that performs a specific task.
It allows us to write a piece of logic once and reuse it whenever needed.

A method belongs to a class and is used to expose the behavior of objects.

Example:
Instead of writing the same code multiple times, write it once inside
a method and call it whenever required.

===============================================================================
WHY DO WE NEED METHODS?
===============================================================================

Suppose we want to print

"Welcome to Java"

10 times.

Without Methods:
---------------
We write the same statement 10 times.

With Methods:
-------------
Create one method

printMessage()

Call it 10 times.

Advantages:
-----------
• Code Reusability
• Modularity
• Readability
• Maintainability
• Easier Debugging

===============================================================================
GENERAL SYNTAX
===============================================================================

modifier returnType methodName(parameters){

    // Method Body

    return value;   // Optional
}

Example

public int add(int a, int b){

    return a + b;

}

===============================================================================
COMPONENTS OF A METHOD
===============================================================================

1. Modifier
-----------
Specifies who can access the method.

Examples

public
private
protected
default

-------------------------------------------------------------------------------

2. Return Type
--------------
Specifies what the method returns.

Examples

void
int
double
char
String
boolean

void means the method does not return anything.

-------------------------------------------------------------------------------

3. Method Name
--------------
The name used to identify and call the method.

Rules

• Should start with a lowercase letter.
• Follow camelCase.
• Usually starts with a verb.

Examples

display()

calculateSum()

findMaximum()

-------------------------------------------------------------------------------

4. Parameters
-------------
Inputs given to a method.

Syntax

datatype variableName

Example

add(int a, int b)

a and b are parameters.

Methods may have

• No Parameters
• One Parameter
• Multiple Parameters

-------------------------------------------------------------------------------

5. Method Body
--------------
Contains the actual statements to be executed.

Everything inside

{

}

belongs to the method body.

-------------------------------------------------------------------------------

6. Return Statement
-------------------
Used to send a value back to the calling method.

Example

return sum;

Only methods with non-void return types use return.

===============================================================================
WHY ARE METHODS IMPORTANT?
===============================================================================

1. Code Reusability
-------------------
Write once.
Use multiple times.

-------------------------------------------------------------------------------

2. Modularity
-------------
Large programs are divided into small independent methods.

Example

login()

calculateSalary()

sendMail()

logout()

-------------------------------------------------------------------------------

3. Readability
--------------
Smaller methods make code easier to understand.

-------------------------------------------------------------------------------

4. Maintainability
------------------
Changes are made in one place instead of multiple places.

-------------------------------------------------------------------------------

5. Easier Testing
-----------------
Each method can be tested independently.

===============================================================================
TYPES OF METHODS
===============================================================================

1. Predefined Method
--------------------

Methods already provided by Java.

Examples

Math.random()

Math.sqrt()

System.out.println()

String.length()

-------------------------------------------------------------------------------

2. User Defined Method
----------------------

Methods created by the programmer.

Example

display()

calculateArea()

findMax()

===============================================================================
INSTANCE METHOD
===============================================================================

Definition
----------

Belongs to an object.

Requires object creation.

Syntax

ClassName obj = new ClassName();

obj.methodName();

Example

Student s = new Student();

s.display();

===============================================================================
STATIC METHOD
===============================================================================

Definition
----------

Belongs to the class instead of an object.

Can be called without creating an object.

Syntax

ClassName.methodName();

Example

Math.random();

Math.sqrt(25);

===============================================================================
METHOD SIGNATURE
===============================================================================

A Method Signature consists of

• Method Name
• Number of Parameters
• Type of Parameters
• Order of Parameters

Return type is NOT part of the method signature.

Example

add(int a, int b)

Method Name : add

Parameters : int,int

===============================================================================
CALLING A METHOD
===============================================================================

Method Calling means transferring program control to the method.

Execution Steps

Method Call

↓

Method Executes

↓

Returns Control

↓

Continue Program

===============================================================================
METHOD CALL STACK
===============================================================================

Java uses a Call Stack to manage method execution.

Whenever a method is called

↓

A Stack Frame is created.

↓

Method Executes.

↓

Frame is removed.

↓

Control returns to the calling method.

The Call Stack follows

LIFO

(Last In First Out)

Example

main()

↓

A()

↓

B()

↓

C()

Execution Order

main

↓

A

↓

B

↓

C

Return Order

C

↓

B

↓

A

↓

main

===============================================================================
METHOD NAMING RULES
===============================================================================

• Begin with lowercase.
• Use camelCase.
• Use meaningful names.
• Prefer verb-based names.

Examples

calculateArea()

findMaximum()

displayStudent()

printDetails()

===============================================================================
WHERE ARE METHODS USED?
===============================================================================

Methods are used everywhere in Java.

Examples

Arrays.sort()

Math.max()

Scanner.nextInt()

String.substring()

Collections.sort()

Every Java program uses methods.

===============================================================================
METHODS IN DSA
===============================================================================

Methods help divide algorithms into reusable functions.

Examples

binarySearch()

merge()

partition()

reverseArray()

swap()

findMaximum()

calculateSum()

===============================================================================
SUMMARY
===============================================================================

Method
------
Block of reusable code.

Modifier
--------
Access Specifier.

Return Type
-----------
Type of value returned.

Method Name
-----------
Identifier of the method.

Parameters
----------
Inputs to the method.

Method Body
-----------
Actual implementation.

Return
------
Sends value back.

Call Stack
----------
Controls method execution.

Instance Method
---------------
Needs Object.

Static Method
-------------
Needs Class Name.

===============================================================================
*/