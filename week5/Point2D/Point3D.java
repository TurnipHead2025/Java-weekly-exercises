//Sheri Evangelene
//Week 4 exercises-Java
//June 11-18, 2026

public class Point3D extends Point2D {
    private int z = 0;

//constructor    
    public Point3D(){
        super();    
    }
    
    public Point3D(int x, int y, int z){
        super(x,y);
        this.z=z;
    }

//methods 

    public int getZ(){
        return this.z;
    }

    public void setZ(int z){
        this.z=z;
    }

//toString. Because x and y were declared as private need to use the getters
    public String toString(){
       return"(" + getX() + "," + getY() + "," + z + ")";
    }    
}