package com.pluralsight.MENU.SignatureSandwiches;
import com.pluralsight.MENU.Sandwich;
import com.pluralsight.TOPPINGS.RegularToppings;
import com.pluralsight.TOPPINGS.PremiumToppings;

public class TheDollSandwich extends Sandwich {

    public TheDollSandwich(){
        super("8","wheat",true); // 8 inch on wheat

        // Premium toppings
        addPremiumTopping(new PremiumToppings("ham","meat",false));
        addPremiumTopping(new PremiumToppings("salami","meat", false));
        addPremiumTopping(new PremiumToppings("mortadella","meat",false));
        addPremiumTopping(new PremiumToppings("provolone","cheese", false));

        // regular toppings
        addRegularTopping(new RegularToppings("green olives"));
        addRegularTopping(new RegularToppings("black olives"));
        addRegularTopping(new RegularToppings("giardiniera"));
        addRegularTopping(new RegularToppings("avocado"));


        // sauce
        addSauce("hot honey mayo"); // signature sauce

        }
    }
