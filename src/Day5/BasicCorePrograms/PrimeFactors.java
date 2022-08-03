package Day5.BasicCorePrograms;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();

        System.out.println("Prime factors of number " +num+ " is");

        for (int i = 2; i < num; i++) {
            while (num % i == 0) {
                System.out.println(i+"");
                num = num / i;
            }
        }
        if (num > 2) {
            System.out.println("Prime factors of number " +num+ " is");
        }
    }
}
