package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter 4 digit Year");
        Scanner y = new Scanner(System.in);
        int year = y.nextInt();

        if ((year % 4 == 0))
            System.out.println( year+ " is a Leap Year");
        else
            System.out.println( year+ " is not a Leap Year");
    }
}
