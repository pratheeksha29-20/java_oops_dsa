import java.util.Scanner;
public class decisionMaking {
     public static void main(String[] args) {

        int marks = 78;
        int age = 20;

        // ==================================================
        // 1. IF
        // ==================================================

        if (marks >= 35) {
            System.out.println("Pass");
        }

        // ==================================================
        // 2. IF ELSE
        // ==================================================

        if (age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible");
        }

        // ==================================================
        // 3. NESTED IF
        // ==================================================

        boolean hasLicense = true;

        if (age >= 18) {

            if (hasLicense) {

                System.out.println("Can Drive");

            }

        }

        // ==================================================
        // 4. IF ELSE IF
        // ==================================================

        if (marks >= 90) {

            System.out.println("Grade A");

        } else if (marks >= 80) {

            System.out.println("Grade B");

        } else if (marks >= 70) {

            System.out.println("Grade C");

        } else if (marks >= 35) {

            System.out.println("Pass");

        } else {

            System.out.println("Fail");

        }

        // ==================================================
        // 5. SWITCH
        // ==================================================

        int day = 3;

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid Day");

        }

        // ==================================================
        // 6. TERNARY
        // ==================================================

        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;

        System.out.println("Maximum = " + max);

    }
}


/*
===============================================================================
                         DECISION MAKING IN JAVA
===============================================================================

Definition
----------
Decision Making allows a program to choose different execution paths
based on a condition. It controls the flow of execution by deciding
which block of code should run.

Why Decision Making?
--------------------
Used to:
• Execute code only when a condition is true.
• Validate user input.
• Implement business logic.
• Control program flow.

Example:
Marks >= 35  -> PASS
Marks < 35   -> FAIL

===============================================================================
TYPES OF DECISION MAKING
===============================================================================

1. if Statement
---------------
Executes a block only when the condition is true.

Syntax:
if(condition){
    // statements
}

Flow:
Condition → True → Execute Block
          → False → Skip Block

-------------------------------------------------------------------------------

2. if-else Statement
--------------------
Executes one block if the condition is true,
otherwise executes the else block.

Syntax:
if(condition){
    // true block
}
else{
    // false block
}

-------------------------------------------------------------------------------

3. Nested if
------------
An if statement inside another if statement.

Used when one condition depends on another.

Syntax:
if(condition1){
    if(condition2){
        // statements
    }
}

-------------------------------------------------------------------------------

4. if-else-if Ladder
--------------------
Used to check multiple conditions.
The first true condition executes and the remaining are skipped.

Syntax:
if(condition1){

}
else if(condition2){

}
else{

}

-------------------------------------------------------------------------------

5. switch Statement
-------------------
Used to compare one variable with multiple fixed values.

Syntax:
switch(variable){

case value1:
    break;

case value2:
    break;

default:
}

Important:
• break exits the switch.
• Without break → Fall Through.
• default executes when no case matches.

-------------------------------------------------------------------------------

6. Ternary Operator (? :)
-------------------------
Short form of if-else.

Syntax:
condition ? value_if_true : value_if_false;

Example:
int max = (a>b) ? a : b;

===============================================================================
WHEN TO USE
===============================================================================

if              → One condition

if-else         → Two choices

Nested if       → Dependent conditions

if-else-if      → Multiple conditions

switch          → Exact value matching

Ternary         → Simple one-line if-else

===============================================================================
USED IN DSA
===============================================================================

Decision making is used in almost every algorithm.

Examples:
• Binary Search
• Linear Search
• Sorting Algorithms
• Sliding Window
• Trees
• Graphs
• Dynamic Programming

===============================================================================
*/