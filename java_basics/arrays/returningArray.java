package arrays;

public class returningArray {
   // =========================================================================
    // METHOD 1: RETURN AN EXISTING ARRAY
    // =========================================================================

    static int[] getNumbers() {

        int[] arr = {10, 20, 30, 40, 50};

        return arr;
    }


    // =========================================================================
    // METHOD 2: CREATE AND RETURN ARRAY DIRECTLY
    // =========================================================================

    static int[] createArray() {

        return new int[]{100, 200, 300};
    }


    // =========================================================================
    // METHOD 3: RECEIVE AND RETURN A PROCESSED ARRAY
    // =========================================================================

    static int[] doubleValues(int[] arr) {

        // Create a new array with the same size.

        int[] result = new int[arr.length];


        // Process each element.

        for(int i = 0; i < arr.length; i++) {

            result[i] = arr[i] * 2;

        }


        // Return the new array.

        return result;
    }


    // =========================================================================
    // METHOD 4: PRINT ARRAY
    // =========================================================================

    static void printArray(int[] arr) {

        for(int value : arr) {

            System.out.print(value + " ");

        }

        System.out.println();
    }


    // =========================================================================
    // MAIN METHOD
    // =========================================================================

    public static void main(String[] args) {


        // =====================================================================
        // EXAMPLE 1: RECEIVING A RETURNED ARRAY
        // =====================================================================

        int[] numbers = getNumbers();

        System.out.println("Returned Array:");

        printArray(numbers);


        // =====================================================================
        // EXAMPLE 2: RECEIVING A DIRECTLY CREATED ARRAY
        // =====================================================================

        int[] values = createArray();

        System.out.println("\nDirectly Created and Returned Array:");

        printArray(values);


        // =====================================================================
        // EXAMPLE 3: PASSING AND RETURNING AN ARRAY
        // =====================================================================

        int[] original = {1, 2, 3, 4, 5};

        int[] doubled = doubleValues(original);

        System.out.println("\nOriginal Array:");

        printArray(original);

        System.out.println("Doubled Array:");

        printArray(doubled);

    } 
}


/*
===============================================================================
                         RETURNING ARRAYS FROM METHODS
===============================================================================

A Java method can return an entire array.

The return type of the method must be the array type.

Example:

static int[] getArray() {

    int[] arr = {10, 20, 30};

    return arr;
}


===============================================================================
SYNTAX
===============================================================================

static dataType[] methodName() {

    // create array

    return array;

}


Example:

static int[] getNumbers() {

    int[] arr = {10, 20, 30};

    return arr;

}


===============================================================================
HOW DOES IT WORK?
===============================================================================

Suppose main() calls:

int[] numbers = getNumbers();


Step 1:

getNumbers() is called.


Step 2:

The method creates an array:

{10, 20, 30}


Step 3:

The method returns the reference to that array.


Step 4:

numbers receives the returned reference.


Memory idea:

main()

numbers
   |
   | reference
   ↓

Heap

+----+----+----+
| 10 | 20 | 30 |
+----+----+----+


===============================================================================
IMPORTANT
===============================================================================

The return type must match the array type.

For int array:

static int[] getArray()

For double array:

static double[] getArray()

For String array:

static String[] getArray()


===============================================================================
RETURNING A NEW ARRAY DIRECTLY
===============================================================================

We can also create and return an array in one statement:

return new int[]{10, 20, 30};


===============================================================================
PASSING + PROCESSING + RETURNING
===============================================================================

A method can:

1. Receive an array
2. Process it
3. Create another array
4. Return the new array


Example:

doubleValues(arr)

Input:

{1, 2, 3}

Output:

{2, 4, 6}


===============================================================================
IMPORTANT DIFFERENCE
===============================================================================

Passing an array:

static void printArray(int[] arr)

↓

Method receives an array reference.


Returning an array:

static int[] getArray()

↓

Method sends an array reference back to the caller.


===============================================================================
WHERE IS THIS USED IN DSA?
===============================================================================

Returning arrays is useful when a method needs to produce a result array.

Examples:

• Reverse an array
• Create a new array
• Return filtered elements
• Return transformed elements
• Merge arrays
• Return calculated results


===============================================================================
*/