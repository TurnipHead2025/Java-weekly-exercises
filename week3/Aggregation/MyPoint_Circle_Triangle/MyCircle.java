
//Sheri Evangelene
//Week 3 exercises-Java
//May 18-24, 2026

public class MyCircle {
    private MyPoint center = new MyPoint(0,0);  //a circle "has a" center point
    private int radius= 1;

//constructors
    public MyCircle(){        
    } 
    
    public MyCircle(int x, int y, int radius){  //This constructor uses MyPoint to hold the values of x,y in center. User passes in raw numbers
        this.center = new MyPoint(x,y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius){  //This constructor uses a MyPoint obj as the center. user passes in a MyPoint obj.
        this.center = center;
        this.radius = radius;
    }

//getters
    public int getRadius(){
        return this.radius;
    }

    public MyPoint getCenter(){
        return this.center;
    }

    public int getCenterX(){
        return center.getX();
    }

    public int getCenterY(){
        return center.getY();
    }

    public int[] getCenterXY(){
        return new int[]{center.getX(), center.getY()};
    }

//setters
    public void setRadius(int radius){
        this.radius = radius;
    } 

    public void setCenter(MyPoint center){
        this.center= center;
    }

    public void setCenterX(int x){
       center.setX(x);
    }

    public void setCenterY(int y){
        center.setY(y);
    }

    public void setCenterXY(int x, int y){
        center.setXY(x,y);
    }

//to String
    public String toString(){
        return "MyCircle[radius=" + this.radius + ", center=" + center.toString() + "]";
    }   
    
//Methods
    public double getArea(){
        return Math.PI *this.radius * this.radius;
    }

    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }

    public double distance(MyCircle another){
        return this.center.distance(another.center);
    }






}
