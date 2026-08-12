
  public class strings {

    public static void main(String[] args) {


        // =====================================================================
        // 1. STRING DECLARATION
        // =====================================================================

        String str;


        // =====================================================================
        // 2. STRING USING LITERAL
        // =====================================================================

        String s1 = "Hello";

        String s2 = "Hello";

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);


        // =====================================================================
        // 3. STRING USING new
        // =====================================================================

        String s3 = new String("Hello");

        System.out.println("\ns3 = " + s3);


        // =====================================================================
        // 4. STRING COMPARISON
        // =====================================================================

        // equals() compares the CONTENT of Strings.

        System.out.println("\ns1.equals(s2) = " + s1.equals(s2));


        // == compares REFERENCES.

        System.out.println("s1 == s2 = " + (s1 == s2));

        System.out.println("s1 == s3 = " + (s1 == s3));


        // =====================================================================
        // 5. STRING IMMUTABILITY
        // =====================================================================

        String message = "Hello";

        // concat() creates a NEW String.
        // It does NOT modify the original String.

        message.concat(" World");

        System.out.println("\nAfter concat without assignment:");

        System.out.println(message);


        // Store the returned String.

        message = message.concat(" World");

        System.out.println("\nAfter assigning returned String:");

        System.out.println(message);


        // =====================================================================
        // 6. STRING METHODS
        // =====================================================================

        String word = "Java";


        // length()

        System.out.println("\nLength = " + word.length());


        // charAt()

        System.out.println("First character = " + word.charAt(0));


        // substring()

        System.out.println(
            "Substring = " + "JavaProgramming".substring(4)
        );


        // toUpperCase()

        System.out.println(
            "Uppercase = " + word.toUpperCase()
        );


        // toLowerCase()

        System.out.println(
            "Lowercase = " + word.toLowerCase()
        );


        // =====================================================================
        // 7. intern()
        // =====================================================================

        String heapString = new String("Java");

        String pooledString = heapString.intern();

        System.out.println(
            "\nInterned String = " + pooledString
        );


        // =====================================================================
        // 8. STRINGBUILDER
        // =====================================================================

        StringBuilder sb = new StringBuilder("Hello");

        // StringBuilder is mutable.

        sb.append(" World");

        System.out.println(
            "\nStringBuilder = " + sb
        );


        // =====================================================================
        // 9. STRINGBUFFER
        // =====================================================================

        StringBuffer buffer = new StringBuffer("Java");

        buffer.append(" Programming");

        System.out.println(
            "StringBuffer = " + buffer
        );

    }
}  

