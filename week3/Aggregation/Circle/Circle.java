package Circle;
//Sheri Evangelene
//Week 3 exercises-Java
//May 18-24, 2026

public class Circle {
    private String color = "red";
    private double radius = 1;
    private static final double PI = 3.14;
    
   
//Constructors
    public Circle(){
        this.color = "red";
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;    
    }

    public Circle(String color, double radius){
        this.color = color;
        this.radius = radius;
    }

//Getters 
    public double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public double getArea(){
        return PI * this.radius * this.radius;    
    }

//Setters    
    public void setRadius(double radius){       
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }    

    
//ToString
    public String toString(){
        return ("Circle Radius = " + this.radius + " has color = " + this.color);
    }
}


