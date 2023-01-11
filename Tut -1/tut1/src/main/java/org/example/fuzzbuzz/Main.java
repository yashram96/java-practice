package org.example.fuzzbuzz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Enter the number :");
        int number = scanner.nextInt();
        String fuzzBuzzOutput = "";

        if ((number % 3 ==0 )&& (number % 5 ==0) )
            fuzzBuzzOutput = "fuzzbuzz";
        else if (number % 3 ==0 )
            fuzzBuzzOutput = "fuzz";
        else if (number % 5 == 0 )
            fuzzBuzzOutput = "buzz";
        else
            fuzzBuzzOutput = String.valueOf(number);
        System.out.println(fuzzBuzzOutput);


    }
}
