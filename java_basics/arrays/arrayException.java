package arrays;

public class arrayException {
    
    


    public static void main(String[] args) {


        // ====================================================================
        // EXAMPLE 1: VALID ARRAY ACCESS
        // ====================================================================

        int[] arr = {10, 20, 30, 40};


        // Valid indexes are 0, 1, 2 and 3.

        System.out.println("First element: " + arr[0]);

        System.out.println("Last element: " + arr[3]);


        // ====================================================================
        // EXAMPLE 2: ARRAY LENGTH
        // ====================================================================

        System.out.println("\nArray length: " + arr.length);

        System.out.println(
            "Last valid index: " + (arr.length - 1)
        );


        // ====================================================================
        // EXAMPLE 3: CORRECT TRAVERSAL
        // ====================================================================

        System.out.println("\nCorrect traversal:");

        for(int i = 0; i < arr.length; i++) {

            System.out.println(
                "Index " + i + " = " + arr[i]
            );

        }


        // ====================================================================
        // EXAMPLE 4: INVALID INDEX
        // ====================================================================

        // Uncomment the line below to see the exception.

        // System.out.println(arr[4]);


        // ====================================================================
        // EXAMPLE 5: NEGATIVE INDEX
        // ====================================================================

        // Uncomment the line below to see the exception.

        // System.out.println(arr[-1]);


        // ====================================================================
        // EXAMPLE 6: COMMON LOOP ERROR
        // ====================================================================

        // WRONG:

        /*
        for(int i = 0; i <= arr.length; i++) {

            System.out.println(arr[i]);

        }
        */

        // The loop eventually reaches:
        //
        // i = arr.length
        //
        // which is an invalid index.


        // ====================================================================
        // CORRECT VERSION
        // ====================================================================

        System.out.println("\nCorrect loop:");

        for(int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }

    }

}
/*
===============================================================================
                    ARRAY INDEX OUT OF BOUNDS EXCEPTION
===============================================================================

WHAT IS ArrayIndexOutOfBoundsException?
---------------------------------------

Java throws ArrayIndexOutOfBoundsException when we try to access an array
using an invalid index.

For an array:

Valid index range = 0 to length - 1


Example:

int[] arr = {10, 20, 30, 40};

Length = 4

Valid indexes:

0
1
2
3

Invalid indexes:

4
5
-1
-10 */
