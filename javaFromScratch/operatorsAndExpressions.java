package javaFromScratch;

public class operatorsAndExpressions {
    public static void main(String[] args) {
        // Arithmetic (same as C)
int sum = 10 + 3;      // 13
int diff = 10 - 3;     // 7
int prod = 10 * 3;     // 30
int quot = 10 / 3;     // 3  (integer division! truncates toward zero)
int rem = 10 % 3;      // 1  (remainder)

// GOTCHA: integer division truncates
System.out.println(7 / 2);     // 3, not 3.5
System.out.println(7.0 / 2);   // 3.5 (one operand is double → result is double)
System.out.println((double) 7 / 2); // 3.5 (cast to force double division)

// Comparison (returns boolean)
x == y    // equal (for primitives: compares values; for objects: compares REFERENCES)
x != y    // not equal
x < y     x > y     x <= y     x >= y

// Logical (short-circuit)
a && b    // AND — if a is false, b is never evaluated
a || b    // OR  — if a is true, b is never evaluated
!a        // NOT

// CRITICAL: == vs .equals() for objects
String s1 = new String("hello");
String s2 = new String("hello");
s1 == s2        // FALSE — different objects on heap
s1.equals(s2)   // TRUE  — same character content

    }
}