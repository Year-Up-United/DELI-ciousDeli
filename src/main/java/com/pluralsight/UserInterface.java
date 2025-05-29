package com.pluralsight;

import com.pluralsight.MENU.Sandwich;
import com.pluralsight.MENU.Chips;
import com.pluralsight.MENU.Drinks;
import com.pluralsight.MENU.SignatureSandwiches.BLT;
import com.pluralsight.MENU.SignatureSandwiches.PhillyCheeseSteak;
import com.pluralsight.MENU.SignatureSandwiches.TheDollSandwich;
import com.pluralsight.ReceiptWriter;
import com.pluralsight.TOPPINGS.PremiumToppings;
import com.pluralsight.TOPPINGS.RegularToppings;

import java.util.Scanner;

public class UserInterface {

//              +------------------+
//              |     CLI/UI       |
//              +------------------+
//              |                  |
//              |  +displayMenus() |
//              +------------------+

    public void displayMenus(Scanner scanner) {
        Order order = new Order();
        boolean running = true;

        while (running) {
            System.out.println("\n\u001B[95m☆ PLEASE SELECT WHAT YOU'D LIKE FROM THE MENU ☆\u001B[0m");
            System.out.println("\u001B[95m☆ 1: ADD A SANDWICH\u001B[0m");
            System.out.println("\u001B[95m☆ 2: ADD A DRINK\u001B[0m");
            System.out.println("\u001B[95m☆ 3: ADD CHIPS\u001B[0m");
            System.out.println("\u001B[95m☆ 4: CHECKOUT\u001B[0m");
            System.out.println("\u001B[95m☆ 0: CANCEL ORDER\u001B[0m");
            System.out.print("YOUR CHOICE: ");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    Sandwich sandwich = buildSandwich(scanner);
                    if (sandwich != null) {
                        order.addSandwich(sandwich);
                        System.out.println("\u001B[95m☆ SANDWICH ADDED TO ORDER ☆\u001B[0m");
                    }
                    break;

                case "2":
                    Drinks drink = buildDrink(scanner);
                    if (drink != null) {
                        order.addDrinks(drink);
                        System.out.println("\u001B[95m☆ DRINK ADDED TO ORDER ☆\u001B[0m");
                    }
                    break;

                case "3":
                    Chips chip = buildChips(scanner);
                    if (chip != null) {
                        order.addChips(chip);
                        System.out.println("\u001B[95m☆ CHIPS ADDED TO ORDER ☆\u001B[0m");
                    }
                    break;

                case "4":
                    System.out.println(order.getDescription());
                    System.out.print("CONFIRM ORDER? (yes/no): ");
                    String confirm = scanner.nextLine();
                    if (confirm.equalsIgnoreCase("yes")) {
                        ReceiptWriter.writeReceipt(order);
                        running = false;
                    } else {
                        System.out.println("\u001B[95m☆ ORDER CANCELED ☆\u001B[0m");
                        running = false;
                    }
                    break;

                case "0":
                    System.out.println("\u001B[95m☆ ORDER CANCELED ☆\u001B[0m");
                    running = false;
                    break;

                default:
                    System.out.println("INVALID SELECTION.");
            }
        }
    }

    private Sandwich buildSandwich(Scanner scanner) {
        System.out.println("\n\u001B[95m☆ BUILD A SANDWICH ☆\u001B[0m");
        System.out.println("\u001B[95m☆ 1: SIGNATURE SANDWICH\u001B[0m");
        System.out.println("\u001B[95m☆ 2: CUSTOM SANDWICH\u001B[0m");
        System.out.print("YOUR CHOICE: ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            System.out.println("\n\u001B[95m☆ SIGNATURE OPTIONS ☆\u001B[0m");
            System.out.println("\u001B[95m☆ 1: BLT\u001B[0m");
            System.out.println("\u001B[95m☆ 2: PHILLY CHEESE STEAK\u001B[0m");
            System.out.println("\u001B[95m☆ 3: THE DOLL SANDWICH\u001B[0m");
            System.out.print("CHOOSE YOUR SANDWICH: ");
            String sigChoice = scanner.nextLine();

            return switch (sigChoice) {
                case "1" -> new BLT();
                case "2" -> new PhillyCheeseSteak();
                case "3" -> new TheDollSandwich();
                default -> {
                    System.out.println("INVALID CHOICE.");
                    yield null;
                }
            };

        } else if (choice.equals("2")) {
            System.out.print("SIZE (4', 8', 12'): ");
            String size = scanner.nextLine();

            System.out.print("BREAD TYPE (white, wheat, rye, wrap): ");
            String bread = scanner.nextLine();

            System.out.print("TOASTED? (yes/no): ");
            boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");

            Sandwich sandwich = new Sandwich(size, bread, toasted);

            // Premium toppings
            System.out.println("\n\u001B[95m☆ ADD PREMIUM TOPPINGS ☆\u001B[0m");
            System.out.println("ADD-ONS (MEAT): STEAK, HAM, SALAMI, ROAST BEEF, CHICKEN, BACON");
            System.out.println("ADD-ONS (CHEESE): AMERICAN, PROVOLONE, CHEDDAR, SWISS");
            while (true) {
                System.out.print("TOPPING NAME (or 'done'): ");
                String name = scanner.nextLine();
                if (name.equalsIgnoreCase("done")) break;

                System.out.print("TYPE (meat or cheese): ");
                String type = scanner.nextLine();

                System.out.print("IS THIS EXTRA? (yes/no): ");
                boolean isExtra = scanner.nextLine().equalsIgnoreCase("yes");

                sandwich.addPremiumTopping(new PremiumToppings(name, type, isExtra));
            }

            // Regular toppings
            System.out.println("\n\u001B[95m☆ ADD REGULAR TOPPINGS ☆\u001B[0m");
            System.out.println("FREE TOPPINGS: LETTUCE, PEPPERS, ONIONS, TOMATOES, JALAPENOS, CUCUMBERS, PICKLES, GUACAMOLE, MUSHROOMS");
            while (true) {
                System.out.print("TOPPING NAME (or 'done'): ");
                String name = scanner.nextLine();
                if (name.equalsIgnoreCase("done")) break;

                sandwich.addRegularTopping(new RegularToppings(name));
            }

            // Sauces
            System.out.println("\n\u001B[95m☆ ADD SAUCES ☆\u001B[0m");
            while (true) {
                System.out.print("SAUCE NAME (or 'done'): ");
                String sauce = scanner.nextLine();
                if (sauce.equalsIgnoreCase("done")) break;

                sandwich.addSauce(sauce);
            }

            return sandwich;
        } else {
            System.out.println("INVALID CHOICE.");
            return null;
        }
    }
    // user input for drinks
    private Drinks buildDrink(Scanner scanner) {
        System.out.print("DRINK SIZE (small, medium, large): ");
        String size = scanner.nextLine();

        System.out.print("DRINK FLAVOR: ");
        String flavor = scanner.nextLine();

        return new Drinks(size, flavor);
    }

    // user input for chips
    private Chips buildChips(Scanner scanner) {
        System.out.print("CHIP TYPE: ");
        String type = scanner.nextLine();
        return new Chips(type);
    }
}

//
//
