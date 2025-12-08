package ecommerce;
import ecommerce.model.Customer;
import ecommerce.model.Product;

public class Main {
    public static void main(String[] args) {



            Product laptop = new Product("Laptop", 899.99, 5);
            Product mouse  = new Product("Mouse", 19.99, 20);

            Customer customer = new Customer("Setayesh", 1000.00);

            System.out.println(laptop);
            System.out.println(mouse);
            System.out.println(customer.getName() + " has balance: " + customer.getBalance());

    }
}
