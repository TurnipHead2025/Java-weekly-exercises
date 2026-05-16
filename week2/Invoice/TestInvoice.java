

public class TestInvoice {
     public static void main(String args[]){

        Invoice invoice1 = new Invoice("k82j","frog house", 2, 12.89);
        Invoice invoice2 = new Invoice("f86j","frog food", 1, 18.0);
        Invoice invoice3 = new Invoice("p82j","frog pool", 1, 46.99);
        Invoice invoice4 = new Invoice("l89j","lilly pad", 3, 6.0);
        Invoice invoice5 = new Invoice("o66y","heat lamp", 2, 64.25);
     

// toString is called automatically
     System.out.println(invoice1);
     System.out.println(invoice2);
     System.out.println(invoice3);
     System.out.println(invoice4);
     System.out.println(invoice5);

// Static methods belong to the class. So you call the class
     System.out.println("total invoices= " + Invoice.getInvoiceCount());
}
}
