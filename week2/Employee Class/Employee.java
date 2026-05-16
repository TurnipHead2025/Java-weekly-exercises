// Sheri Evangelene
// May 11-16 2026
// week 2 exercises Java


public class Employee{
    private int id;            //instance variables
    private String firstName;
    private String lastName;
    private int salary;


    //constructor 
    public Employee(int id, String firstName, String lastName, int salary){
        this.id= id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    //methods
    //getters have no parameters. They use what is stored
    public int getId(){
        return this.id;
    }

    public String getFirstName(){
        return this.firstName;
    }

     public String getlastName(){
        return this.lastName;
    }

    public String getName(){
        return (this.firstName + " " + this.lastName);
    }

    public int getSalary(){
        return this.salary;
    }

    public int getAnnualSalary(){
        return (this.salary * 12);
    }

    // setters take parameters. They set new values
    public void setSalary(int salary){
        this.salary = salary;
    }  

    public int getRaise(int percent){
        this.salary = this.salary + (this.salary * percent/100);
        return this.salary;
    }

    //text desciption of the obj. Called when obj is printed
    public String toString(){
        return "Employee[id= " + id + ",name= " + firstName + " " + lastName + ",salary= " + salary + "]";
    }



}