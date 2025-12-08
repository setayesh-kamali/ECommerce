package ecommerce;


public class Customer {

        private String name;
        private double balance;

        public Customer(String name, double balance) {
            this.name = name;
            this.balance = balance;
        }

        public String getName() {
            return name;
        }

        public double getBalance() {
            return balance;
        }

        public boolean buy(Product product, int quantity) {
            if (quantity <= 0) {
                System.out.println("Quantity must be positive.");
                return false;
            }

            if (!product.isAvailable()) {
                System.out.println(product.getName() + " is not available.");
                return false;
            }

            double totalPrice = product.getPrice() * quantity;

            if (totalPrice > balance) {
                System.out.println(name + " cannot afford " + quantity + " x " + product.getName());
                return false;
            }

            if (!product.reduceStock(quantity)) {
                System.out.println("Not enough stock for " + product.getName());
                return false;
            }

            balance -= totalPrice;
            System.out.println(name + " bought " + quantity + " x " + product.getName()
                    + " for " + totalPrice + " €");
            return true;
        }
}