/*
===============================================================================
                              STRINGS IN JAVA
===============================================================================

DEFINITION
----------

A String in Java is an OBJECT used to store a sequence of characters.

Example:

String name = "Geeks";

Here:

name
  |
  v
"Geeks"

A String is a reference / non-primitive data type.

Java Strings use UTF-16 encoding.

===============================================================================
IMPORTANT CHARACTERISTICS
===============================================================================

1. String is an OBJECT.

2. String stores a sequence of characters.

3. Strings are IMMUTABLE.

4. Java provides many methods for String manipulation.

5. String objects can be created using:

   - String literal
   - new keyword

===============================================================================
1. STRING DECLARATION
===============================================================================

Syntax:

String str;

This only declares a reference variable.

No String object/value has been assigned yet.

===============================================================================
2. STRING CREATION USING STRING LITERAL
===============================================================================

Syntax:

String str = "Hello";

Example:

String name = "Pratheeksha";

The String literal is stored in the String Constant Pool.

===============================================================================
STRING CONSTANT POOL
===============================================================================

The String Constant Pool is a special area inside Heap memory where String
literals are stored.

Example:

String s1 = "Hello";
String s2 = "Hello";

Java can reuse the same String object from the pool.

Conceptually:

Stack                         String Pool

s1 ----------------------->  "Hello"
                              ^
                              |
s2 --------------------------+

Both references can point to the same pooled String object.

This saves memory when the same String literal is used multiple times.

===============================================================================
3. STRING CREATION USING new
===============================================================================

Syntax:

String str = new String("Hello");

Using new creates a NEW String object in Heap memory.

The literal "Hello" is also associated with the String Constant Pool.

Example:

String s1 = new String("Hello");
String s2 = new String("Hello");

These create separate String objects.

===============================================================================
STRING LITERAL VS new
===============================================================================

String s1 = "Hello";

String s2 = "Hello";

The same literal can be reused from the String Pool.

But:

String s3 = new String("Hello");

creates a new String object.

Therefore, using String literals is generally preferred when possible.

===============================================================================
4. STRING IMMUTABILITY
===============================================================================

String objects are IMMUTABLE.

Immutable means:

Once a String object is created, its contents cannot be changed.

Example:

String str = "Hello";

str.concat(" World");

The original "Hello" is NOT modified.

Instead:

"Hello World"

is created as a NEW String.

But because we did not store the returned String, str still refers to:

"Hello"

===============================================================================
CORRECT WAY
===============================================================================

String str = "Hello";

str = str.concat(" World");

Now:

str

contains:

"Hello World"

The original String object was not modified.

A new String object was created and the reference was assigned to str.

===============================================================================
WHY IS STRING IMMUTABLE?
===============================================================================

Because String objects cannot change after creation.

This provides benefits such as:

• Safe sharing of String objects.
• Efficient use of the String Constant Pool.
• Predictable String behavior.

===============================================================================
5. == VS equals()
===============================================================================

When comparing Strings:

==

checks whether two references refer to the same object.

equals()

checks whether the contents are equal.

Example:

String s1 = "Hello";
String s2 = "Hello";

s1.equals(s2)

→ true

Since literals may refer to the same pooled object:

s1 == s2

may also be true.

But don't use == to check String content.

Use:

s1.equals(s2)

===============================================================================
6. STRING METHODS
===============================================================================

Strings provide methods for manipulating and examining text.

Common examples:

length()
charAt()
concat()
equals()
substring()
toUpperCase()
toLowerCase()

These methods can be used without changing the original String because
String is immutable.

===============================================================================
7. CHARSEQUENCE
===============================================================================

CharSequence is an interface representing a sequence of characters.

It provides common operations such as:

length()
charAt()
subSequence()
toString()

Classes related to CharSequence include:

String
StringBuilder
StringBuffer

===============================================================================
8. STRINGBUILDER
===============================================================================

StringBuilder is MUTABLE.

Unlike String, its contents can be modified.

Example:

StringBuilder sb = new StringBuilder("Hello");

sb.append(" World");

Now sb contains:

Hello World

StringBuilder is useful when performing many String modifications.

===============================================================================
9. STRINGBUFFER
===============================================================================

StringBuffer is also MUTABLE.

It is synchronized and is designed for thread-safe String manipulation.

StringBuilder is generally preferred when synchronization is not required.

===============================================================================
10. intern()
===============================================================================

The intern() method returns a reference from the String Constant Pool.

Example:

String s1 = new String("Hello");

String s2 = s1.intern();

s2 now refers to the pooled String "Hello".

If the String is not already in the pool, it is added.

===============================================================================
MEMORY SUMMARY
===============================================================================

String literal:

String s = "Hello";

        s
        |
        v
   String Pool
     "Hello"


Using new:

String s = new String("Hello");

        s
        |
        v
      Heap
    new "Hello"

The literal "Hello" can also exist in the String Pool.

===============================================================================
IMPORTANT DIFFERENCE
===============================================================================

String
-------
Immutable

StringBuilder
-------------
Mutable

StringBuffer
-------------
Mutable + synchronized

===============================================================================
COMMON STRING OPERATIONS
===============================================================================

length()

Returns the number of characters.

Example:

"Java".length()

→ 4


charAt(index)

Returns the character at the given index.

"Java".charAt(0)

→ 'J'


concat()

Combines Strings.

"Hello".concat(" World")

→ "Hello World"


substring()

Extracts part of a String.

"JavaProgramming".substring(4)

→ "Programming"


toUpperCase()

Converts characters to uppercase.


toLowerCase()

Converts characters to lowercase.

===============================================================================
DSA CONNECTION
===============================================================================

Strings are very important in DSA.

Common problems include:

• Reverse String
• Palindrome
• Anagram
• Character Frequency
• Substrings
• String Searching
• Two Pointer
• Sliding Window

===============================================================================
SUMMARY
===============================================================================

String

→ Object

String

→ Sequence of characters

String

→ Immutable

String literal

→ String Constant Pool

new String()

→ Creates a new String object

intern()

→ Returns pooled String reference

StringBuilder

→ Mutable

StringBuffer

→ Mutable + synchronized

String comparison

→ Use equals() for content

===============================================================================
*/