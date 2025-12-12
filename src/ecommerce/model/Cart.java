package ecommerce.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Repräsentiert den Warenkorb eines Kunden.
 * Der Warenkorb enthält mehrere CartItems und kann den Gesamtpreis berechnen.
 */
public class Cart {

    private List<CartItem> items = new ArrayList<>();

    /**
     * Fügt ein Produkt mit einer bestimmten Menge zum Warenkorb hinzu.
     *
     * @param product  das Produkt, das hinzugefügt werden soll
     * @param quantity die gewünschte Anzahl
     */
    public void addItem(Product product, int quantity) {
        items.add(new CartItem(product, quantity));
    }

    /**
     * Gibt alle Einträge im Warenkorb zurück.
     *
     * @return Liste der CartItems
     */
    public List<CartItem> getItems() {
        return items;
    }

    /**
     * Berechnet den Gesamtpreis des gesamten Warenkorbs.
     *
     * @return Gesamtbetrag aller CartItems
     */
    public double getTotal() {
        double sum = 0.0;
        for (CartItem item : items) {
            sum += item.getLineTotal();
        }
        return sum;
    }

    /**
     * Leert den Warenkorb vollständig.
     */
    public void clear() {
        items.clear();
    }
}
