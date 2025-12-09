package ecommerce.model;

/**
 * Diese Klasse beschreibt ein Produkt, das im Shop angeboten wird.
 * Ein Produkt hat einen Namen, einen Preis und eine bestimmte Menge im Lager.
 * Damit lässt sich z.B. prüfen, ob etwas verfügbar ist oder ob genug Stück da sind.
 */
public class Product {

    private String name;
    private double price;
    private int stock;

    /**
     * Erstellt ein neues Produkt mit Namen, Preis und Lagerbestand.
     *
     * @param name  wie das Produkt heißt
     * @param price was es kostet
     * @param stock wie viele Stück davon verfügbar sind
     */
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    /**
     * Gibt den Produktnamen zurück.
     */
    public String getName() {
        return name;
    }

    /**
     * Gibt den Preis zurück.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gibt zurück, wie viele Stück noch auf Lager sind.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Schaut einfach nach, ob noch mindestens ein Stück da ist.
     */
    public boolean isAvailable() {
        return stock > 0;
    }

    /**
     * Versucht, eine bestimmte Menge vom Lager abzuziehen.
     * Klappt nur, wenn genug Stück vorhanden sind.
     *
     * @param quantity Anzahl der Stücke, die verkauft werden sollen
     * @return true, wenn es funktioniert hat – sonst false
     */
    public boolean reduceStock(int quantity) {
        if (quantity <= 0) return false;

        if (stock >= quantity) {
            stock -= quantity;
            return true;
        }
        return false;
    }

    /**
     * Gibt das Produkt als Text aus – nützlich zum Debuggen oder Anzeigen im Terminal.
     */
    @Override
    public String toString() {
        return "Product{name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
