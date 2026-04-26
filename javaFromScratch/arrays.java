package javaFromScratch;

public class arrays {
    public static void main(String[] args) {
        int[] nums = new int[5];
        int[] odds = { 1, 3, 5, 7, 9 };

        int firstElement = odds[0];
        int secondElement = odds[1];
        int thirdElement = odds[2];
        // int fouthElement = odds[9];
        int arrayLength = odds.length;

        int[][] grid = new int[3][4];
        grid[1][2] = 42;

        for (int i = 0; i <  nums.length; i++) {
            System.out.println(nums[i]);
        }

        for (int n : odds) {
            System.out.println(n);
        }
    }
}
