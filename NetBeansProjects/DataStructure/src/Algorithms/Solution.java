/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class Solution {


        public static int PrimeFactorCount(long n)
            {
            int count = 0;
            if(n == 1)
                return 0;
            if(n%2 == 0)
                count++;
            while(n%2 == 0)
                {
                n = n/2;
            }
            for(long i=3;i<=Math.sqrt(n);i+=2)
                {
                if(n%i == 0)
                    count++;
                while(n%i == 0)
                    {
                    n = n/i;
                }
            }
            if(n>2)
                count++;
            return count;
        }

         public static boolean isPrime(long N)
        {
        if(N%2 == 0)
            return false;
        for(long i=3;i<=N/2;i+=2)
	{
           long temp=N%i;
	   if(temp==0)
	   {
	      return false;
	   }
	}
        return true;
    }
        
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            int T;
            Scanner sc = new Scanner(System.in);
            T = sc.nextInt();
            long N;
            for(int i=0;i<T;i++)
            {
            N = sc.nextLong();
            int max = 0;
            for(long j=1;j<=Math.sqrt(N);j+=2)
            {if(!(isPrime(j)))
            {int t = PrimeFactorCount(j);
             max = Math.max(max,t);}
            }
            System.out.println(max);
        }
        }}
    