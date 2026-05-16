

public class TestEmployee {
     public static void main(String args[]){   //args is an array of strings 

        Employee john = new Employee(1, "John", "Javasmith", 4500);
        Employee james = new Employee(1, "James", "Reactor", 5000);

        // calling the method in the print statement
        System.out.println("John's current annual salary: " + john.getAnnualSalary());
        System.out.println("James's current annual salary: " + james.getAnnualSalary());

        // call the getRaise method and input a value
        john.getRaise(20);
        james.getRaise(20);

        // call the method in the print statement
        System.out.println("John's new salary: " + john.getSalary());
        System.out.println("James's new salary: " + james.getSalary());

}
}
