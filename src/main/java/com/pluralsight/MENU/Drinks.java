package com.pluralsight.MENU;

public class Drinks {

//                +------------------+
//                |      Drink       |
//                +------------------+
//                | - size           |
//                | - flavor         |
//                +------------------+
//                | +getPrice()      |
//                +------------------+
//
private String size;    // "small", "medium", "large"
    private String flavor;  // e.g., "Coke", "Sprite", etc.

    public Drinks(String size, String flavor) {
        this.size = size.toLowerCase();
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public String getFlavor() {
        return flavor;
    }

    public double getPrice() {
        return switch (size) {
            case "small" -> 2.00;
            case "medium" -> 2.50;
            case "large" -> 3.00;
            default -> 0.0;
        };
    }

    public String getDescription() {
        return size.substring(0, 1).toUpperCase() + size.substring(1) +
                " " + flavor + " - $" + String.format("%.2f", getPrice());
    }
}
