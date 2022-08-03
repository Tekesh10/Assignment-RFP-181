package Day5.BasicCorePrograms;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();

        if (num % 2 ==0 ) {
            System.out.println(num+ " is an Even Number");
        }
        else {
            System.out.println(num+ " is an Odd Number");
        }
    }
}
