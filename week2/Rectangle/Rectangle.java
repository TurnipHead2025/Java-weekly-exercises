// Sheri Evangelene
// May 11-16 2026
// week 2 exercises Java

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle (){  ///constructor
        this.length = 1.0f;
        this.width =1.0f;
    }

     public Rectangle(float length, float width){  //constructor
        this.length= length;
        this.width = width;
     }

     public float getLength (){  //method
        return this.length;
     }

    public void setLength(float length){ //method
        this.length =length;
    }

    public float getWidth(){  //method
        return this.width;
    }

    public void setWidth(float width){ //method
        this.width = width;
    }

    public double getArea(){   //method
        return this.length * this.width;
    }

    public double getPerimeter(){  //method
        return 2* (this.length + this.width);
    }

    public String toString() {   //method
    return "Rectangle[length=" + this.length + ",width=" + this.width + "]";
}



}
