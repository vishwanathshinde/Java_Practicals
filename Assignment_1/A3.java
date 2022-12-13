// Array elements sum and printing in ascending order
import java.util.*;
import java.io.*;

public class A3
{
    public static void main(String[] args) throws IOException
    {
        int arr[]={2,4,5,69,8};
        int sum = 0;
        
        for(int i=0; i<arr.length; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("Sum is: "+sum);

        int temp = 0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Elements of array sorted in Ascending order: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}