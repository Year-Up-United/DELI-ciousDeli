package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Welcome Message
        System.out.println("\u001B[95m ☆ WELCOME TO THE DOLL'S DELI ☆\u001B[0m");

        // ADD scanner so that input can be accepted
        Scanner scanner = new Scanner(System.in);

        // call for UserInterface
        UserInterface uI = new UserInterface();
        boolean running = true;

        // loop things
        while (running) {

            // User input needed for selection
            System.out.println("Please select from the following: ");
            System.out.println("\u001B[95m☆ 1: START ORDER\u001B[0m");
            System.out.println("\u001B[95m☆ 0: EXIT\u001B[0m");
            System.out.println("\u001B[95m☆ ENTER YOUR CHOICE PLEASE: ☆\u001B[0m");

            // scan for input
            if (scanner.hasNext()) {
                int choice = scanner.nextInt();
                scanner.nextLine(); // clears the new line
                switch (choice) {
                    case 1:
                        uI.displayMenus(scanner); // pass the scanner to reuse
                        break;
                    case 0:
                        System.out.println("\u001B[95m☆ THANK YOU FOR VISITING THE DOLL'S DELI ☆\u001B[0m");
                        running = false;
                        break;
                    default:
                        System.out.println("\u000B[95m☆ INVALID CHOICE ☆\u001B[0m");
                }
            } else {
                System.out.println("\u001B[95m ☆ PLEASE ENTER A NUMBER ☆\u001B[0m");
            }
        }

        scanner.close();
    }
}
        // call user interface
//        UserInterface uI = new UserInterface();
//
        // call from user interface
//        uI.displayMenus();
//
//      System.out.println("\u001B[95mThis is Baby Pink (Bright Magenta)\u001B[0m");
//      System.out.println("\u001B[35mThis is Barbie Pink (Magenta)\u001B[0m");

