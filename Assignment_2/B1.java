import java.io.*;

interface Operation
{
    double pi = 3.14;
    double area();
    double volume();
}

class circle implements Operation
{
    double r;
    circle(double x)
    {
        r=x;
    }
    public double area()
    {
        return pi*r*r;
    }
    public double volume()
    {
        return 2*pi*r*r;
    }
}

class cylinder implements Operation
{
    double r;
    double h;
    cylinder(double x, double y)
    {
        r=x;
        h=y;
    }
    public double area()
    {
        return 2*pi*r*h+2*pi*r*r;
    }
    public double volume()
    {
        return pi*r*r*h;
    }
}

public class B1
{
    public static void main(String[] args)
    {
        circle ob1 = new circle(5);
        System.out.println("The area of the circle is: "+ob1.area());
        System.out.println("The volume of the circle is: "+ob1.volume());
        cylinder ob2 = new cylinder(5,5);
        System.out.println("The area of the cylinder is: "+ob1.area());
        System.out.println("The volume of the cylinder is: "+ob1.volume());
    }
}