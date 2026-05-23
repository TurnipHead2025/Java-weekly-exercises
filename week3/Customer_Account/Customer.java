//Sheri Evangelene
//Week 3 exercises-Java
//May 18-24, 2026

public class Customer {
    private int id;
    private String name;
    private char gender;

//constructors
    public Customer(int id, String name, char gender){
        this. id = id;
        this.name = name;
        this.gender = gender;
         }

//getters
         public int getID(){
            return this.id;
         }

         public String getName(){
            return this.name;
         }
         public char getGender(){
            return this.gender;
         }

//toString
     public String toString(){
        return  name + "(" + id + ")";
    }    
   
}
