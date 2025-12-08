package ecommerce;

public class Product {
    private String name;
    private double price;
    private int stock; // wie viele Stück verfügbar

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

    public boolean reduceStock(int amount) {
        if (amount <= 0) return false;

        if (stock >= amount) {
            stock -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return name + " - " + price + " € (Stock: " + stock + ")";
    }
}
