import java.util.*;
public class operators{
 public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // Arithmetic Operators
        System.out.println("Addition       : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division       : " + (a / b));
        System.out.println("Modulus        : " + (a % b));

        // Unary Operators
        int x = 5;
        System.out.println("\nPost Increment : " + (x++));
        System.out.println("Current Value  : " + x);
        System.out.println("Pre Increment  : " + (++x));

        // Assignment Operators
        int num = 10;
        num += 5;
        System.out.println("\nAfter += 5 : " + num);

        num *= 2;
        System.out.println("After *= 2 : " + num);

        // Relational Operators
        System.out.println("\na > b  : " + (a > b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // Logical Operators
        boolean p = true;
        boolean q = false;

        System.out.println("\np && q : " + (p && q));
        System.out.println("p || q : " + (p || q));
        System.out.println("!p     : " + (!p));

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("\nMaximum = " + max);

        // Bitwise Operators
        System.out.println("\na & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        /*left shift
         x << n = x * 2ⁿ */
        System.out.println("a << 1 = " + (a << 1));
        /*right shift
         x >> n = x / 2ⁿ */
        System.out.println("a >> 1 = " + (a >> 1));

        // instanceof Operator
        String str = "Hello";

        System.out.println("\nstr instanceof String : "
                + (str instanceof String));
    }
}


/*
===============================================================================
                              JAVA OPERATORS
===============================================================================

Definition
----------
Operators are special symbols that perform operations on variables and values.

They are used for:
1. Arithmetic calculations
2. Comparing values
3. Decision making
4. Assigning values
5. Logical operations
6. Bit manipulation

Example

int a = 10;
int b = 20;

int sum = a + b;

Here '+' is an operator.

===============================================================================
WHY DO WE NEED OPERATORS?
===============================================================================

Suppose

a = 10
b = 20

Without operators,

Java cannot perform

Addition
Subtraction
Comparison
Assignment
Logical Decisions

Operators make these tasks simple.

===============================================================================
TYPES OF OPERATORS
===============================================================================

Java provides the following operators.

1. Arithmetic Operators
2. Unary Operators
3. Assignment Operators
4. Relational Operators
5. Logical Operators
6. Ternary Operator
7. Bitwise Operators
8. instanceof Operator

===============================================================================
1. ARITHMETIC OPERATORS
===============================================================================

Used to perform mathematical calculations.

Operator     Meaning

+            Addition

-            Subtraction

*            Multiplication

/            Division

%            Modulus (Remainder)

Example

10 + 3 = 13

10 - 3 = 7

10 * 3 = 30

10 / 3 = 3

10 % 3 = 1

Important

If both operands are integers,

Division gives Integer Division.

Example

10 / 3 = 3

10.0 / 3 = 3.333...

===============================================================================
2. UNARY OPERATORS
===============================================================================

Unary operators work on only one operand.

Operators

++

Increment

--

Decrement

+

Unary Plus

-

Unary Minus

!

Logical NOT

Examples

a++

Post Increment

First use value

Then increment

++a

Pre Increment

First increment

Then use value

Similarly

b--

Post Decrement

--b

Pre Decrement

===============================================================================
3. ASSIGNMENT OPERATORS
===============================================================================

Used to assign values to variables.

Basic Assignment

=

Example

int x = 10;

Compound Assignment

+=

-=

*=

/=

%=

Examples

x += 5;

Equivalent

x = x + 5;

Similarly

x *= 2;

means

x = x * 2;

Compound assignment makes code shorter and cleaner.

===============================================================================
4. RELATIONAL OPERATORS
===============================================================================

Used to compare two values.

Result is always boolean.

true

or

false

Operators

>

<

>=

<=

==

!=

Example

10 > 5

true

10 == 5

false

These operators are mostly used inside

if

while

for

===============================================================================
5. LOGICAL OPERATORS
===============================================================================

Logical operators work on boolean values.

Operators

&&

Logical AND

Returns true only if both conditions are true.

||

Logical OR

Returns true if at least one condition is true.

!

Logical NOT

Reverses boolean value.

Example

true && false

false

true || false

true

!true

false

Logical operators use Short Circuit Evaluation.

===============================================================================
6. TERNARY OPERATOR
===============================================================================

Shortcut for if-else.

Syntax

(condition) ? value1 : value2;

Example

int max = (a > b) ? a : b;

If condition is true

value1

Else

value2

===============================================================================
7. BITWISE OPERATORS
===============================================================================

Operate directly on binary bits.

Operators

&

Bitwise AND

|

Bitwise OR

^

Bitwise XOR

~

Bitwise NOT

<<

Left Shift

>>

Signed Right Shift

>>>

Unsigned Right Shift

Mostly used in

Competitive Programming

Optimization

Embedded Systems

Low Level Programming

===============================================================================
8. INSTANCEOF OPERATOR
===============================================================================

Used to check the type of an object.

Syntax

object instanceof ClassName

Returns

true

or

false

Example

String str = "Hello";

str instanceof String

returns

true

===============================================================================
OPERATOR PRECEDENCE
===============================================================================

Highest

()

Unary

*, /, %

+, -

<, <=, >, >=

==, !=

&&

||

?:

=

Lowest

Use brackets whenever expression becomes confusing.

===============================================================================
INTEGER DIVISION
===============================================================================

This is one of the most important concepts.

int a = 10;
int b = 3;

a / b

Output

3

because

Only quotient is stored.

To obtain decimal answer

(double)a / b

Output

3.333333

===============================================================================
MODULUS OPERATOR
===============================================================================

%

Returns remainder.

Examples

15 % 2 = 1

20 % 5 = 0

203 % 10 = 3

20 % 10 = 0

2 % 10 = 2

Very important in DSA.

Used in

Reverse Number

Palindrome Number

Armstrong Number

Digit Sum

Digit Product

Count Digits

===============================================================================
SUMMARY
===============================================================================

Arithmetic

+

-

*

/

%

------------------------------

Unary

++

--

!

------------------------------

Assignment

=

+=

-=

*=

/=

%=

------------------------------

Relational

>

<

>=

<=

==

!=

------------------------------

Logical

&&

||

!

------------------------------

Ternary

? :

------------------------------

Bitwise

&

|

^

~

<<

>>

>>>

------------------------------

instanceof

Checks object type

===============================================================================
*/