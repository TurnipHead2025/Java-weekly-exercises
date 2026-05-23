//Sheri Evangelene
//Week 3 exercises-Java
//May 18-24, 2026

public class TestInvoice {
    public static void main(String args[]){
        Customer c1 = new Customer(1, "Pixel", 5);
        Invoice inv1= new Invoice(45, c1, 10.0);


        System.out.println(inv1.getID());
        System.out.println(inv1.getCustomer());
        
        inv1.setCustomer(new Customer(2,"Archie", 5));
        System.out.println(inv1.getCustomer());

        inv1.setAmount(8);
        System.out.println(inv1.getAmount());
        
        System.out.println(inv1.getAmountAfterDiscount());
    }
}
