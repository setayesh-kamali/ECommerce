package ecommerce;

import ecommerce.model.Customer;
import ecommerce.model.Product;
import ecommerce.model.Order;

/**
 * Einstiegspunkt zum Testen des E-Commerce-Systems.
 */
public class Main {

    public static void main(String[] args) {

        Product laptop = new Product("Laptop", 899.99, 5);
        Product mouse = new Product("Mouse", 19.99, 20);

        Customer customer = new Customer("Setayesh", 1000.0);

        customer.addToCart(laptop, 1);
        customer.addToCart(mouse, 2);

        Order order = customer.checkout();

        if (order != null) {
            System.out.println("Bestellung um: " + order.getCreatedAt());
            System.out.println("Gesamtpreis: " + order.getTotal() + " €");
        }
    }
}
