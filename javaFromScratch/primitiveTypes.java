package javaFromScratch;

import java.util.Arrays;

public class primitiveTypes {
    public static void main() {

        // Integer types (signed, two's complement)
        byte c = 127; // 8 bits, range: -128 to 127
        short s = 32000; // 16 bits, range: -32,768 to 32,767
        int i = 2_000_000; // 32 bits, range: ≈ ±2.1 billion
        long l = 9_000_000_000L; // 64 bits (note the L suffix)

        // Floating point (IEEE 754)
        float f = 3.14f; // 32 bits, ~7 decimal digits precision
        double d = 3.14159265; // 64 bits, ~15 decimal digits precision

        // Other
        boolean flag = true; // true or false (JVM uses int internally!)
        char e = 'A'; // 16 bits, UTF-16 code unit

        // call-by-value of references in action:
        int a = 5;
        int b = a; // COPIES the value. b is now 5. Changing b won't affect a.
        System.out.println(a);
        System.out.println(b);
        b = 10;
        System.out.println("After modification");
        System.out.println(a);
        System.out.println(b);

        int[] x = { 1, 2, 3, 4, 5 };
        int[] y = x; // COPIES the reference. y points to the SAME array.
        System.out.println(Arrays.toString(x)); // because Java always passes by value, but for objects, the "value" is
                                                // a reference (pointer).
        System.out.println(Arrays.toString(y));
        y[0] = 99; // x[0] is now 99 too! They share the same object.
        System.out.println("After modification");
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));

    }

}
