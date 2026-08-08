package java_oops_dsa.java_basics.arrays;

public class array_basic {
    public static void main(String [] args){
      // step 1 array declation
      int [] arr1;
      System.out.println("array declared succesfully ");


    //array creatiuon using new keyword
    arr1 = new int[5];
    System.out.println("array created succesfully ");
    System.out.println("size:"+arr1.length);
    // array having deafult values
    for(int i=0;i<arr1.length;i++){
        System.out.println(arr1[i]);
        }
 // array initialization
        arr1[0]=10;
        arr1[1]=20;
        arr1[2]=30;
        arr1[3]=40;
        arr1[4]=50;

        System.out.println("array initialized succesfully ");
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
            }
            // array declaration and initialization in single line
            int [] arr2 = {1,2,3,4,5};
            System.out.println("array declared and initialized succesfully ");
            // accesing the array elements
            System.out.println("array elements are :");
            for(int i=0;i<arr2.length;i++){
                System.out.println(arr2[i]);
                }
                // updating array elements
                arr2[0]=10;
                arr2[1]=20;
                System.out.println("array elements after updating are :");
                for(int i=0;i<arr2.length;i++){
                    System.out.println(arr2[i]);
                    }
// EXAMPLE 8 : TRAVERSING USING FOR LOOP
        // ============================================================

        System.out.println("\nExample 8 : Traversing using For Loop");

        for(int i = 0; i < arr2.length; i++){

            System.out.print(arr2[i] + " ");

        }

        System.out.println();

        // ============================================================
        // EXAMPLE 9 : ENHANCED FOR LOOP
        // ============================================================

        System.out.println("\nExample 9 : Enhanced For Loop");

        for(int value : arr2){

            System.out.print(value + " ");

        }

        System.out.println();
  // EXAMPLE 10 : ARRAY LENGTH
        // ============================================================

        System.out.println("\nExample 10 : Length Property");

        System.out.println("Length = " + arr2.length);


         // EXAMPLE 11 : DIFFERENT DATA TYPES
        // ============================================================

        int[] numbers = {1,2,3};

        double[] decimal = {2.5,3.8,9.7};

        char[] letters = {'A','B','C'};

        boolean[] status = {true,false,true};

        String[] names = {"Pratheeksha","Rahul","Ankit"};

        System.out.println("\nExample 11 : Different Data Types");

        System.out.println(numbers[1]);

        System.out.println(decimal[2]);

        System.out.println(letters[0]);

        System.out.println(status[2]);

        System.out.println(names[1]);



        // ============================================================
        // EXAMPLE 12 : ARRAY INDEX OUT OF BOUNDS
        // ============================================================

        System.out.println("\nExample 12");

        System.out.println("Accessing arr2[2] : " + arr2[1]);

        // Uncomment to observe the exception

        // System.out.println(arr2[10]);
  int[] memoryArray = {11,22,33};

        System.out.println("\nExample 13 : Memory Representation");

        System.out.println("memoryArray reference points to Heap Memory");

        System.out.println(memoryArray[0]);


         // EXAMPLE 14 : ARRAY IS FIXED SIZE
        // ============================================================

        int[] fixed = new int[3];

        System.out.println("\nExample 14");

        System.out.println("Array Size = " + fixed.length);

        System.out.println("Size cannot be changed after creation.");

         // EXAMPLE 15 : RANDOM ACCESS
        // ============================================================

        System.out.println("\nExample 15");

        System.out.println(arr2[4]);



