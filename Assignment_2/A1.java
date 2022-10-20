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
        System.out.println("Co-ordinate of x and y is: "+ x + "\n" + y);
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