import java.io.*;

class Point
{
    int x, y;
    Point()
    {
        x = 0;
        y = 0;
    }
    Point(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public void display()
    {
        System.out.println("Co-ordinate of x and y is: "+ x + "," + y);
    }
}
class ColorPoint extends Point
{
    String color;
    public ColorPoint(String color)
    {
        this.color=color;
    }
    public void display()
    {
        System.out.println("Color is: "+color);
    }
}

class Point3D extends Point
{
    int z;
    public Point3D(int x, int y, int z)
    {
        super(x,y);
        this.z=z;
    }
    public void display()
    {
        super.display();
        System.out.println("The co-ordinate of x , y and Z is: "+x+","+y+","+z);
    }
} 

public class A1
{
    public static void main(String[] args)
    {
        Point3D obj1 = new Point3D(6, 4, 8);
        obj1.display();
        ColorPoint obj2 = new ColorPoint("Black");
        obj2.display();
    }
}