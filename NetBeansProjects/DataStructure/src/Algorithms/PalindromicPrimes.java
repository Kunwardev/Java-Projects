
package Algorithms;

import java.util.Arrays;
import java.util.Scanner;
public class PalindromicPrimes
{
    static boolean Prime[];
    public static void PrimeErast(int n)
    {
        Prime = new boolean[n+1];
        Arrays.fill(Prime, true);
        for(int i=2;i<=n;i++)
        {
            if(Prime[i] == true)
            {
                for(int j=2*i;j<=n;j+=i)
                {
                    Prime[j] = false;
                }
            }
        }
        
    }
    
    public static void Palindrom(int n)
    {
        PrimeErast(n);
        int Palin[] = new int[n+1];
        for(int i=0;i<=n;i++)
            Palin[i] = i;
        for(int i=2;i<=n;i++)
        {
            if(Prime[i] == true)
            {
                if(PalindromeUtil(Palin[i]) == true)
                    System.out.println(Palin[i]);
            }
        }
    }

    private static boolean PalindromeUtil(int i)
    {
        int num1 = i,num2 = 0;
        if(i<10)
            return true;
        else
        {
            
            while(i != 0)
            {
                num2 = num2*10 + i%10;
                i = i/10;
            }
        }
        if(num1 == num2)
            return true;
        return false;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Palindrom(N);
    }
    
}