        System.out.println("\n========== END ==========");

    }}


    /*
===============================================================================
                                ARRAYS IN JAVA
===============================================================================

Definition
----------
An Array is a collection of elements of the SAME DATA TYPE stored under a
single variable name. It allows multiple values to be stored together and
accessed using an index.

According to Java, arrays can store:

• Primitive Data Types
    int, double, char, boolean, etc.

• Non-Primitive Types
    String, Objects, Wrapper Classes, etc.

Primitive arrays store values in contiguous memory locations.
Object arrays store references in contiguous memory locations.

Array size becomes FIXED once memory is allocated.

===============================================================================
WHY DO WE NEED ARRAYS?
===============================================================================

Problem without Arrays
----------------------

Suppose we want to store marks of 5 students.

int mark1 = 85;
int mark2 = 90;
int mark3 = 76;
int mark4 = 81;
int mark5 = 95;

Now imagine storing marks of 10,000 students.

It becomes difficult to

• Declare variables
• Read values
• Update values
• Search values
• Sort values
• Traverse values

Arrays solve this problem by storing multiple values using ONE variable.

Example

int[] marks = {85,90,76,81,95};

Advantages

• Less code
• Easy traversal
• Easy searching
• Easy sorting
• Better memory organization

===============================================================================
CHARACTERISTICS OF ARRAYS
===============================================================================

1. Homogeneous
--------------
All elements must be of the same data type.

Correct

int[] arr = {1,2,3};

Wrong

int[] arr = {1,'A',"Hello"};

-------------------------------------------------------------------------------

2. Fixed Size
-------------

Once an array is created, its size cannot be changed.

Example

int[] arr = new int[5];

Always stores exactly 5 elements.

Need dynamic size?

Use ArrayList.

-------------------------------------------------------------------------------

3. Indexed Collection
---------------------

Every element has an index.

Index always starts from 0.

Example

Element

10   20   30   40

Index

0    1    2    3

arr[0] = 10

arr[2] = 30

-------------------------------------------------------------------------------

4. Contiguous Memory
--------------------

Primitive arrays store values continuously in memory.

Example

Address

100

104

108

112

Values

10

20

30

40

This improves access speed.

-------------------------------------------------------------------------------

5. Random Access
----------------

Since memory is contiguous,

Java can directly calculate

Address = Base Address + (Index × Size)

Therefore,

Access Time

O(1)

===============================================================================
MEMORY REPRESENTATION
===============================================================================

Suppose

int[] arr = {10,20,30,40};

Stack Memory

arr
 │
 │ Reference
 ▼

Heap Memory

+------+------+------+------+
| 10 | 20 | 30 | 40 |
+------+------+------+------+
  0      1      2      3

Explanation

• Variable 'arr' stores only the reference (address).
• Actual array elements are stored in Heap Memory.
• Index starts from 0.

===============================================================================
ARRAY DECLARATION
===============================================================================

Definition
----------

Declaration means informing Java about

• Data Type
• Variable Name

Memory is NOT allocated during declaration.

Syntax

datatype[] arrayName;

or

datatype arrayName[];

Example

int[] arr;

char[] letters;

String[] names;

Memory

Stack

arr

↓

NULL

(No Heap Memory Yet)

===============================================================================
ARRAY CREATION
===============================================================================

Definition
----------

Creation means allocating memory for the array using the new keyword.

Syntax

arrayName = new datatype[size];

Example

arr = new int[5];

Java creates memory for

5 integers.

Default Values

byte      → 0

short     → 0

int       → 0

long      → 0L

float     → 0.0f

double    → 0.0

char      → '\u0000'

boolean   → false

Objects   → null

Memory

Stack

arr

↓

Heap

+---+---+---+---+---+

|0 |0 |0 |0 |0 |

+---+---+---+---+---+

===============================================================================
ARRAY INITIALIZATION
===============================================================================

Definition

Initialization means assigning values to array elements.

Method 1

arr[0]=10;

arr[1]=20;

Method 2

int[] arr = {10,20,30,40};

Method 3

int[] arr = new int[]{10,20,30};

===============================================================================
ACCESSING ARRAY ELEMENTS
===============================================================================

Syntax

arr[index];

Example

int[] arr={10,20,30};

System.out.println(arr[1]);

Output

20

Index Rules

Minimum Index = 0

Maximum Index = length-1

Example

arr[3]

for

3 element array

↓

ArrayIndexOutOfBoundsException

===============================================================================
UPDATING ARRAY ELEMENTS
===============================================================================

Syntax

arr[index]=value;

Example

arr[2]=100;

Before

10 20 30 40

After

10 20 100 40

===============================================================================
TRAVERSING ARRAYS
===============================================================================

Definition

Visiting every element exactly once.

Method 1

Using for loop

for(int i=0;i<arr.length;i++){

}

Method 2

Enhanced for loop

for(int x : arr){

}

Difference

for loop

• Gives Index

Enhanced for

• Gives only Values

===============================================================================
ARRAY LENGTH
===============================================================================

Definition

length is a property of arrays.

Syntax

arr.length

Example

int[] arr={10,20,30};

arr.length

Output

3

Note

Arrays use

length

NOT

length()

Strings use

length()

===============================================================================
ADVANTAGES
===============================================================================

• O(1) Random Access

• Easy Traversal

• Better Memory Organization

• Less Code

• Cache Friendly

• Simple to Implement

===============================================================================
LIMITATIONS
===============================================================================

• Fixed Size

• Same Data Type

• Costly Insertion

• Costly Deletion

• Memory Wastage (if oversized)

===============================================================================
COMMON MISTAKES
===============================================================================

❌ arr[arr.length]

Correct

arr[arr.length-1]

--------------------------------

❌ Forgetting new keyword

--------------------------------

❌ Negative Index

arr[-1]

--------------------------------

❌ Confusing

length

with

length()

--------------------------------

❌ Accessing index greater than size

===============================================================================
INTERVIEW NOTES
===============================================================================

Q. Why index starts from 0?

Address Calculation

Address = Base Address + (Index × Size)

--------------------------------

Q. Where is array stored?

Array Object

↓

Heap Memory

Reference Variable

↓

Stack Memory

--------------------------------

Q. Can array size increase?

No.

Use ArrayList.

--------------------------------

Q. Time Complexity

Access

O(1)

Traversal

O(n)

Search

O(n)

===============================================================================
WHERE IS ARRAY USED IN DSA?
===============================================================================

Arrays are the foundation of DSA.

Used in

• Linear Search

• Binary Search

• Sorting

• Prefix Sum

• Sliding Window

• Two Pointer

• Kadane Algorithm

• Hashing

• Matrix Problems

• Dynamic Programming

===============================================================================
SUMMARY
===============================================================================

Array

↓

Collection of same datatype elements.

Size

↓

Fixed

Memory

↓

Heap

Reference

↓

Stack

Index

↓

Starts from 0

Access

↓

O(1)

Traversal

↓

O(n)

===============================================================================
*/