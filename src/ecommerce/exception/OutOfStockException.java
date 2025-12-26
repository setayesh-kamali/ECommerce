package ecommerce.exception;

/**
 * Wird geworfen, wenn nicht genügend Lagerbestand vorhanden ist.
 */
public class OutOfStockException extends RuntimeException {

    /**
     * Erstellt eine Exception mit einer konkreten Nachricht.
     *
     * @param message Erklärung, warum der Bestand nicht reicht
     */
    public OutOfStockException(String message) {
        super(message);
    }
}
