package java_oops_dsa.java_basics.arrays;
public class array_objects {
  public static void main(String[] args) {
    // Create an array of objects declaration and initialization
    Student[] students = new Student[3];

    // Initialize the array with Student objects
    students[0] = new Student("Alice", 20);
    students[1] = new Student("Bob", 22);
    students[2] = new Student("Charlie", 19);

    System.out.println("Student Details:");
    // Access and print the details of each student
    System.out.println("first student:");
    System.out.println("Name: " + students[0].getName() + ", Age: " + students[0].getAge());
    System.out.println("second student:");
    System.out.println("Name: " + students[1].getName() + ", Age: " + students[1].getAge());
    System.out.println("third student:");
    System.out.println("Name: " + students[2].getName() + ", Age: " + students[2].getAge());}}
class Student{
    int age;
    String name;
     public Student(String name , int age){
        this.name= name;
        this.age= age;}
    
public  String getName(){
    return name;
}
public  int getAge(){
    return age;
}
}

  /*
===============================================================================
                         ARRAYS OF OBJECTS IN JAVA
===============================================================================

An array can also store objects.

Example:

Student[] students = new Student[3];

This creates an array that can store references to 3 Student objects.

IMPORTANT:
-----------
new Student[3] creates the ARRAY, but it does NOT create 3 Student objects.

Initially:

students[0] -> null
students[1] -> null
students[2] -> null

We must create the objects separately:

students[0] = new Student(1, "Pratheeksha");
students[1] = new Student(2, "Rahul");
students[2] = new Student(3, "Ankit");


===============================================================================
MEMORY IDEA
===============================================================================

Student[] students = new Student[3];

Stack                         Heap

students  ----------------->  Array
                               +---------+---------+---------+
                               |  null   |  null   |  null   |
                               +---------+---------+---------+
                                  0         1         2


After creating objects:

students[0] = new Student(...);

Stack                         Heap

students  ----------------->  Array
                               +--------+--------+--------+
                               |  ref   |  ref   |  ref   |
                               +---|----+---|----+---|----+
                                   |        |        |
                                   ↓        ↓        ↓

                                Student  Student  Student
                                roll=1   roll=2   roll=3
                                name=A   name=B   name=C


===============================================================================
IMPORTANT DIFFERENCE
===============================================================================

Primitive Array:

int[] arr = {10, 20, 30};

The array stores the actual values.

Object Array:

Student[] students = new Student[3];

The array stores references to Student objects.

===============================================================================
*/

