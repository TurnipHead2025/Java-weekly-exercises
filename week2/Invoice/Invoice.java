

public class Invoice {
    private String id;    //instance var
    private String description;
    private int quantity;
    private double unitPrice;
    private static int invoiceCount= 0;  //static var. One copy for the class.

//constructor. Same name as class
    public Invoice(String id, String description, int quantity, double unitPrice){
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        invoiceCount++;     
 }
 
 // copy constructor. In Java you can use a class as a data type. This allows you to pass objs as parameters
    public Invoice(Invoice other){
        this.id = other.id;
        this.description = other.description;
        this.quantity = other.quantity;
        this.unitPrice = other.unitPrice;
        invoiceCount++;
    }

   
//methods

  
//getters have no parameters. They use what is stored
    public String getID(){
        return this.id;
}

    public String getDescription(){
        return this.description;
}
    public  int getQuantity(){
        return this.quantity;
}
    public double getUnitPrice(){
        return this.unitPrice;
    }

    public double getTotal(){
        return (this.unitPrice * this.quantity);
    }

    public static int getInvoiceCount(){
        return invoiceCount;
    }

    //setters take parameter. They set the value
    public void setQuantity (int quantity){
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
 
//text desciption of the obj. Called when obj is printed
    public String toString(){
    return "Invoice item[ id= " + id + ", desc= " + description + ", quantity= " + quantity + ", unitPrice= " + unitPrice + "]";
}



}
