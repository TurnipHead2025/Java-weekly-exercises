//Sheri Evangelene
//Week 4 exercises-Java
//June 11-18, 2026
 

public class CountedItem extends PurchaseItem{
    private int quantity;

//constructor
    public CountedItem(String name, double unitPrice, int quantity){
        super(name, unitPrice);
        this.quantity =quantity;
    }   

//method
    public double getPrice(){
        return super.getPrice() * this.quantity;
    }

//toString
    public String toString(){
        String formattedPrice = String.format("%.2f", this.getPrice());
        return(super.toString () + " " + this.quantity + " units " + formattedPrice + " SR");
    }    
}
