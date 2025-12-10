package ecommerce;
import ecommerce.model.Customer;
import ecommerce.model.Product;
import ecommerce.model.CartItem;


public class Main {
    public static void main(String[] args) {

        Product laptop = new Product("Laptop", 899.99, 5);
        Product mouse  = new Product("Mouse", 19.99, 20);

        Customer customer = new Customer("Setayesh", 1000.00);

        System.out.println("Initial state:");
        System.out.println(laptop);
        System.out.println(mouse);
        System.out.println(customer);
        System.out.println();


        customer.buy(laptop, 1);
        customer.buy(mouse, 2);

        System.out.println();
        System.out.println("After purchases:");
        System.out.println(laptop);
        System.out.println(mouse);
        System.out.println("Remaining balance: " + customer.getBalance() + " €");
        System.out.println();
        System.out.println("CartItem Test:");
        CartItem item = new CartItem(mouse, 3);
        System.out.println(item);
        System.out.println("Total for this item: " + item.getLineTotal() + " €");

    }
}
