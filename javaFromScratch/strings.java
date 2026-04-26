package javaFromScratch;

public class strings {
    public static void main(String[] args) {
        String s = "The Quick Brown Fox Jumps Over The Lazy Dog";

        // methods
        System.out.println(s.length());
        s.charAt(0);
        s.substring(1, 3);
        s.indexOf("el");
        s.contains("Hell");
        String trim = s.trim();
        System.out.println(trim);
        String[] split = s.split(" ");
        System.out.println(split);
        s.isEmpty();

        String full = "Hello" + " " + "World !";
        var sb = new StringBuilder();

        for (int i = 0; i <= 1000; i++) {
            sb.append(i).append(", ");
        }

        String result = sb.toString();
        String msg2 = "User %s has %d items".formatted("Alice", 42);
        System.out.println(result);
        System.out.println(msg2);
    }
}