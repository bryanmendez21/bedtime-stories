package com.plualsight;

import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String nextStory;

        do {
            System.out.println("----------Welcome Choose From The Stories----------");
            System.out.println("(1) goldilocks");
            System.out.println("(2) hansel and gretel");
            System.out.println("(3) mary had a little lamb");
            System.out.println("(0) Exit");
            System.out.print("Pick Using A Numerical Value: ");
            int userChoice = userInput.nextInt();
            userInput.nextLine();


            System.out.print("Want to read another story? (yes/no): ");
            nextStory = userInput.nextLine();

        } while(nextStory.equalsIgnoreCase("yes"));

        System.out.println("Good Bye");
        userInput.close();


    }
}
