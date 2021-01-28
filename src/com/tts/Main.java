package com.tts;
import com.sun.javaws.jnl.LibraryDesc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //  write your code here
//  Line 8: First, create a simple Java project that prints "Hello World".
        System.out.println("Hello World.");

//  Calling the methods from the AsciiChars class
        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

//  begin scanner portion
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hi there, what is your name? ");
        String someString = scanner.next();

        System.out.println("Welcome, " + someString + ". \n This is a survey about astrological signs. Would you like to participate now? \ny -or- n");
        String yOrN = scanner.next();
        if (yOrN.equalsIgnoreCase("n")) {
            System.out.println("We understand! Please come back to complete the survey at your convenience.");
            System.exit(0);
        } else if (yOrN.equalsIgnoreCase("y")) {
            boolean saysYes = true;
            while (saysYes) {
                System.out.println("Great! now we're going to ask you some questions:" );

                System.out.println("In what month were you born?");
                String birthMonth = scanner.next();

                System.out.println("On what day of that month?");
                int birthDay = scanner.nextInt();

                System.out.println("What year was it?");
                int birthYear = scanner.nextInt();

                System.out.println("Lovely. In what state/province were you born?");
                String birthState = scanner.next();

                System.out.println("And which city in " + birthState + "?");
                String birthCity = scanner.next();

                System.out.println("Last question! If you know, (can you round to the nearest hour) what time were you born?");
                int birthTime = scanner.nextInt();

//  ask how to program signs based on months. *For reference*:
//      Aries March 21-April 19
//      Taurus April 20-May 20
//      Gemini May 21-June 20
//      Cancer June 21-July 22
//      Leo July 23-August 22
//      Virgo August 23-September 22
//      Libra September 23-October 22
//      Scorpio October 23-November 22
//      Sagittarius November 23-December 21
//      Capricorn December 22-January 19
//      Aquarius January 20-February 18
//      Pisces February 19-March 20

                System.out.println("All done! Thank you for your results. Based on your chart, it looks like you are a: \n \n ~*~*~Capricorn~*~*~");
                break;
            }
        }
        System.out.println("\n Thank you for your participation! See you next time.");
    }
}