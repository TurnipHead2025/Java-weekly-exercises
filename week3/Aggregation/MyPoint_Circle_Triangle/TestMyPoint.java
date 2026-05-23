
//Sheri Evangelene
//Week 3 exercises-Java
//May 18-24, 2026

public class TestMyPoint {
     public static void main(String args[]){

        MyPoint p1= new MyPoint(3,4);
        MyPoint p2 = new MyPoint(5,6);

        System.out.println(p1);
        System.out.println(p2);

        p1.setX(8);
        p1.setY(6);
        System.out.println(p1);

        p1.setXY(3,7);
        System.out.println(p1);

        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());

        System.out.println(p1.distance(6,7));
        System.out.println(p2.distance(6,7));

        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));

        System.out.println(p1.distance());
        System.out.println(p2.distance());
     }
}
