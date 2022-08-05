package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class NumberSwap {
    public static void main(String[] args) {

        System.out.println("Enter the value of X");
        Scanner n1 = new Scanner(System.in);
        int x = n1.nextInt();

        System.out.println("Enter the value of Y");
        Scanner n2 = new Scanner(System.in);
        int y = n2.nextInt();

        System.out.println("x="+x);
        System.out.println("y="+y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After Swap");
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
