package org.example;

public class CoreJavaBasics {

    public static int addNumbers(int a, int b, int c){
        int sum = (a + c) + (b + c);
        return sum;
    }
    public static void main(String[] args) {
        int result = addNumbers(2,4,6);
        System.out.println(result);

        double dresult = addDoubleNumbers(4224,80245330,12);
        System.out.println(dresult);

        double newResult = adddiNumbers (2000, (int) 4.064, 5003);
        System.out.println(newResult);

        int resultThree = addAndDivide(12,24);
        System.out.println(resultThree);

        int theResults = addingNumbers(5,6);
        System.out.println(theResults);
    }

    public static int addDoubleNumbers(int a, int b, int c){
        int sum = (a + c) + (b + c);
        return sum;
    }

    public static int adddiNumbers(int a, int b, int c){
        int sum = (a + c) + (b + c);
        return sum;
    }

    public static int addAndDivide(int a, int b){

        if(a > b){
            System.out.println((a + b) / b);
        }else {
            System.out.println((a + b) / a);
        }
        int sum = a + b;
        return sum;
    }

    public static int addingNumbers(int x, int y){
        int q = (x + y);
        return q;
    }



}

