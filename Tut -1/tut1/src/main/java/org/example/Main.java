package org.example;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

//        primitive types usage
        byte myAge = 27;
        int rollNumber = 2345 ;
        long viewsCount = 10101010101000010L;
        float distance = 10.33F;
        char seriesId = 'C';
        boolean isEligible = true;
//        reference types usage
        Date now = new Date();

//        string is also a reference type class, but we can use normal direct declaration unlike others to initialize as new
        String welcomeCode = "Hello" ;
        String welcomeCodeExt = welcomeCode + "!!";
        String welcomeCodeName = welcomeCode + " \"Yeswanth\" " + "!!" ;
        String linuxDirectory = "src/main/java/org/example/Main.java" ;
        String winDirectory =  "c:\\Desktop\\project\\example.py" ;


//        primitive types mutation
        byte yoursAge = myAge;
        myAge = 35;

        // reference types mutations
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 8;

        // Arrays
        int[] firstArrayInt = new int[5]; // 5 is size
        firstArrayInt[0] = 10;
        firstArrayInt[4] = 9;

        int[] secondArrayInt = {30,4,5,6,90} ;
        System.out.println(Arrays.toString(secondArrayInt));
        Arrays.sort(secondArrayInt); // sorts the existing array
        System.out.println(Arrays.toString(secondArrayInt));

        /* multi dimension arrays */
        int[][] multiDimensionArrayInt = new int[2][3] ;
        multiDimensionArrayInt[0][1] = 19;
        multiDimensionArrayInt[1][2] = 67;

        int[][] multiDimensionArrayDirect = {{2,3} ,{4,9,0},{9,3,2}} ;
        System.out.println(Arrays.deepToString(multiDimensionArrayDirect));
        System.out.println(multiDimensionArrayDirect.length);

//        constants (immutable variables )
        final int consInt = 20 ;


//        Arithmetics
        int sumInt = 10 + 3 ; // similar * : multi , - : subtraction ,/ : division , % : remainder (modulus )

        int divInt = 10 /3 ; //returns 3 as integer divided is and integer
        double divDouble = (double) 10 / (double) 3 ; // (double) is casting the integer to double

        System.out.println(divDouble);
        System.out.println(divInt);


        int x = 20 ;
        System.out.println(x);

        int y = x++;
        int z = ++x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


//        Casting

        int castInt1 = 10 ;
        double castInt2 = castInt1 * 3.3 ; // implicit casting ...sometimes automatically casts

        String castInt3 = "1.1" ;
        double castInt4 =  Double.parseDouble(castInt3) + castInt1; // if incompatible casting needed then we need touse similar to all types Ex: Int.parseInt()

        System.out.println(castInt2);
        System.out.println(castInt3);
        System.out.println(castInt4);

//        Number formatting
//        TTU : abstract classes
        String currency = NumberFormat.getCurrencyInstance(Locale.CHINA).format(123232.0878);
        System.out.println(currency);

        String percentage = NumberFormat.getPercentInstance().format(0.236);
        System.out.println(percentage);


//        Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name : ");
        String name = scanner.nextLine().trim();
        System.out.println("Hi "+ name);


//        ternary operator
        int income = 100_000;
        String rank = income > 5_000 ? "First" : "Second" ;
        System.out.println(rank);



//        Switch statement

        String role = "admin";
        switch (role){
            case "admin":
                System.out.println("you're Admin");
                break;
            case "editor":
                System.out.println("you're edito");
                break;
            default:
                System.out.println("you're guest");
        }

        System.out.println(now.getDate());
        System.out.println(point2.x);
        System.out.println(yoursAge);
        System.out.println(welcomeCode);
        System.out.println(welcomeCodeExt.endsWith("!!"));
        System.out.println(welcomeCodeName);
        System.out.println(linuxDirectory);
        System.out.println(winDirectory);
        System.out.println(firstArrayInt); // prints the address value
        System.out.println(Arrays.toString(firstArrayInt)); // prints actual array value
        System.out.println(Arrays.toString(secondArrayInt));
        System.out.println(firstArrayInt.length);

        System.out.println(Arrays.toString(multiDimensionArrayInt)); // prints the address here instead of values
        System.out.println(Arrays.deepToString(multiDimensionArrayInt)); //Multidimensional array values have different method to print values
    }
}