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
        Str
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

}
