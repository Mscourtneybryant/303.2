package org.example;

public class twoint {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;

        // Using prefix increment operator (++x)
        int sumPrefix = ++x + y;
        System.out.println("Using prefix increment (++x):");
        System.out.println("sum = " + sumPrefix);
        System.out.println("Value of x after calculation: " + x);

        // Using postfix increment operator (x++)
        x = 5;
        int sumPostfix = x++ + y;
        System.out.println("\nUsing postfix increment (x++):");
        System.out.println("sum = " + sumPostfix);
        System.out.println("Value of x after calculation: " + x);
    }
}
