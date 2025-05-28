package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Welcome Message
        System.out.println("\u001B[95m ☆ WELCOME TO THE DOLL'S DELI ☆\u001B[0m");

        // ADD scanner so that input can be accepted
        Scanner scanner = new Scanner(System.in);

        // User input needed for selection
        System.out.println("Please select from the following: ");
        System.out.println("\u001B[95m☆ 1: START ORDER\u001B[0m");
        System.out.println("\u001B[95m☆ 0: EXIT\u001B[0m");

        // scan for input
        int choice = scanner.nextInt();
        scanner.nextLine();

        //

//      System.out.println("\u001B[95mThis is Baby Pink (Bright Magenta)\u001B[0m");
//      System.out.println("\u001B[35mThis is Barbie Pink (Magenta)\u001B[0m");






    }
}
