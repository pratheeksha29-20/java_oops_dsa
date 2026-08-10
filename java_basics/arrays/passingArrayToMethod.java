package arrays;

public class passingArrayToMethod {
  // =========================================================================
    // METHOD 1: PRINT ARRAY
    // =========================================================================

    static void printArray(int[] arr) {

        for(int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }

        System.out.println();

    }


    // =========================================================================
    // METHOD 2: FIND SUM
    // =========================================================================

    static int sum(int[] arr) {

        int total = 0;

        for(int i = 0; i < arr.length; i++) {

            total += arr[i];

        }

        return total;

    }


    // =========================================================================
    // METHOD 3: MODIFY ARRAY ELEMENT
    // =========================================================================

    static void modifyArray(int[] arr) {

        // This changes the original array
        // because arr refers to the same array object.

        arr[0] = 100;

    }


    // =========================================================================
    // METHOD 4: REASSIGN ARRAY REFERENCE
    // =========================================================================

    static int[] reassignArray(int[] arr) {

        // Here the local parameter 'arr' is made to
        // refer to a completely new array.

        arr = new int[]{100, 200, 300};

        // This does NOT change the original reference
        // in main().
        return arr;

    }


    // =========================================================================
    // MAIN METHOD
    // =========================================================================

    public static void main(String[] args) {


        int[] numbers = {10, 20, 30, 40, 50};


        // =====================================================================
        // PASSING ARRAY TO printArray()
        // =====================================================================

        System.out.println("Original Array:");

        printArray(numbers);


        // =====================================================================
        // PASSING ARRAY TO sum()
        // =====================================================================

        int result = sum(numbers);

        System.out.println("Sum = " + result);


        // =====================================================================
        // MODIFYING ARRAY ELEMENT
        // =====================================================================

        modifyArray(numbers);

        System.out.println("\nAfter modifying first element:");

        printArray(numbers);


        // =====================================================================
        // REASSIGNING ARRAY INSIDE METHOD
        // =====================================================================

        reassignArray(numbers);

        System.out.println("\nAfter reassigning inside method:");
        numbers = reassignArray(numbers);

        printArray(numbers);

    }  
}


/*
===============================================================================
                       PASSING ARRAYS TO METHODS
===============================================================================

An array can be passed as an argument to a method just like a normal variable.

This allows us to create separate methods for different array operations.

Example:

int[] arr = {1, 2, 3, 4, 5};

sum(arr);

Here, the array 'arr' is passed to the method 'sum()'.


===============================================================================
SYNTAX
===============================================================================

static returnType methodName(dataType[] arrayName) {

    // process the array

}


Example:

static int sum(int[] arr) {

    int sum = 0;

    for(int i = 0; i < arr.length; i++) {

        sum += arr[i];

    }

    return sum;
}


===============================================================================
HOW IT WORKS
===============================================================================

Suppose:

int[] arr = {1, 2, 3, 4, 5};

We call:

sum(arr);


The method receives the array:

static int sum(int[] arr)


Inside the method, we can access:

arr[0]
arr[1]
arr[2]
arr[3]
arr[4]


===============================================================================
IMPORTANT CONCEPT: JAVA IS PASS-BY-VALUE
===============================================================================

Java always passes arguments by value.

When an array is passed to a method, the VALUE of the array reference is
passed to the method.

Therefore, the method can access the same array object.

Example:

int[] arr = {10, 20, 30};

change(arr);


Inside change():

arr[0] = 100;


The original array becomes:

{100, 20, 30}


===============================================================================
MEMORY IDEA
===============================================================================

main()

arr
 |
 | reference
 ↓
+----+----+----+
| 10 | 20 | 30 |
+----+----+----+


When arr is passed to a method, the reference value is copied.

main()                         change()

arr                            arr
 |                              |
 └───────────┐      ┌───────────┘
             ↓      ↓
          Same Array
       +----+----+----+
       | 10 | 20 | 30 |
       +----+----+----+


Both references point to the SAME array object.

Therefore, changing an element inside the method affects the original
array.


===============================================================================
IMPORTANT DISTINCTION
===============================================================================

Changing an array ELEMENT:

arr[0] = 100;

→ Original array is modified.


But assigning a new array to the parameter:

arr = new int[]{100, 200, 300};

→ The original reference in main() is NOT changed.

The parameter only gets a new reference.

===============================================================================
WHY PASS ARRAYS TO METHODS?
===============================================================================

It allows us to create reusable operations.

Examples:

sum(arr)

findMaximum(arr)

findMinimum(arr)

search(arr, key)

reverse(arr)

printArray(arr)

These methods are extremely common in DSA.


===============================================================================
COMMON DSA PATTERN
===============================================================================

static void printArray(int[] arr) {

    for(int i = 0; i < arr.length; i++) {

        System.out.print(arr[i] + " ");

    }

}

Call:

printArray(arr);


This pattern will appear repeatedly in DSA.


===============================================================================
IMPORTANT POINTS
===============================================================================

• Arrays can be passed to methods.
• The parameter uses datatype[].
• Java passes the array reference value by value.
• The method can access array elements.
• Modifying an element modifies the original array.
• Reassigning the parameter does not change the caller's reference.
===============================================================================
*/

