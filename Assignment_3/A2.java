import java.util.*;
import java.io.*;

public class A2
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Hashtable ht = new Hashtable();
        System.out.print("Enter the number of employee details: ");
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter the name of employee: ");
            String name = br.readLine();
            System.out.print("Enter the salary ofemployee: ");
            int salary = Integer.parseInt(br.readLine());
            ht.put(name,salary);
        }
        System.out.println("HashTable is: "+ ht);

        Enumeration k = ht.keys();
        Enumeration v = ht.elements();
        System.out.println("Name\tSalary");
        while(k.hasMoreElements())
        {
            System.out.println(k.nextElement()+"\t"+v.nextElement());
        }

        System.out.println("Enter name to search: ");
        String snm = br.readLine();

        k=ht.keys();
        v=ht.elements();
        int cnt=0;
        while(k.hasMoreElements())
        {
            String name=(String)k.nextElement();
            if(snm.equals(name))
            {
                cnt++;
                System.out.println("Salary: "+v.nextElement());
            }
        }
        if(cnt==0)
        {
            System.out.println("Employee Not Found.");
        } 
    }
}