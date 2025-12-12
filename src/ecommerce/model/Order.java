package ecommerce.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Repräsentiert eine Bestellung eines Kunden.
 * Eine Bestellung entsteht aus dem Warenkorb beim Checkout.
 */
public class Order {

    private List<OrderItem> items = new ArrayList<>();
    private LocalDateTime createdAt = LocalDateTime.now();

    /**
     * Erstellt eine Bestellung aus einem Warenkorb.
     *
     * @param cart der Warenkorb zum Zeitpunkt des Checkouts
     */
    public Order(Cart cart) {
        for (CartItem item : cart.getItems()) {
            items.add(new OrderItem(
                    item.getProduct(),
                    item.getQuantity()
            ));
        }
    }

    /**
     * Berechnet den Gesamtpreis der Bestellung.
     *
     * @return Gesamtbetrag der Bestellung
     */
    public double getTotal() {
        double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.getTotal();
        }
        return sum;
    }

    /**
     * Gibt den Erstellungszeitpunkt zurück.
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Gibt alle Bestellpositionen zurück.
     */
    public List<OrderItem> getItems() {
        return items;
    }
}
