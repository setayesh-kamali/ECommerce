package ecommerce.service;

import ecommerce.model.Cart;
import ecommerce.model.CartItem;
import ecommerce.model.Customer;
import ecommerce.model.Order;

/**
 * Enthält die Checkout-Logik (Bestellung erstellen, Bestand prüfen, bezahlen).
 */
public class CheckoutService {

    /**
     * Führt den Checkout aus:
     * - berechnet Gesamtbetrag
     * - reduziert den Lagerbestand
     * - zieht Geld vom Kunden ab
     * - erstellt eine Order und leert den Warenkorb
     *
     * @param customer der Kunde
     * @return die erstellte Bestellung
     */
    public Order checkout(Customer customer) {
        Cart cart = customer.getCart();

        double total = cart.getTotal();

        for (CartItem item : cart.getItems()) {
            item.getProduct().reduceStock(item.getQuantity());
        }

        customer.pay(total);

        Order order = new Order(cart);
        cart.clear();

        return order;
    }
}
