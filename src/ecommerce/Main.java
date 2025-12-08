package ecommerce;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 899.99, 5);
        Product mouse = new Product("Mouse", 19.99, 20);

        Customer customer = new Customer("Setayesh", 1000.00);

        customer.buy(laptop, 1);
        customer.buy(mouse, 2);

        System.out.println("Remaining balance: " + customer.getBalance() + " €");
    }
}
