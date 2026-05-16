

public class TestRectangle {
    public static void main(String args[]){   //args is an array of strings 

       Rectangle r1 = new Rectangle (2.0f, 3.0f);
       Rectangle r2 = new Rectangle(5.0f, 3.0f);


       System.out.println("R1 Area: " + r1.getArea());
       System.out.println("R1 Perimeter: " + r1.getPerimeter());

       System.out.println("R2 Area: " + r2.getArea());
       System.out.println("R2 Perimeter: " + r2.getPerimeter());
    }
}
