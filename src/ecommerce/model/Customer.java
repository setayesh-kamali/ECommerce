package ecommerce.model;

/**
 * Repräsentiert einen Kunden im Shop.
 * Ein Kunde hat ein Guthaben und einen eigenen Warenkorb.
 */
public class Customer {

    private String name;
    private double balance;
    private Cart cart = new Cart();

    /**
     * Erstellt einen neuen Kunden.
     *
     * @param name    Name des Kunden
     * @param balance verfügbares Guthaben
     */
    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    /**
     * Fügt ein Produkt zum Warenkorb hinzu.
     *
     * @param product  Produkt, das hinzugefügt wird
     * @param quantity gewünschte Anzahl
     */
    public void addToCart(Product product, int quantity) {
        cart.addItem(product, quantity);
    }

    /**
     * Führt den Checkout durch.
     * Prüft Guthaben, reduziert Lagerbestand und leert den Warenkorb.
     *
     * @return
     */
    public Order checkout() {
        double total = cart.getTotal();

        if (total > balance) {
            System.out.println("Nicht genug Guthaben für den Einkauf.");
            return null;
        }

        for (CartItem item : cart.getItems()) {
            item.getProduct().reduceStock(item.getQuantity());
        }

        balance -= total;
        cart.clear();

        System.out.println("Checkout erfolgreich. Neuer Kontostand: " + balance + " €");
        return null;
    }

    /**
     * Gibt den Namen des Kunden zurück.
     */
    public String getName() {
        return name;
    }

    /**
     * Gibt das aktuelle Guthaben zurück.
     */
    public double getBalance() {
        return balance;
    }
}
