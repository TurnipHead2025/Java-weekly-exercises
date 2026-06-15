
public class DemoPurchaseItems {
    public static void main(String[] args) {

        WeighedItem bananas = new WeighedItem("Bananas", 3.00, 1.73);
        CountedItem pens =new CountedItem("Pens", .89, 6);
        
         System.out.println();
        System.out.println("--- Customer Receipt ---\n");
        System.out.println(bananas);
        System.out.println(pens);
        System.out.println();        
        System.out.println("------------------------");

    }
}
