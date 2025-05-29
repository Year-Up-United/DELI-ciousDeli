package com.pluralsight;
// import com.pluralsight.MENU.Sandwich;
import java.util.Scanner;


public class UserInterface {

//                +------------------+
//                |     CLI/UI       |
//                +------------------+
//                |                  |
//                | +displayMenus()  |
//                +------------------+
    public void run() {
        Scanner scanner = new Scanner(System.in);

        boolean active = true;
        while (active) {

        }
    }

    public void displayMenus(Scanner scanner){
        // create variables & scanner for input
        Order order = new Order();

        // step 0: create an instance of the order class
        // example: Order order = new order;
        System.out.println("\u001B[95m☆ PLEASE SELECT WHAT YOU'D LIKE FROM THE MENU ☆ \u001B[0m");
        // add a loop only exit with option 0
        // step 1: write the menu (display menu)
        // menu  adds items
        // step 2: ask user to input what they want
        // make sure they put numbers, etc for item listing
        // step 3: make a switch statement to process the choices
        // option 1 - add sandwich (return Sandwich)
        // option 2 - add drink (return Drinks)
        // option 3 - add chips (return Chips)
        // option 4 - checkout
        // option 0 - cancel and go back to homepage
        //
    }



}
