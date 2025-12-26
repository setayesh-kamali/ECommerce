package ecommerce.model;

import ecommerce.exception.InsufficientBalanceException;
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
     * Zieht Geld vom Guthaben ab.
     *
     * @param amount Betrag, der bezahlt werden soll
     * @throws InsufficientBalanceException wenn Guthaben nicht reicht
     */
    public void pay(double amount) {
        if (balance < amount) {
            throw new InsufficientBalanceException(
                    "Guthaben reicht nicht. Verfügbar: " + balance + " €, benötigt: " + amount + " €"
            );
        }
        balance -= amount;
    }
    /**
     * Gibt den aktuellen Warenkorb des Kunden zurück.
     *
     * @return der Warenkorb des Kunden
     */
    public Cart getCart() {
        return cart;
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
