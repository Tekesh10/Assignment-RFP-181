package Day5.BasicCorePrograms;

import java.util.Scanner;

class harmonic
{
    public static void main(String[] args) {
        System.out.println("Enter a Number for Nth Harmonic Number");
        Scanner N = new Scanner(System.in);
        double n = N.nextDouble(),i,sum = 0;

        for (i = 1; i <= n; i++) {
            sum = sum+ (1/i);
        }
        System.out.println(n+"th Harmonic Number is => " +sum);
    }
}
