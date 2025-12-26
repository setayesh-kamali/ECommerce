package ecommerce.exception;

/**
 * Wird geworfen, wenn das Guthaben des Kunden nicht ausreicht.
 */
public class InsufficientBalanceException extends RuntimeException {

    /**
     * Erstellt eine Exception mit einer konkreten Nachricht.
     *
     * @param message Erklärung, warum das Guthaben nicht reicht
     */
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
