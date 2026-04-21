package com.plualsight;

import java.io.*;
import java.util.Scanner;


public class BedtimeStories {
    public static void main(String[] args) throws InterruptedException {
        Scanner userInput = new Scanner(System.in);
        String nextStory;
        String storyInput;

        do {
            System.out.println("----------Welcome Choose From The Stories----------");
            System.out.println("(1) goldilocks");
            System.out.println("(2) hansel and gretel");
            System.out.println("(3) mary had a little lamb");
            System.out.println("(0) Exit");
            System.out.print("Pick Using A Numerical Value: ");
            int userChoice = userInput.nextInt();
            userInput.nextLine();

            switch(userChoice) {
                case 1 -> {
                    try {
                        FileReader storyReader = new FileReader("src/main/resources/goldilocks.txt");
                        BufferedReader bufReader = new BufferedReader(storyReader);

                        while ((storyInput = bufReader.readLine()) != null) {
                            System.out.println(storyInput);

                            Thread.sleep(200);
                        }
                        bufReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();

                    }
                    break;
                }
                case 2 -> {
                    try {
                        FileReader storyReader = new FileReader("src/main/resources/hansel_and_gretel.txt");
                        BufferedReader bufReader = new BufferedReader(storyReader);

                        while ((storyInput = bufReader.readLine()) != null) {
                            System.out.println(storyInput);
                            Thread.sleep(200);

                        }
                        bufReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 3 -> {
                    try {
                        FileReader storyReader = new FileReader("src/main/resources/mary_had_a_little_lamb.txt");
                        BufferedReader bufReader = new BufferedReader(storyReader);

                        while ((storyInput = bufReader.readLine()) != null) {
                            System.out.println(storyInput);
                            Thread.sleep(200);

                        }
                        bufReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 0 -> {
                    break;
                }
            }
            System.out.print("Want to read another story? (yes/no): ");
            nextStory = userInput.nextLine();

        } while(nextStory.equalsIgnoreCase("yes"));

        System.out.println("Good Bye");
        userInput.close();




    }
}
