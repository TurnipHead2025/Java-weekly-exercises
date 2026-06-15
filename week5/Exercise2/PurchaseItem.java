//Sheri Evangelene
//Week 4 exercises-Java
//June 11-18, 2026

public class PurchaseItem {
    private String name;
    private double unitPrice;

//constructors
    public PurchaseItem(String name, double unitPrice){
        this.name=name;
        this.unitPrice=unitPrice;
    }
    
    //auto calls constructor 1 because of Argument Matching. this() triggers the constructor
    public PurchaseItem(){
        this("no item", 0.0);
    } 

//methods
    public double getPrice(){
        return this.unitPrice;
    }

//toString
    public String toString(){
        return (name + " @ " + unitPrice);
    }    
}
