#    ☆ The Doll's Deli ☆

The Doll’s Deli is a console-based Java program that brings the experience of ordering at a deli to life. 

Users can build their own sandwiches from scratch, pick from a selection of signature creations, and complete their meals with drinks and chips. Once the order is finalized, the system generates a detailed receipt and saves it to a file.

Built using core object-oriented programming concepts, the project is organized around clear, modular class structures. It uses inheritance, encapsulation, and polymorphism to represent real deli items and their behaviors, making the codebase both flexible and easy to extend.


## FEATURES
This project simulates a complete deli ordering experience in a console-based Java application. It includes a full range of features designed around modular classes using object-oriented programming principles.


- The application starts with Main.java, which launches the program and passes control to the UserInterface class. The UserInterface handles all user interaction, including displaying menus, collecting input, and managing the order process.
- Users can build their own sandwiches using the Sandwich class, which stores the sandwich’s size, bread type, toasted status, sauces, and toppings. Users can add free regular toppings as well as paid premium toppings that affect the price. Premium toppings are represented by the "PremiumToppings" class, which includes pricing logic based on type (meat or cheese), size, and whether the topping is marked as "extra." Regular toppings, such as lettuce, tomatoes, or cucumbers, are managed with the "RegularToppings" class and do not affect price.
- In addition to custom sandwiches, users can choose from pre-defined signature sandwiches. These are represented as separate classes (BLT, PhillyCheeseSteak, and TheDollSandwich) that extend the base Sandwich class and include preselected ingredients.
- Users can also add drinks and chips to their order. The "Drinks" class allows the user to enter a drink size and flavor, with pricing based on size. The "Chips" class represents a chip selection with a flat rate per item.
- The "Order" class stores all sandwiches, drinks, and chips selected by the user. It can calculate the total price of the order and generate a description of the entire purchase. 
- Once the user checks out, the "ReceiptWriter" class is used to save a receipt to a file. This class automatically creates a /receipts folder (if it doesn’t exist) and saves a formatted, timestamped text file containing the order summary, item breakdown, total price, and a thank-you message.

Each of these features are implemented with clear separation of concerns, and the classes are designed to work together cleanly using encapsulation, inheritance, and composition.




## Usage/Examples


![Screenshot 2025-05-29 224555](https://github.com/user-attachments/assets/67213dde-55ab-4543-8d9c-c2e6c7bfd6bf)
![Screenshot 2025-05-29 221949](https://github.com/user-attachments/assets/6f80fe9f-14b8-4f69-9042-be0b6e4125d1)




