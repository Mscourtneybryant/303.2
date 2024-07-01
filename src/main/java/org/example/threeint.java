package org.example;

public class threeint {
    public static void main(String[] args) {
        int x = 7;
        int y = 17;
        int z = x & y;
        int a = x | y;
        int b = 4, c = 8;

        System.out.println(Integer.toBinaryString(z));
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b++));
        System.out.println(Integer.toBinaryString(++c));
    }


}


