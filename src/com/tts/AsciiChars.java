package com.tts;
import.util.Scanner;
import.util.Random;

public class AsciiChars {

    // print valid numeric input. Create a for loop
    public static void printNumbers() {
      System.out.println("Numbers:");
      for (int i = '0'; i <= '9'; i++) {
          System.out.println(i);
        }
//      System.out.println();
    }

//  print valid lowercase alphabetic input (for loop here)
    public static void printLowerCase(){
        System.out.println("Lower Case:");
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }
//        System.out.println();
    }

    //   print valid uppercase alphabetic input (for loop)
    public static void printUpperCase() {
        System.out.println("Upper Case:");
        for (int i = 'A'; i <= 'Z'; i++){
            System.out.println(i);
        }
//        System.out.println();
        }
    }

//    I can see how these are constructed.
//    I found an Ascii chart and see how these different values correspond to numbers and the idea is to loop through them. What I cannot really understand is how to make it ~work~ for me and print using System.out.println() without creating an error?
// ** I skipped the "please enter your name" assignment
