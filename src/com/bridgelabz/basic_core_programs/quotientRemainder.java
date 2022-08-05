package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class quotientRemainder {
    public static void main(String[] args) {

        System.out.println("Enter a dividend number");
        Scanner dvd = new Scanner(System.in);
        int dividend = dvd.nextInt();

        System.out.println("Enter a number divisor");
        Scanner dvs = new Scanner(System.in);
        int divisor = dvs.nextInt();

        int quotient = dividend / divisor, remainder = dividend % divisor;
        System.out.println("The Quotient of ("+dividend+ "/" +divisor+") is ("+quotient+") and the Remainder is ("+remainder+")");
    }
}
