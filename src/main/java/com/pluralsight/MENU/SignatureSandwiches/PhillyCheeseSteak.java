package com.pluralsight.MENU.SignatureSandwiches;
import com.pluralsight.MENU.Sandwich;
import com.pluralsight.TOPPINGS.RegularToppings;
import com.pluralsight.TOPPINGS.PremiumToppings;

public class PhillyCheeseSteak extends Sandwich {

    public PhillyCheeseSteak() {
        super("12", "white",true); // 12-inch, toasted

        // premium toppings
        addPremiumTopping(new PremiumToppings("steak","meat",false));
        addPremiumTopping(new PremiumToppings("provolone","cheese",false));

        // regular toppings
        addRegularTopping(new RegularToppings("onions"));
        addRegularTopping(new RegularToppings("peppers"));
        addRegularTopping(new RegularToppings("mushrooms"));

        // sauce
        addSauce("chipotle mayo");
    }

}
