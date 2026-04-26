package javaFromScratch;

public class methods {
    public static int square(int n) {
        return n * n;
    }

    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static double square(double n) {
        return n * n;
    }

    public static int factorial(int n) {
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int square_result = square(5);
        int factorial_result = factorial(5);
        greet("User");
        System.out.println(square_result);
        System.out.println(factorial_result);
    }
}