package utility;

public class CapitalString
{
    public void capital(String name) 
    {
        name = name.substring(0,1).toUpperCase()+name.substring(1);
        System.out.println("Name is: "+name);
    }
    public static void main(String[] args) throws Exception
    {

    }
}