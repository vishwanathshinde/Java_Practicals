import java.util.*;
import java.io.*;

public class A1
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter how many integers you want to enter: ");
        int n = Integer.parseInt(br.readLine());
       
        TreeSet ts = new TreeSet();

        for(int i=0; i<n; i++)
        {
            System.out.print("Enter the number: ");
            int x=Integer.parseInt(br.readLine());
            ts.add(x);
        }

        Iterator itr = ts.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.print("Enter no to search: ");
        int no = Integer.parseInt(br.readLine());
        if(ts.contains(no))
            System.out.println("Number "+no+" Found");
        else
            System.out.println("Number "+no+" Not Found");
    }
}