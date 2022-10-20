import java.io.*;

public class B1
{
    public int a;
    public B1()
    {
        a = 0;
    }
    public B1(int a)
    {
        this.a = a;
    }
    public boolean isNegative()
    {
        if(a<0)
            return true;
        else return false;
    }
    public boolean isPositive()
    {
        if(a>0)
            return true;
        else return false;
    }
    public boolean isOdd()
    {
        if(a%2!=0)
            return true;
        else return false;
    }
    public boolean isEven()
    {
        if(a%2==0)
            return true;
        else return false;
    }

    public static void main(String args[]) 
    {
        int a = Integer.parseInt(args[0]);
        B1 m = new B1(a);
        if(m.isNegative())
            System.out.println("Given no is Negative!");
        if(m.isPositive())
            System.out.println("Given no is Positive!");
        if(m.isOdd())
            System.out.println("Given no is Odd!");
        if(m.isEven())
            System.out.println("Given no is Even!");
    }
    
}