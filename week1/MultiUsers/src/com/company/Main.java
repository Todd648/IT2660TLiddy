package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter iterations:");
        int userCount = myObj.nextInt();

        String Name;
        String Age;

        int revLoopCounter = 0;
        int LoopCounter = 0;

        String[] People = new String[userCount];
        String[] Ages = new String[userCount];

        Scanner nameObj = new Scanner(System.in);
        Scanner ageObj = new Scanner(System.in);

        for (LoopCounter = 0; LoopCounter < userCount; LoopCounter++) {

            System.out.println("Enter name:");
            Name = nameObj.next();
            People[LoopCounter] = Name;

            System.out.println("Enter Age:");
            Age = nameObj.next();
            Ages[LoopCounter] = Age;
        }
        for (revLoopCounter = 0; revLoopCounter < userCount; revLoopCounter++) {
            System.out.println(People[revLoopCounter] + " is " + Ages[revLoopCounter] + " years old.");
        }
    }
}