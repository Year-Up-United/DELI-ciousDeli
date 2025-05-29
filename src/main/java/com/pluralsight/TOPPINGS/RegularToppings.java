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
private String s;
    // create constructor so that regular toppings can be called
public RegularToppings(String s){
    this.s = s;
}

        private static final List<String> RegularToppings = Arrays.asList(
                "lettuce", "peppers", "onions", "tomatoes",
                "jalapeños", "cucumbers", "pickles", "guacamole", "mushrooms"
        );

        public static List<String> getAll() {
            return RegularToppings;
        }

        public static void displayAll() {
            System.out.println("Available Regular Toppings:");
            for (String topping : RegularToppings) {
                System.out.println(" - " + topping);
            }
        }

        public static boolean isValid(String input) {
            return RegularToppings.contains(input.toLowerCase());
        }
    }

