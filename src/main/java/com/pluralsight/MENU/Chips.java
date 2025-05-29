package com.pluralsight.MENU;

public class Chips {

//                +------------------+
//                |      Chips        |
//                +------------------+
//                | - type           |
//                +------------------+
//                | +getPrice()      |
//                +------------------+
//

    private String type;

    public Chips(String type) {
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public double getPrice(){
        return 1.50;
    }

    public String getDescription(){
        return type + String.format(" - %.2f", getPrice());

    }

}
