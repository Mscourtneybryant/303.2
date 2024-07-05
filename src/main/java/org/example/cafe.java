package org.example;

public class cafe {
    public static void main(String[] args) {
        double coffeePrice = 2.00;
        double cappuccinoPrice = 3.00;
        double espressoPrice = 1.50;

        // Quantities ordered
        int coffeeQuantity = 3;
        int cappuccinoQuantity = 4;
        int espressoQuantity = 2;

        // Calculate subtotal
        double subtotal = (coffeePrice * coffeeQuantity) +
                (cappuccinoPrice * cappuccinoQuantity) +
                (espressoPrice * espressoQuantity);


        final double SALES_TAX_RATE = 0.07;
        double salesTax = subtotal * SALES_TAX_RATE;


        double totalSale = subtotal + salesTax;

        System.out.println(totalSale);

    }
}
