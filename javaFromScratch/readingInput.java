package javaFromScratch;

import java.util.Scanner;

public class readingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, What's your name:");
        String name = sc.nextLine();

        System.out.println("and how old are you?");
        int age = sc.nextInt();

        System.out.println("Enter your GPA:");
        double gpa = sc.nextDouble();

        System.out.printf("%s is %d years old and has a GPA of %.3f  %n", name, age, gpa);

        sc.close();

    }
}
