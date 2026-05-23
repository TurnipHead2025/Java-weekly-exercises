//Sheri Evangelene
//Week 3 exercises-Java
//May 18-24, 2026

public class Customer {
    private int id;
    private String name;
    private int discount;


//constructors
    public Customer(int id, String name, int discount){
        this.id = id;
        this.name = name;
        this.discount = discount;
    } 
    
//getters
    public int getID (){
        return id;
    }   

    public String getName(){
        return this.name;
    }
    
    public int getDiscount(){
        return this.discount;
    }

//setters
    public void setDiscount(int discount){
        this.discount = discount;
    }  
    
//toString
    public String toString(){
        return  name + "(" + id + ")";
    }    
}
