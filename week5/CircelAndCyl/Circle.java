//Sheri Evangelene
//Week 4 exercises-Java
//June 11-18, 2026


public class Circle {
    private double radius = 1.0;
    private String color = "red"; //fields

  //constructors
    public Circle(){
  }

    public Circle (double radius){
    this.radius = radius;
  }  

    public Circle(double radius, String color){
    this.radius = radius;
    this.color =color;
  }

 //methods
    public double getRadius(){
    return this.radius;
 } 
    public String getColor(){
        return this.color;
    }

    public void setRadius(double radius){
        this.radius =radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        return (Math.PI * this.radius * this.radius);
    }

//toString
    public String toString(){
        return("the radius is: " + radius + " The color is: " + color);
    }    
}
