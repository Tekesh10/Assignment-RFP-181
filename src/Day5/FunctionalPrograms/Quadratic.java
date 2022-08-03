package Day5.FunctionalPrograms;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {

        System.out.println("Enter value of A");
        Scanner A = new Scanner(System.in);
        int a = A.nextInt();
        System.out.println("Enter value of B");
        Scanner B = new Scanner(System.in);
        int b = B.nextInt();
        System.out.println("Enter value of C");
        Scanner C = new Scanner(System.in);
        int c = C.nextInt();

        double delta = (b * b - 4 * a * c);
        double Root1,Root2;

        if (delta > 0) {
            Root1 = (-b + Math.sqrt(delta)) / (2 * a);
            Root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Root 1 => " + Root1 + " and Root 2 => "+Root2);
        } else if (delta == 0) {
            Root1 = Root2 = - b / (2 * a);
            System.out.println("Root 1 and Root 2 => "+Root1);
        }else {
            double real = - b / (2 * a);
            double imaginary = Math.sqrt(-delta) / (2 * a);
            System.out.format("Root 1 => "+real,imaginary);
            System.out.format("\nRoot 2 => "+real,imaginary);
        }
    }
}
