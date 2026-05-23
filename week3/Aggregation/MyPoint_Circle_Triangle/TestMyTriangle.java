
//Sheri Evangelene
//Week 3 exercises-Java
//May 18-24, 2026

public class TestMyTriangle {
    public static void main(String args[]){

        MyTriangle t1 = new MyTriangle(3,4,4,5,5,7);
        MyPoint p1 = new MyPoint(0,0);
        MyPoint p2 = new MyPoint(3,0);
        MyPoint p3 = new MyPoint(0,4);
        MyTriangle t2 = new MyTriangle(p1,p2,p3);

        System.out.println(t1);
        System.out.println(t1.getPerimeter());
        t1.printType();

        System.out.println(t2);
        System.out.println(t2.getPerimeter());
        t2.printType();
    }
}
