package org.example;

public class controlFlowConditionalStatements4 {
    public static void main(String[] args) {
        int x = 5;
        if(x > 10 || x < 20){
            System.out.println("Out of Range");
        }else if(x > 10 && x < 20) {
            System.out.println("In Range");
        }
    }
}
