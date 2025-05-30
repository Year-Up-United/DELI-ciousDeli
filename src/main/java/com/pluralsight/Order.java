package com.pluralsight;
// import data from classes
import com.pluralsight.MENU.Sandwich;
import com.pluralsight.MENU.Drinks;
import com.pluralsight.MENU.Chips;

//imports arraylist/list of the objects
import java.util.ArrayList;
import java.util.List;

public class Order {

//                |      Order       |
//                +------------------+
//                | - sandwiches     |
//                | - drinks         |
//                | - chips          |
//                +------------------+
//                | +addSandwich()   |
//                | +addDrink()      |
//                | +addChip()       |
//                | +getTotal()      |
//                | +printReceipt()  |
//                +------------------+

    // arraylist of sandwiches, drinks and chips
    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Drinks> drinks = new ArrayList<>();
    private List<Chips> chips = new ArrayList<>();

    // add items
    public void addSandwich(Sandwich sandwich){
        sandwiches.add(sandwich);
    }

    // add drinks
    public void addDrinks(Drinks drink){
        drinks.add(drink);
    }

    // add chips
    public void addChips(Chips chip){
        chips.add(chip);
    }

    // get total price
    public double getTotalPrice(){
        double total = 0.0;

        for (Sandwich s: sandwiches){
            total += s.getTotalPrice();
        }
        for (Drinks d: drinks){
            total += d.getPrice();
        }
        for (Chips c: chips){
            total += c.getPrice();
        }
        return total;
    }

    // order summary
    public String getDescription(){
        String summary = "";

    // sandwiches
    summary += "\n☆ SANDWICHES ☆\n";
    for (Sandwich s: sandwiches){
        summary += s.getDescription() + "\n\n";
    }

    // drinks
    summary += "\n☆ DRINKS ☆\n";
    for (Drinks d: drinks){
        summary += " - " + d.getDescription() + "\n\n";
    }

    // chips
    summary += "\n☆ CHIPS ☆\n";
    for (Chips c : chips){
        summary += " - " + c.getDescription() + "\n\n";
    }

    // total order
    summary += "\n☆ TOTAL ORDER PRICE ☆\n" + String.format("%.2f", getTotalPrice());
    return summary;
    }

    // getters (could be optional)
    public List<Sandwich> getSandwiches(){
        return sandwiches;
    }
    public List<Drinks> getDrinks(){
        return drinks;
    }
    public List<Chips> getChips(){
        return chips;
    }
}
