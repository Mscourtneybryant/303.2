package org.example;

public class OperatorsAndNumbers {
    public static void main(String[] args) {
        int x = 2;
        int y = 150;

        //left shift
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(x << 2));
        System.out.println(Integer.toBinaryString(x << 9));
        System.out.println(Integer.toBinaryString(x << 17));
        System.out.println(Integer.toBinaryString(x << 88));

        //right shift
        System.out.println(Integer.toBinaryString(y >> 225));
        System.out.println(Integer.toBinaryString(y >> 1555));
        System.out.println(Integer.toBinaryString(y >> 32456));

    }
    }


