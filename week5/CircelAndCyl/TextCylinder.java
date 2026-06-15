//Sheri Evangelene
//Week 4 exercises-Java
//June 11-18, 2026


public class TextCylinder {
    public static void main(String args[]){
        Cylinder cy1= new Cylinder();
        Cylinder cy2 = new Cylinder(5.0,2.0);

        System.out.println("Radius is " + cy1.getRadius());
        System.out.println("Height is " + cy1.getHeight());
        System.out.println("Color is " + cy1.getColor());
        System.out.println("Base area is " + cy1.getArea());
        System.out.println("Volume is " + cy1.getVolume());
        System.out.println();

        System.out.println("Radius is " + cy2.getRadius());
        System.out.println("Height is " + cy2.getHeight());
        System.out.println("Color is " + cy2.getColor());
        System.out.println("Base area is " + cy2.getArea());
        System.out.println("Volume is " + cy2.getVolume());
        System.out.println();


    }
}
