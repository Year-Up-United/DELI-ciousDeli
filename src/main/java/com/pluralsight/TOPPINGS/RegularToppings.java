package com.pluralsight.TOPPINGS;
import java.util.Arrays;
import java.util.List;

public class RegularToppings {

//                +------------------+
//                |     Topping      |
//                +------------------+
//                | - name           |
//                | - type           |
//                | - isExtra        |
//                +------------------+

        private static final List<String> availableRegularToppings = Arrays.asList(
                "lettuce", "peppers", "onions", "tomatoes",
                "jalapeños", "cucumbers", "pickles", "guacamole", "mushrooms"
        );

        public static List<String> getAll() {
            return availableRegularToppings;
        }

        public static void displayAll() {
            System.out.println("Available Regular Toppings:");
            for (String topping : availableRegularToppings) {
                System.out.println(" - " + topping);
            }
        }

        public static boolean isValid(String input) {
            return availableRegularToppings.contains(input.toLowerCase());
        }
    }

