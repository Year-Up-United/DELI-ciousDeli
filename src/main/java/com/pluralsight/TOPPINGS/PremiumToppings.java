package com.pluralsight.TOPPINGS;

public class PremiumToppings {

    private String name;
    private String type;
    private boolean isExtra;

    public PremiumToppings(String name, String type, boolean isExtra){
        this.name = name;
        this.type = type;
        this.isExtra = isExtra;
    }

    public  String getName(){
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean isExtra(){
        return isExtra;
    }

    public double getPrice(String size){
        double price = 0.0;

        if (type.equalsIgnoreCase("meat")) {
            if (isExtra) {
                if (size.equals("4")) price = 0.50;
                else if (size.equals("8")) price = 1.00;
                else if (size.equals("12")) price = 1.50;
            } else {
                if (size.equals("4")) price = 1.00;
                else if (size.equals("8")) price = 2.00;
                else if (size.equals("12")) price = 3.00;
            }
        } else if (type.equalsIgnoreCase("cheese")) {
            if (isExtra) {
                if (size.equals("4")) price = 00.30;
                else if (size.equals("8")) price = 0.60;
                else if (size.equals("12")) price = 0.90;
            } else {
                if (size.equals("4")) price = 0.75;
                else if (size.equals("8")) price = 1.50;
                else if (size.equals("12")) price = 2.25;
            }

            }
        return price;

        }
    }
//                +------------------+
//                |     Topping      |
//                +------------------+
//                | - name           |
//                | - type           |
//                | - isExtra        |
//                +------------------+


