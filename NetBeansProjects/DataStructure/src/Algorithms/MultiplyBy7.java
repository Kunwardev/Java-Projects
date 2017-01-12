
package Algorithms;

import java.util.Scanner;

public class MultiplyBy7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = ((n<<2) - n);
        System.out.println("The result is "+n);
    }
}
