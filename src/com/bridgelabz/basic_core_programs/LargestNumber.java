package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number n1");
        Scanner n1 = new Scanner(System.in);
        int num1 = n1.nextInt();

        System.out.println("Enter a number n2");
        Scanner n2 = new Scanner(System.in);
        int num2 = n2.nextInt();

        System.out.println("Enter a number n3");
        Scanner n3 = new Scanner(System.in);
        int num3 = n3.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1+ " is a Greater number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2+ " is a Greater number");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3+ " is a Greater number");
        } else
            System.out.println("All numbers are equal");
    }
}
