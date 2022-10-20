import java.util.*;
import java.io.*;

public class A4
{
    int dd, mm, yy;

    public A4()
    {
    }
    public A4(int dd, int mm, int yy)
    {
        this.dd=dd;
        this.mm=mm;
        this.yy=yy;
    }
    public void display()
    {
        System.out.println("Date is: "+dd+" "+mm+" "+yy);
    }
    public static void main(String[] args) throws Exception
    {
        A4 m1 = new A4();
        A4 m2 = new A4(9,12,2002);
        m2.display();
    }
}