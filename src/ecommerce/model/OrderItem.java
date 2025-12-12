package ecommerce.model;

/**
 * Repräsentiert eine Position innerhalb einer Bestellung.
 * Ein OrderItem speichert das Produkt, die Menge und den Preis
 * zum Zeitpunkt der Bestellung.
 */
public class OrderItem {

    private Product product;
    private int quantity;
    private double priceAtPurchase;

    /**
     * Erstellt ein neues OrderItem.
     *
     * @param product  das bestellte Produkt
     * @param quantity die bestellte Menge
     */
    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.priceAtPurchase = product.getPrice();
    }

    /**
     * Berechnet den Gesamtpreis dieser Bestellposition.
     *
     * @return Gesamtpreis für dieses OrderItem
     */
    public double getTotal() {
        return priceAtPurchase * quantity;
    }

    /**
     * Gibt das Produkt zurück.
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Gibt die bestellte Menge zurück.
     */
    public int getQuantity() {
        return quantity;
    }
}
