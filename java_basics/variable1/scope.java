package variable1;

import java.util.*;

// local variable example
public class scope {
    // instance variable example
    int c = 30;
    //static variable example
    static String college = "JSSSTU"; 
    public static void main(String[] args) {
        // local variable example
        int a = 10;
        int b = 20;

        scope obj = new scope();
        int sum = add(a, b);
        obj.multiply(sum, 0);
    }

    // parameter variable example
    static int add(int x, int y) {
        int sum = x + y; // local variable inside method

        // block scope example
        if (true) {
            sum = x + y;
            System.out.println("the sum of x and y is :" + sum);
        }

        return sum;
    }

    void multiply(int z, int product) {
        product = z * c;
        System.out.println("the product of z and c is :" + product);
        System.out.println("the college is :" + college);
    }

}
/*
=========================================
        VARIABLE SCOPE IN JAVA
=========================================

Definition:
------------
Scope is the region of a program where a variable can be accessed.
A variable cannot be used outside its scope.

Java has 5 types of variable scope.

=========================================
1. LOCAL VARIABLE
=========================================

Declared:
- Inside a method.

Accessible:
- Only inside that method.

Memory:
- Stack Memory

Lifetime:
- Created when the method starts.
- Destroyed when the method ends.

Example:

void display() {
    int age = 21;
}

Cannot access 'age' outside display().

=========================================
2. BLOCK VARIABLE
=========================================

Declared:
- Inside a block { }

Examples:
- if
- else
- for
- while
- switch
- try-catch

Accessible:
- Only inside that block.

Memory:
- Stack Memory

Lifetime:
- Destroyed after leaving the block.

Example:

if(true){
    int x = 10;
}

System.out.println(x); // ERROR

=========================================
3. PARAMETER VARIABLE
=========================================

Declared:
- Inside method parameters.

Example:

void add(int a, int b){

}

Accessible:
- Only inside that method.

Memory:
- Stack Memory

Lifetime:
- Exists only while the method executes.

=========================================
4. INSTANCE VARIABLE
=========================================

Also called:
- Object Variable
- Non-static Variable

Declared:
- Inside class
- Outside all methods

Example:

class Student{

    int age;

}

Accessible:
- By every method of the class.
- Outside the class using an object
  (depending on access modifier).

Memory:
- Heap Memory

Lifetime:
- Exists as long as the object exists.

Every object gets its own copy.

Example:

Student s1 = new Student();
Student s2 = new Student();

s1.age = 20;
s2.age = 25;

=========================================
5. STATIC VARIABLE
=========================================

Also called:
- Class Variable

Declared:
- Inside class
- Outside methods
- Using static keyword

Example:

class Student{

    static String college = "JSSSTU";

}

Accessible:
- By all objects.
- Using class name:
  Student.college

Memory:
- Method Area (Class Area)

Lifetime:
- Exists until the program ends.

Only ONE copy exists.

=========================================
MEMORY SUMMARY
=========================================

Local Variable
    -> Stack

Block Variable
    -> Stack

Parameter Variable
    -> Stack

Instance Variable
    -> Heap

Static Variable
    -> Method Area (Class Area)

=========================================
LIFETIME SUMMARY
=========================================

Local Variable
    -> Till method ends

Block Variable
    -> Till block ends

Parameter Variable
    -> Till method ends

Instance Variable
    -> Till object is destroyed

Static Variable
    -> Till program terminates

=========================================
INTERVIEW QUESTIONS
=========================================

Q1. Can a local variable be accessed outside its method?
Ans:
No.

Q2. Can a block variable be accessed outside the block?
Ans:
No.

Q3. Where are instance variables stored?
Ans:
Heap Memory.

Q4. Where are local variables stored?
Ans:
Stack Memory.

Q5. How many copies of an instance variable exist?
Ans:
One copy per object.

Q6. How many copies of a static variable exist?
Ans:
Only one copy for the entire class.

Q7. Which variable is shared among all objects?
Ans:
Static Variable.

=========================================
SHORTCUT TO REMEMBER
=========================================

Inside Method
    ↓
Local Variable

Inside { }
    ↓
Block Variable

Method Arguments
    ↓
Parameter Variable

Inside Class
    ↓
Instance Variable

Inside Class + static
    ↓
Static Variable

=========================================
COMMON ERRORS
=========================================

1. Using a local variable outside a method.

2. Using a block variable outside the block.

3. Thinking static variables belong to objects.
   (They belong to the class.)

4. Confusing instance and static variables.

=========================================
PLACEMENT TIP
=========================================

Whenever an interviewer asks:
"Where is this variable declared?"

Immediately think:

Method?
    → Local

Block?
    → Block

Parameter?
    → Parameter

Inside Class?
    → Instance

Inside Class + static?
    → Static

=========================================
*/