package javaFromScratch;

import java.util.List;

public class variablesAndScope {
    public static void main(String[] args) {
        // Declaration and initialization
        int count = 0;
        int x; // declare only (local vars MUST be initialized before use)
        final int MAX = 100; // final is basically const but for Java

        // Type inference
        var name = "Alice";
        var numbers = List.of(1, 2, 3);

        // Scope
        x = 10;
        {
            int y = 20;
            System.out.println(x + y);
        }
    }
}
