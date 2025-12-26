package ecommerce.exception;

public class InvalidQuantityException extends RuntimeException{
    /**
     * Erstellt eine Exception mit Standard-Nachricht.
     */

        public InvalidQuantityException() {
            //RuntimeException e = new RuntimeException("Die Menge muss größer als 0 sein");
            super("Die Menge muss größer als 0 sein.");
    }
}
