# ECommerce (Java OOP)

This is a small Java project to practice object-oriented programming
using a simple e-commerce example.

## Technologies

- Java 21
- IntelliJ IDEA

## Project Structure

- `ecommerce.Product`  
  Represents a product with:
    - name
    - price
    - stock (how many items are available)

- `ecommerce.Customer`  
  Represents a customer with:
    - name
    - balance (available money)
    - a `buy(Product, int quantity)` method to purchase products

- `ecommerce.Main`  
  Entry point of the application.  
  Creates some products and a customer, then simulates a few purchases and
  prints the result.

## How to run

1. Open the project in IntelliJ IDEA
2. Make sure `Main` has a `public static void main(String[] args)` method
3. Right-click on `Main` → **Run 'Main.main()'**

---

*Dieses Projekt dient als Übungsprojekt für objektorientierte Programmierung in Java.*
