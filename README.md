#    ☆ THE DOLL'S DELI ☆

The Doll’s Deli is a console-based Java program that brings the experience of ordering at a deli to life. 

Users can build their own sandwiches from scratch, pick from a selection of signature creations, and complete their meals with drinks and chips. Once the order is finalized, the system generates a detailed receipt and saves it to a file.

Built using core object-oriented programming concepts, the project is organized around clear, modular class structures. It uses inheritance, encapsulation, and polymorphism to represent real deli items and their behaviors, making the codebase both flexible and easy to extend.


## ☆ FEATURES
This project simulates a complete deli ordering experience in a console-based Java application. It includes a full range of features designed around modular classes using object-oriented programming principles.


- The application starts with Main.java, which launches the program and passes control to the UserInterface class. The "UserInterface" handles all user interaction, including displaying menus, collecting input, and managing the order process.
- Users can build their own sandwiches using the Sandwich class, which stores the sandwich’s size, bread type, toasted status, sauces, and toppings. Users can add free regular toppings as well as paid premium toppings that affect the price. Premium toppings are represented by the "PremiumToppings" class, which includes pricing logic based on type (meat or cheese), size, and whether the topping is marked as "extra." Regular toppings, such as lettuce, tomatoes, or cucumbers, are managed with the "RegularToppings" class and do not affect price.
- In addition to custom sandwiches, users can choose from pre-defined signature sandwiches. These are represented as separate classes (BLT, PhillyCheeseSteak, and TheDollSandwich) that extend the base Sandwich class and include preselected ingredients.
- Users can also add drinks and chips to their order. The "Drinks" class allows the user to enter a drink size and flavor, with pricing based on size. The "Chips" class represents a chip selection with a flat rate per item.
- The "Order" class stores all sandwiches, drinks, and chips selected by the user. It can calculate the total price of the order and generate a description of the entire purchase. 
- Once the user checks out, the "ReceiptWriter" class is used to save a receipt to a file. This class automatically creates a /receipts folder (if it doesn’t exist) and saves a formatted, timestamped text file containing the order summary, item breakdown, total price, and a thank-you message.

Each of these features is implemented with clear separation of concerns, and the classes are designed to work together cleanly using encapsulation, inheritance, and composition.




## ☆ SAMPLE CODE


![Screenshot 2025-05-29 224555](https://github.com/user-attachments/assets/67213dde-55ab-4543-8d9c-c2e6c7bfd6bf)
![Screenshot 2025-05-29 235825](https://github.com/user-attachments/assets/53e930f8-2242-422a-bd2b-ec2c85371c36)


## ☆ RECEIPT PREVIEW
![Screenshot 2025-05-29 221949](https://github.com/user-attachments/assets/6f80fe9f-14b8-4f69-9042-be0b6e4125d1)

## ☆ HOW THE PROGRAM RUNS
The Doll’s Deli application runs from the terminal and is designed using object-oriented programming principles. Here is a step-by-step explanation of how the program flows and how the classes interact with and implement each part of the system:

**1. Program Start**

- The application begins in Main.java. This class displays a welcome message and gives the user an option to start or exit.

- If the user starts an order, the program creates an instance of the UserInterface class, which handles all the user interaction and order processing.

**2. User Interaction**

- UserInterface.java is responsible for showing menus, collecting user input, and managing the order-building experience.

- The user can:

      - Build a custom sandwich

      - Choose a signature sandwich

      - Add a drink

      - Add chips

      - Checkout or cancel the order

**3. Order Management**

- When items are added, they are stored in an instance of the "Order" class.

- Order.java maintains separate lists for sandwiches, drinks, and chips.

- It implements methods to:

      - Add items

      - Calculate the total order price

      - Return a detailed description of the order

**4. Sandwich Creation**

- All sandwiches are based on the Sandwich class, which implements:

      - Size (4", 8", or 12")

      - Bread type

      - Toasted option

      - Lists of sauces, regular toppings, and premium toppings

-  Users can add:

       - Regular toppings using the "RegularToppings" class (free items)

       - Premium toppings using the "PremiumToppings class" (paid add-ons with price logic)

- Each topping is stored in a list within the Sandwich object.

**5.Signature Sandwiches**

- Signature sandwiches like BLT, PhillyCheeseSteak, and TheDollSandwich are implemented as separate classes that extend the Sandwich class.

- These classes automatically pre-load specific ingredients when instantiated, giving users a quick-order option without building a custom sandwich.

**6. Sides and Drinks**

- The "Drinks" class allows the user to specify drink size and flavor. It includes a method to calculate the price based on size.

- The "Chips" class allows the user to enter the chip type, with a flat price of $1.50.

**7. Checkout and Receipt**

- When the user is ready to check out, the "UserInterface" prints a summary of the order using Order.getDescription().

- If confirmed, the ReceiptWriter class is called to generate a receipt.

- ReceiptWriter.java creates a /receipts folder (if it doesn't already exist) and writes a .txt file that includes:

      - The itemized order

      - Pricing for each item

      - The total price

      - A date/time stamp

      - A thank-you message

## ☆ SUMMARY OF CLASS RESPONSIBILITES
- **Main.java** – Starts the app and calls UserInterface

- **UserInterface.java** – Manages all user input/output and controls the order process

- **Order.java** – Stores sandwiches, drinks, chips; calculates total and provides order summary

- **Sandwich.java** – Base class for all sandwiches; tracks bread, size, toppings, sauces

- **BLT / PhillyCheeseSteak / TheDollSandwich** – Extend Sandwich with predefined ingredients

- **RegularToppings.java** – Represents free toppings selected by the user

- **PremiumToppings.java** – Represents paid add-ons with dynamic pricing

- **Drinks.java** – Stores drink size/flavor and calculates drink price

- **Chips.java** – Stores chip type with fixed pricing

- **ReceiptWriter.java** – Saves the order to a text file as a receipt

## ☆ PROJECT STRUCTURE

![Screenshot 2025-05-29 235621](https://github.com/user-attachments/assets/fd6c76a1-16cb-4f43-9999-900ccf65ba2c)

