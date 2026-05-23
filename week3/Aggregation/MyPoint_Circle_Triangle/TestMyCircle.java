
//Sheri Evangelene
//Week 3 exercises-Java
//May 18-24, 2026

public class TestMyCircle {
    
     public static void main(String args[]){

        MyCircle c1 =new MyCircle();
        MyCircle c2 =new MyCircle(3,4,5);

        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        System.out.println(c1.distance(c2));

     }


}
