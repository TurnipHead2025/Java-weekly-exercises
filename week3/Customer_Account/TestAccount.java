//Sheri Evangelene
//Week 3 exercises-Java
//May 18-24, 2026

public class TestAccount {
    public static void main(String[] args){
        Customer c1= new Customer(42, "Pixel", 't');
        Account acc1= new Account(13, c1, 40000.00);


        System.out.println(acc1.getID());
        System.out.println(acc1.getCustomer());
        System.out.println(acc1.getBalance());
        System.out.println(acc1.getCustomerName());

        acc1.setBalance(50000.12);
        System.out.println(acc1);

        acc1.deposit(400);
        System.out.println(acc1);

        acc1.withdraw(400);
        System.out.println(acc1);
}
}
