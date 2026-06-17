//Sheri Evangelene
//Week 4 exercises-Java
//June 11-18, 2026

public class Dog extends Mammal {
    
//constructor
    public Dog(String name){
        super(name);
    }  
    
//Methods
    public void greets(){
        System.out.println("Woof");
    }  
    
    public void greets(Dog another){
        System.out.println("Woooof");
    }

//toString
    public String toString(){
          return("Dog[" + super.toString() + "]" );
    }    
}



