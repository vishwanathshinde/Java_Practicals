import java.io.*;

class NumberException extends Exception
{
    public String toString()
    {
        return("Number is 0");
    }
}

class Primenumber
{
    int a;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Primenumber()
    {
        try
        {
            System.out.println("Enter any number to check prime: ");
            a=Integer.parseInt(br.readLine());
            if(a==0)
                throw new NumberException();
        }
        catch(NumberException ex)
        {
            System.out.println(ex);
        }
        catch(IOException ex1)
        {
            System.out.println("Enter number properly!");
        }
    }
    public void prime()
    {
        int cnt=0;
        for(int i=2; i<=a/2; i++)
        {
            if(a%i==0)
            {
                cnt++;
                break;
            }
        }
        if(cnt==0)
            System.out.println(a+" is a prime Number!");
        else
            System.out.println(a+" is NOT a prime Number!");
    }    
}
public class A3
{
    public static void main(String[] args)
    {
        Primenumber pn = new Primenumber();
        pn.prime();
    }
}