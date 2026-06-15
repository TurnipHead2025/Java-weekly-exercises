//Sheri Evangelene
//Week 4 exercises-Java
//June 11-18, 2026

public class Mammal extends Animal{
    
//constructor
    public Mammal(String name){
        super(name);
    }

//toString
    public String toString(){
        return ("Mammal[" + super.toString() + "]");
    }
}
