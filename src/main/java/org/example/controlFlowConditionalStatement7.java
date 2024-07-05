package org.example;
import java.util.Scanner;

public class controlFlowConditionalStatement7 {
    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);


                System.out.println("Choose your filing status:");
                System.out.println("1. Single");
                System.out.println("2. Married Filing Jointly");
                System.out.println("3. Married Filing Separately");
                System.out.println("4. Head of Household");
                System.out.print("Enter the number corresponding to your filing status: ");
                int statusChoice = scanner.nextInt();

                System.out.print("Enter your taxable income: ");
                double income = scanner.nextDouble();

                scanner.close();

                double tax = 0;

                switch (statusChoice) {
                    case 1:
                        tax = calculateSingleTax(income);
                        break;
                    case 2:
                        tax = calculateMarriedFilingJointlyTax(income);
                        break;
                    case 3:
                        tax = (income);
                        break;
                    case 4:
                        tax = (income);
                        break;
                    default:
                        System.out.println("Invalid choice of filing status.");
                        return;
                }

                System.out.printf("Your federal income tax is: $%.2f%n", tax);
            }


            public static double calculateSingleTax(double income) {
                double tax;

                if (income <= 8350) {
                    tax = income * 0.10;
                } else if (income <= 33950) {
                    tax = 8350 * 0.10 + (income - 8350) * 0.15;
                } else if (income <= 82250) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
                } else if (income <= 171550) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
                } else if (income <= 372950) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
                } else {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
                }

                return tax;
            }


            public static double calculateMarriedFilingJointlyTax(double income) {
                return calculateSingleTax(income);
            }


        }
