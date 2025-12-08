package ecommerce.model;

public class Customer {
    private String name;
    private double balance;

    public Customer(String name,double balance){

        this.name= name;
        this.balance=balance;
    }


    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    @Override
    public String toString(){
        return "Customer{name='" + name + '\'' +
                ", balance=" + balance +
                '}';}

}
