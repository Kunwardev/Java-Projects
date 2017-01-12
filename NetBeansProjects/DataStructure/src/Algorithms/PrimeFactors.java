
package Algorithms;

import java.util.Scanner;

public class PrimeFactors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n%2 == 0)
        {
            System.out.print("2 ");
            n = n/2;
        }
        for(int j=3;j<=Math.sqrt(n);j+=2)
        {
            while(n%j == 0)
            {
                System.out.print(j+" ");
                n = n/j;
            }
        }
        if(n>2)
            System.out.println(n);
    }
}
