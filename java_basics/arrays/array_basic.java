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
