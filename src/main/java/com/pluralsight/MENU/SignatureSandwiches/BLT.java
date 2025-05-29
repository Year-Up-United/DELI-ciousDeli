package com.pluralsight.MENU.SignatureSandwiches;

import com.pluralsight.MENU.Sandwich;
import com.pluralsight.TOPPINGS.RegularToppings;
import com.pluralsight.TOPPINGS.PremiumToppings;

public class BLT extends Sandwich {

public BLT(){
    super("8", "white", false);{
        // premium topping
        addPremiumTopping(new PremiumToppings("bacon","meat",false));

        // regular toppings
        addRegularTopping(new RegularToppings("lettuce"));
        addRegularTopping(new RegularToppings("tomatoes"));

        // sauce
        addSauce("mayonnaise");
    }
}
}
