//Reverse a number using command line argument
import java .io.*;
public class A2
{ 
   public static void main(String args[])throws IOException
    {
       int a;
       int r=0;
       a = Integer.parseInt(args[0]);

       while(a!=0)
        {
           int digit = a%10;
           r = r*10+digit;
           a /= 10;
        }
       System.out.println("Reverse of no: "+r);
     }
}
