import java.io.*;

public class A1
{
    public static void main(String[] args) throws IOException
    {
        int num, sum = 0;

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number: ");
        num = Integer.parseInt(obj.readLine());
        for (int i=1; i<11; i++)
        {
            sum = num * i;
            System.out.println(num + "*" + i + "=" + sum);
        }
    }
}
