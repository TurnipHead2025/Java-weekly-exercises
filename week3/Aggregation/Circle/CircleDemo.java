
//Sheri Evangelene
//Week 3 exercises-Java
//May 18-24, 2026

public class CircleDemo {
     public static void main(String args[]){

        Circle c1= new Circle();
        Circle c2= new Circle("blue", 3.0);

        System.out.println(c1.getArea());
        System.out.println(c2.getArea());

// compliation failed because PI is final        
        //Circle.PI =22/7;
        
     }
    
}
