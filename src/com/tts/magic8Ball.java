package com.tts;
import java.util.Random;


//Decided to deviate from the ~instructions and just create a type of random number generator called magic8Ball b/c my scanner questions in main.java didn't result in many numeric responses.

public class magic8Ball {
    public static void main(String[] args) {
        int starterNum = 2;

        Random rand = new Random();
        Integer randoNum1 = rand.nextInt(25);

        int magicBall1 = (starterNum *= randoNum1);
        int magicBall2 = 0;
        if (magicBall1 > 50) {
            magicBall2 = magicBall1 - 50;
        } else {
            magicBall2 = magicBall1;
        }
        System.out.println("Nice! you took a gamble and returned the number: \n" + magicBall1);
    }
}