package ecommerce.model;

/**
 * Repräsentiert einen Kunden im E-Commerce-System.
 * Ein Kunde hat einen Namen und ein verfügbares Guthaben (Balance).
 */
public class Customer {

    private String name;
    private double balance;

    /**
     * Erstellt einen neuen Kunden mit Name und Startguthaben.
     *
     * @param name    der Name des Kunden
     * @param balance das verfügbare Guthaben in Euro
     */
    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    /**
     * Gibt den Namen des Kunden zurück.
     *
     * @return der Name des Kunden
     */
    public String getName() {
        return name;
    }

    /**
     * Gibt das aktuelle Guthaben des Kunden zurück.
     *
     * @return das verfügbare Guthaben in Euro
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Prüft, ob der Kunde sich einen bestimmten Betrag leisten kann.
     *
     * @param amount der zu prüfende Betrag in Euro
     * @return {@code true}, wenn das Guthaben ausreicht, sonst {@code false}
     */
    public boolean canAfford(double amount) {
        return balance >= amount;
    }

    /**
     * Versucht, ein Produkt in einer bestimmten Menge zu kaufen.
     * Es wird geprüft:
     * <ul>
     *     <li>ob die Menge gültig ist,</li>
     *     <li>ob das Produkt verfügbar ist,</li>
     *     <li>ob das Guthaben des Kunden ausreicht,</li>
     *     <li>ob genügend Lagerbestand vorhanden ist.</li>
     * </ul>
     * Wenn der Kauf erfolgreich ist, wird der Lagerbestand reduziert
     * und das Guthaben des Kunden angepasst.
     *
     * @param product  das zu kaufende Produkt
     * @param quantity die gewünschte Menge
     * @return {@code true}, wenn der Kauf erfolgreich war, sonst {@code false}
     */
    public boolean buy(Product product, int quantity) {
        if (quantity <= 0) {
            System.out.println("Quantity must be positive.");
            return false;
        }

        if (!product.isAvailable()) {
            System.out.println("Product " + product.getName() + " is not available.");
            return false;
        }

        double totalPrice = product.getPrice() * quantity;

        if (!canAfford(totalPrice)) {
            System.out.println(name + " cannot afford " + quantity + " x " + product.getName());
            return false;
        }

        boolean stockReduced = product.reduceStock(quantity);
        if (!stockReduced) {
            System.out.println("Not enough stock for " + product.getName());
            return false;
        }

        balance -= totalPrice;
        System.out.println(name + " bought " + quantity + " x " + product.getName()
                + " for " + totalPrice + " €");
        return true;
    }

    /**
     * Gibt eine textuelle Darstellung des Kunden zurück,
     * inklusive Name und aktuellem Guthaben.
     *
     * @return eine String-Repräsentation des Kunden
     */
    @Override
    public String toString() {
        return "Customer{name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
