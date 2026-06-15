//Sheri Evangelene
//Week 4 exercises-Java
//June 11-18, 2026


public class WeighedItem extends PurchaseItem{
    private double weight;

//constructor
    public WeighedItem(String name, double unitPrice, double weight){
        super(name, unitPrice);
        this.weight = weight;
    }  
    
//methods
    public double getPrice(){
        return super.getPrice() * weight;
    }  
    
//toString. The this' are not necessary but visual clues. this.getPrice() calls the getPrice() from this child not parent (which would be super.getPrice())
    public String toString(){
        String formattedPrice = String.format("%.2f", this.getPrice());
        return(super.toString () + " " + this.weight + "Kg " + formattedPrice + " SR");
    }    
}
