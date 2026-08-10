package methods;

public class callStack {

    public static void main(String[] args) {

        System.out.println("Main Starts");

        first();

        System.out.println("Main Ends");
    }

    public static void first() {

        System.out.println("First Method");

        second();

        System.out.println("Back to First");
    }

    public static void second() {

        System.out.println("Second Method");
    }
}

/*Step 1

---------
| main  |
---------

----------------------------

Step 2

---------
| first |
---------
| main  |
---------

----------------------------

Step 3

---------
|second |
---------
| first |
---------
| main  |
---------

----------------------------

Step 4

---------
| first |
---------
| main  |
---------

----------------------------

Step 5

---------
| main |
---------

----------------------------

Program Ends

Stack Empty*/