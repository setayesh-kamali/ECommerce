package ecommerce.model;



/**
 * Repräsentiert einen einzelnen Eintrag im Warenkorb.
 * Ein CartItem besteht immer aus einem Produkt und der Menge,
 * die der Kunde davon haben möchte.
 */
public class CartItem {

    private Product product;
    private int quantity;

    /**
     * Erstellt einen neuen Warenkorb-Eintrag.
     *
     * @param product  das Produkt, das in den Warenkorb gelegt wird
     * @param quantity die gewünschte Anzahl
     */
    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    /**
     * Gibt das Produkt zurück.
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Gibt die Menge zurück.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Ändert die Menge, falls später mehr oder weniger gewünscht ist.
     *
     * @param quantity neue gewünschte Anzahl
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Berechnet den Gesamtpreis für dieses CartItem.
     * (Preis des Produkts * Anzahl)
     *
     * @return Gesamtbetrag für dieses Produkt im Warenkorb
     */
    public double getLineTotal() {
        return product.getPrice() * quantity;
    }

    /**
     * Gibt eine gut lesbare Textdarstellung zurück,
     * nützlich fürs Debuggen.
     */
    @Override
    public String toString() {
        return quantity + " x " + product.getName() +
                " = " + getLineTotal() + " €";
    }
}
