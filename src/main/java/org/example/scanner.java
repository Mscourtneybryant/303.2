package org.example;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        double d = scan.nextDouble();
        int i = scan.nextInt();


        scan.close();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
