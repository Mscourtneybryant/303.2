package org.example;
import java.util.Scanner;

public class controlFlowConditionalStatement5 {
    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the score: ");
                int score = scanner.nextInt();


                scanner.close();


                if (score < 0 || score > 100) {
                    System.out.println("Score out of range");
                } else if (score >= 90 && score <= 100) {
                    System.out.println("A");
                } else if (score >= 80 && score <= 89) {
                    System.out.println("B");
                } else if (score >= 70 && score <= 79) {
                    System.out.println("C");
                } else if (score >= 60 && score <= 69) {
                    System.out.println("D");
                } else {
                    System.out.println("F");
                }
            }
        }



