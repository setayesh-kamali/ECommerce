package ecommerce.model;

public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public boolean isAvailable() {
        return stock > 0;
    }

    public boolean reduceStock(int quantity) {
        if (quantity <= 0) {
            return false;
        }

        if (stock >= quantity) {
            stock -= quantity;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
