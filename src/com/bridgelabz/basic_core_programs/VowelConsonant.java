package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {

        System.out.println("Enter an Alphabet");
        Scanner a = new Scanner(System.in);
        char C = a.next().charAt(0);

        if (C == 'a' || C == 'e' || C == 'i' || C == 'o' || C == 'u' || C == 'A' || C == 'E' || C == 'I' || C == 'O' || C == 'U')
            System.out.println(C+" is a Vowel");
        else
            System.out.println(C+" is a Consonant");
    }
}

