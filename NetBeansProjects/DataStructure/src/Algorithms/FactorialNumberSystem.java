/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.util.Scanner;

/**
 *
 * @author Kunwar
 */
public class FactorialNumberSystem
{
    public static char Convert(long p)
    {
        char q = (char) ((char) p + '0');
        if(p>9)
        {
            q = (char) (p - 10 + 'A');
        }
        return q;
    }
    
    public static String convertFactorial(long decimal)
    {
        long i = 1;
        String decimalToFact = "";
        while(decimal != 0)
        {
            decimalToFact = Convert(decimal%i)+decimalToFact;
            decimal /= i;
            i++;
        }
        return decimalToFact;
    }
    
    public static long Factorial(long p)
    {
        if(p == 0)
            return 1;
        long f = 1;
        for(long i=2;i<=p;i++)
            f*=i;
        return f;
    }
    
    public static long convertDecimal(String factorial)
    {
        long d = 0;
        for(long i=0;i<factorial.length();i++)
        {
            if(factorial.charAt((int)i) >= '0' && factorial.charAt((int)i)<='9')
                d = d + ((factorial.charAt((int)i) - '0')*Factorial(factorial.length()-i-1));
            else
                d = d + ((factorial.charAt((int)i) - 'A' + 10)*Factorial(factorial.length()-i-1));
        }
        return d;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long decimal = sc.nextLong();
        String decimalToFact = convertFactorial(decimal);
        System.out.println(decimalToFact);
        long factToDecimal = convertDecimal(decimalToFact);
        System.out.println(factToDecimal);
    }
    
}
