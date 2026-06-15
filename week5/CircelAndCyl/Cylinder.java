//Sheri Evangelene
//Week 4 exercises-Java
//June 11-18, 2026

public class Cylinder extends Circle {
    private double height = 1.0; //field

//constructors
    public Cylinder(){
    }

    //super calls the parent constructor
    public Cylinder(double radius){
        super(radius);
    }

    // super must be the first line
    public Cylinder(double height,double radius ){
        super(radius);
        this.height=height;        
    }

    //Can only call super once. Use Circle constructor that takes both params
    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height =height;
    }

//methods
    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    // could use just getArea() since no overridding
    public double getVolume(){
        return super.getArea() * this.height;
    }

//toString
    // Can call the parent toString with super. Don't need Circle.toString
    public String toString(){
        return (super.toString() + "The height is: " + height);
    }    
}
