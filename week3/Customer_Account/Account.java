//Sheri Evangelene
//Week 3 exercises-Java
//May 18-24, 2026

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

//constructors
    public Account(int id, Customer customer, double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }    

    public Account(int id, Customer customer){
        this.id = id;
        this.customer = customer;
    }    

//getters
    public int getID(){
        return this.id;
    }   
    
    public Customer getCustomer(){
        return this.customer;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return customer.getName();
    }

//setters
    public void setBalance(double balance){
        this.balance = balance;
    }   
    
//ToString
    public String toString(){
        return customer.toString() + "balance= $" + String.format("%.2f", balance);
    }  
    
//Methods    
        public Account deposit(double amount) {
            this.balance += amount;
            return this;
        } 

        public Account withdraw(double amount){
            if (balance >= amount){
                this.balance -= amount;
        }else{
            System.out.println("Amount withdrwan exceeds the current balance!");
        }
        return this;
        }          
}
