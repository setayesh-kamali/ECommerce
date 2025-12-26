package ecommerce;

import ecommerce.model.Customer;
import ecommerce.model.Product;
import ecommerce.model.Order;
import ecommerce.service.CheckoutService;

/**
 * Einstiegspunkt zum Testen des E-Commerce-Systems.
 * Diese Klasse simuliert einen einfachen Kaufprozess.
 */
public class Main {

    public static void main(String[] args) {

        // Produkte anlegen
        Product laptop = new Product("Laptop", 899.99, 5);
        Product mouse = new Product("Mouse", 19.99, 20);

        // Kunde anlegen
        Customer customer = new Customer("Setayesh", 1000.00);

        // Produkte in den Warenkorb legen
        customer.addToCart(laptop, 1);
        customer.addToCart(mouse, 2);

        // Checkout durchführen
        CheckoutService checkoutService = new CheckoutService();
        Order order = checkoutService.checkout(customer);

        // Ergebnis anzeigen
        System.out.println("Bestellung erfolgreich!");
        System.out.println("Bestelldatum: " + order.getCreatedAt());
        System.out.println("Gesamtpreis: " + order.getTotal() + " €");
    }
}
