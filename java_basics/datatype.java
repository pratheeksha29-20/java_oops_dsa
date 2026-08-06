import java.util.*;

public class datatype {
    public static void main(String[] args) {
        byte b = 100;
        short s = 10000;
        int i = 30;
        long l = 346000L;
        float f = 3.14f;
        double d = 8.91;
        char c = 'p';
        boolean flag = true;

        System.out.println("byte :" + b);
        System.out.println("short :" + s);
        System.out.println("int :" + i);
        System.out.println("long :" + l);
        System.out.println("float :" + f);
        System.out.println("double :" + d);
        System.out.println("char :" + c);
        System.out.println("boolean :" + flag);

        //string
        String str = " Hii pratheeksha";
        System.out.println("\n String :" +str);

        // array

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("the given array is :" );
         for(int num:arr){
            System.out.print(num + " ");
        }

        // object creation
        student s1=new student();
        s1.name="pratheeksha";
        s1.age=20;
        System.out.println("\nthe student name is "+ s1.name);
        System.out.println("\nthe student age is "+ s1.age);

        //interface example
        animal a=new dog();
        a.sound();
    }

    //class example
    static class student{
        String name;
        int age;
    }
    
    // interface example
    interface animal{
        void sound();
    }

    static class dog implements animal{
        public void sound(){
            System.out.println("the dog sound is bow bow");
        }
    }
}

/*
===============================================================================
                            JAVA DATA TYPES
===============================================================================

Definition
----------
A Data Type specifies the type of value that a variable can store.
It tells the Java compiler:
1. What kind of value is being stored.
2. How much memory should be allocated.
3. What operations can be performed on that value.

Syntax
------
datatype variableName = value;

Example:
int age = 21;
double cgpa = 8.75;
char grade = 'A';
boolean placed = true;
String name = "Pratheeksha";

===============================================================================
WHY DO WE NEED DATA TYPES?
===============================================================================

Suppose we want to store

Age      -> 21
Name     -> "Rahul"
CGPA     -> 8.75
Placed   -> true

All of these are different kinds of data.

Java cannot store every value using the same type.

Different data requires:
• Different memory allocation
• Different operations
• Different storage format

Hence Java provides different Data Types.

===============================================================================
TYPES OF DATA TYPES
===============================================================================

Java Data Types are divided into two categories.

                    Data Types
                        |
        --------------------------------
        |                              |
  Primitive Data Types        Non-Primitive Data Types

Primitive
---------
Stores actual values directly.

Non-Primitive
-------------
Stores references (memory addresses) to objects.

===============================================================================
PRIMITIVE DATA TYPES
===============================================================================

Java has 8 primitive data types.

1. byte
--------
Size      : 1 Byte
Range     : -128 to 127
Default   : 0

Used when storing very small integer values.

Example:
byte b = 100;

-------------------------------------------------------------------------------

2. short
---------
Size      : 2 Bytes
Range     : -32768 to 32767
Default   : 0

Used for medium-sized integers.

Example:
short s = 25000;

-------------------------------------------------------------------------------

3. int
-------
Size      : 4 Bytes
Default   : 0

Most commonly used integer data type.

Example:
int age = 21;

-------------------------------------------------------------------------------

4. long
--------
Size      : 8 Bytes
Default   : 0L

Used for very large integers.

Example:
long population = 7800000000L;

Note:
Always use 'L' at the end.

-------------------------------------------------------------------------------

5. float
---------
Size      : 4 Bytes
Default   : 0.0f

Stores decimal values with less precision.

Example:
float pi = 3.14f;

Note:
Always use 'f' at the end.

-------------------------------------------------------------------------------

6. double
----------
Size      : 8 Bytes
Default   : 0.0d

Stores decimal values with higher precision.

Example:
double cgpa = 8.92;

This is the default decimal type in Java.

-------------------------------------------------------------------------------

7. char
--------
Size      : 2 Bytes

Stores a single Unicode character.

Example:
char grade = 'A';

Uses single quotes.

-------------------------------------------------------------------------------

8. boolean
-----------
Stores only

true
false

Example:
boolean isPlaced = true;

Used in conditions and decision making.

===============================================================================
NON-PRIMITIVE DATA TYPES
===============================================================================

Non-Primitive Data Types store references to objects.

Examples

• String
• Array
• Class
• Object
• Interface

===============================================================================
STRING
===============================================================================

String stores a sequence of characters.

Example:

String name = "Pratheeksha";

String uses double quotes.

String is immutable.

===============================================================================
ARRAY
===============================================================================

Array stores multiple values of the same data type.

Example:

int[] arr = {10,20,30};

Array index starts from 0.

===============================================================================
CLASS
===============================================================================

A Class is a blueprint or template used to create objects.

A class contains

• Variables (Data Members)
• Methods (Member Functions)
• Constructors

Example:

class Student{

    String name;
    int age;

    void display(){

        System.out.println(name);

    }

}

The class itself does not occupy memory for individual students.
Memory is allocated only when an object is created.

===============================================================================
OBJECT
===============================================================================

An Object is an instance of a class.

Syntax:

ClassName referenceVariable = new ClassName();

Example:

Student s1 = new Student();

Breakdown:

Student      -> Class Name

s1           -> Reference Variable

new          -> Creates memory in Heap

Student()    -> Calls Constructor

Object stores actual values.

Example:

s1.name = "Pratheeksha";
s1.age = 21;

===============================================================================
INTERFACE
===============================================================================

An Interface is a reference type that contains method declarations
and constants.

It defines WHAT a class should do, not HOW.

Example:

interface Animal{

    void sound();

}

A class implements an interface.

Example:

class Dog implements Animal{

    public void sound(){

        System.out.println("Bark");

    }

}

Interfaces are mainly used for abstraction and multiple inheritance.

===============================================================================
MEMORY REPRESENTATION
===============================================================================

Primitive Data Types

Variable
   |
 Value

Example

int x = 10;

x
|
10

------------------------------------------------------------

Non Primitive Data Types

Reference Variable
       |
       |
     Address
       |
      Heap
       |
     Object

Example

Student s = new Student();

Stack

s
|
|

Heap

Student Object

===============================================================================
DIFFERENCE BETWEEN PRIMITIVE AND NON-PRIMITIVE
===============================================================================

Primitive
---------
Stores actual values.

Fixed memory size.

Cannot call methods.

Example

int
double
char

------------------------------------------------

Non Primitive
-------------
Stores references.

Memory depends on object.

Can call methods.

Example

String
Array
Class
Object
Interface

===============================================================================
SUMMARY
===============================================================================

Primitive Data Types

byte
short
int
long
float
double
char
boolean

Non Primitive Data Types

String
Array
Class
Object
Interface

Default Integer

int

Default Decimal

double

===============================================================================
*/
