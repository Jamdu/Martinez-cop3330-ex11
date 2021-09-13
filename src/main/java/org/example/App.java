package org.example;


import java.util.Scanner;

public class App
{
    static final double c_from = 1.3751;
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("How many euros are you exchanging? ");
        int euro = scnr.nextInt();
        System.out.println("What is the exchange rate? " + c_from);

        double c_to = euro * c_from;
        System.out.format(euro + " euros at an exchange rate of " + c_from + " is %.2f U.S. Dollars.", c_to);


    }
}
