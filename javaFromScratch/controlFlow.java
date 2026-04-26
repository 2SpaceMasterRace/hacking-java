package javaFromScratch;

public class controlFlow {
    public static void main(String[] args) {
        int temperature = 100;

        if (temperature <= 100 && temperature >= 50) {
            System.out.println("Boiling");
        } else if (temperature >= 0 && temperature < 50) {
            System.out.println("Manageable");
        } else {
            System.out.println("Frozen");
        }

        // Classic C-Style Loops
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // Enhanced for-each style loop
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int n : numbers) {
            System.out.println(n);
        }

        int count  = 0;
        while (count < 5){
            System.out.println(count);
            count ++;
        }

        String day = new String("SAT");

        // Modern Switch expression
        String type = switch(day){
            case "MON", "TUE", "WED", "THU", "FRI" -> "Weekdays";
            case "SAT", "SUN" -> "Weekend";
            default -> throw new IllegalArgumentException("Unkown:" + day);
        }
    }
}
