package com.bridgelabz.basic_core_programs;

import java.util.Random;

class flip {
    public String chanceFun(){
        Random r = new Random();
        int toss = r.nextInt(2);
        if (toss == 1) {
            return "Tails";
        } else {
            return"Heads";
        }
    }
}
public class CoinFlip {
    public static void main(String[] args) {
        flip f = new flip();
        int toss = 100;
        int Heads = 0;
        int Tails = 0;
        for (int i = 1; i <= toss; i++) {
            if (f.chanceFun().equals("Tails")) {
                Tails++;
            } else {
                Heads++;
            }
        }
        System.out.println(Heads+"% Heads");
        System.out.println(Tails+"% Tails");
    }
}