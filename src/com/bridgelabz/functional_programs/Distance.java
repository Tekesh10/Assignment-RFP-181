package com.bridgelabz.functional_programs;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        System.out.println("Enter X coordinates");
        Scanner X = new Scanner(System.in);
        int x = X.nextInt();

        System.out.println("Enter Y coordinates");
        Scanner Y = new Scanner(System.in);
        int y = Y.nextInt();

        double distance;
        distance = Math.sqrt(x*x+y*y);
        System.out.println("The distance between given coordinates ("+x+","+y+") and origin is "+distance);
    }
}
