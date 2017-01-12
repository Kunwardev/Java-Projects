
package Algorithms;

import java.util.Scanner;

public class CountPairofConsecutiveZeroes
{
    public static int Solution(int x)
    {
        if(x == 1)
            return 0;
        if(x == 2 || x == 3)
            return 1;
        int q = (int)Math.pow(2,x)/12;
        return (2*q+1);
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z = Solution(n);
        System.out.println(z);
        
    }
    
}
