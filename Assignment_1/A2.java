import java.util.Scanner;

public class A2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Entered number is: " + num);
        int rev = 0;
        int rem = 0;

        while(num!=0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("Reverse of number is: " + rev);
    }
}
