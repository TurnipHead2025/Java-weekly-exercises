//Sheri Evangelene
//Week 4 exercises-Java
//June 11-18, 2026

public class Cat extends Mammal {

//constructor. name gets passed up to grandparent
    public Cat(String name){
        super(name);
    }  

//method
    public void greets(){
        System.out.println("Meow");
    }    

//toString
    public String toString(){
        return("Cat[" + super.toString() + "]" );
    }
    
    
}
