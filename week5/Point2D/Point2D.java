//Sheri Evangelene
//Week 4 exercises-Java
//June 11-18, 2026

public class Point2D {
    private int x= 0;
    private int y = 0;

//constructors

    public Point2D(){
    }

    public Point2D(int x, int y){
        this.x=x;
        this.y=y;
    }

//methods
    public int getX(){
        return this.x;
    }  
    
    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }

//toString
    public String toString(){
        return"(" + x + "," + y + ")";
    }    
}
