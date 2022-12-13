// Store info of 5 Employee use array of objects
import java.util.*;

class Employee
{
    public String name;
    public double salary;

    Scanner sc = new Scanner(System.in);
    public void getdata()
    {
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter salary: ");
        salary = sc.nextDouble();
    }
    public void dispay()
    {
        System.out.println("Employee Info: ");
        System.out.println("Name is: "+ name);
        System.out.println("Salary is: "+ salary);
        System.out.println("---------------");
    }
}
public class B2
{
    public static void main(String args[])
    {
        Employee e1[] = new Employee[5];
        for(int i=0; i<e1.length; i++)
        {
            e1[i] = new Employee();
            e1[i].getdata();
        }
        for(int i=0; i<e1.length; i++)
        {
            e1[i].dispay();
        }
    }
}