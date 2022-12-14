import utility.*;

import java.io.IOException;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class A4
{
    public static void main(String args[]) throws IOException
    {
    String n, city;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name in lower case: ");
    n = sc.next();
    System.out.println("Enter your city in lower case: ");
    city = sc.next();

    CapitalString cs = new CapitalString();
    cs.capital(n);
    System.out.println("City is: "+city);
    }
}