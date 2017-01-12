package AppQues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swap1
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first number : ");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter the second number : ");
        int b = Integer.parseInt(br.readLine());
        System.out.println("After Swapping");
        b = a+b;
        a = b-a;
        b = b-a;
        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);
    }
}
