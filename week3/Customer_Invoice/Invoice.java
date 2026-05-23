//Sheri Evangelene
//Week 3 exercises-Java
//May 18-24, 2026

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;


// constructor
    public Invoice(int id, Customer customer, double amount){
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    } 

//getters
    public int getID(){
        return this.id;          
    }

    public Customer getCustomer(){
        return this.customer;
    }

    public double getAmount(){
        return this.amount;
    }

    public String getCustomerName(){
        return customer.getName();
    }

//setters
    public void setCustomer(Customer customer){
    this.customer = customer;
   }

    public void setAmount(double amount){
        this.amount= amount;
    }

// methods
    public double getAmountAfterDiscount(){
        return amount-(amount * customer.getDiscount()/ 100);
    }
}
