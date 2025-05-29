package com.pluralsight.MENU;

import java.util.ArrayList;
import java.util.List;
import com.pluralsight.TOPPINGS.PremiumToppings;
import com.pluralsight.TOPPINGS.RegularToppings;

public class Sandwich {

    // variables
    private String size; // "4", "8", "12"
    private String breadType; // white, wheat, rye, wrap
    private boolean isToasted;

    private List<PremiumToppings> premiumToppings = new ArrayList<>();
    private List<RegularToppings> regularToppings = new ArrayList<>();
    private List<String> sauces = new ArrayList<>();

    // sandwich build
    public Sandwich(String size, String breadType, boolean isToasted){
        this.size = size;
        this.breadType = breadType;
        this.isToasted = isToasted;
    }

    // call + variable to add premium toppings
    public void addPremiumTopping(PremiumToppings topping){
        premiumToppings.add(topping);
    }

    // call + variable to add regular topping
    public void addRegularTopping(RegularToppings topping){
        regularToppings.add(topping);
    }

    // call + variable to add sauce
    public void addSauce(String sauce){
        sauces.add(sauce);
    }

    // method for price - base prices
    public double getBasePrice() {
        if (size.equals("4")) return 5.50;
        else if (size.equals("8")) return 7.00;
        else if (size.equals("12")) return 8.50;
        else return 0.0;
    }

    // method for total price
    public double getTotalPrice() {
        double total = getBasePrice();
        for (PremiumToppings topping : premiumToppings) {
            total += topping.getPrice(size);

        }
        return total;
    }

    // description for order summary / receipt
    public String getDescription() {
            String description = "";

            description += size + "\" " + breadType + " sandwich";
            if (isToasted) {
                description += " (TOASTED)";
            }

//            description += "\nRegular Toppings:";
//            for (RegularToppings currentTopping : regularToppings) {
//                description += "\n  - " + currentTopping.getName(); // add variable for regulartopping class
//            }

            description += "\nPremium Toppings:";
            for (PremiumToppings currentTopping : premiumToppings) {
                description += "\n  - " + currentTopping.getName();
                if (currentTopping.isExtra()) {
                    description += " (EXTRA)";
                }
            }

            description += "\nSAUCES:";
            for (String sauce : sauces) {
                description += "\n  - " + sauce;
            }

            description += "\nTOTAL PRICE: $" + String.format("%.2f", getTotalPrice());

            return description;
        }

        // Optional Getters
        public String getSize() {
            return size;
        }

        public String getBreadType() {
            return breadType;
        }

        public boolean getIsToasted() {
            return isToasted;
        }

        public List<PremiumToppings> getPremiumToppings() {
            return premiumToppings;
        }

        public List<RegularToppings> getRegularToppings() {
            return regularToppings;
        }

        public List<String> getSauces() {
            return sauces;
        }
    }

//                +------------------+
//                |    Sandwich      |
//                +------------------+
//                | - size           |
//                | - breadType      |
//                | - toppings       |
//                | - isToasted      |
//                +------------------+
//                | +addTopping()    |
//                | +getPrice()      |
//                +------------------+




