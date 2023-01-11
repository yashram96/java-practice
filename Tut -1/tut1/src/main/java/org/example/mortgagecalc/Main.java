package org.example.mortgagecalc;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12 ;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principle : ");
        long principle = scanner.nextLong();
        System.out.print("Enter the Annual interest rate :");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT ;
        System.out.print("Enter the period (years) :");
        int noOfYears = scanner.nextInt();
        int numberOfPayments = noOfYears * MONTHS_IN_YEAR ;

        double squared = Math.pow((1.0F + monthlyInterest) , numberOfPayments );
        double multiplier = (monthlyInterest * squared) / (squared - 1) ;
        double mortgageValue = (principle * multiplier);

        String mortgageValueFormatted = NumberFormat.getCurrencyInstance().format(mortgageValue);
        System.out.println("Total mortgage : " + mortgageValueFormatted );

    }
}
