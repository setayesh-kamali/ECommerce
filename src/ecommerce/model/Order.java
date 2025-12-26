package ecommerce.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Repräsentiert eine Bestellung.
 * Eine Order entsteht beim Checkout aus einem Warenkorb
 * und enthält eine Liste von OrderItems.
 */
public class Order {

    private List<OrderItem> items = new ArrayList<>();
    private LocalDateTime createdAt;

    /**
     * Erstellt eine neue Bestellung aus einem Warenkorb.
     *
     * @param cart der Warenkorb zum Zeitpunkt des Checkouts
     */
    public Order(Cart cart) {
        this.createdAt = LocalDateTime.now();

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
        double total = 0;

        for (OrderItem item : items) {
            total += item.getTotal();
        }

        return total;
    }

    /**
     * Gibt alle Bestellpositionen zurück.
     */
    public List<OrderItem> getItems() {
        return items;
    }

    /**
     * Gibt das Erstellungsdatum der Bestellung zurück.
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
