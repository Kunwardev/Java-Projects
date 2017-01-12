/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

/**
 *
 * @author Kunwar
 */
public class LegendreFormula
{
    
    public static int Factorial(int y)
    {
        int z = 1;
        for(int i=2;i<=y;i++)
            z *= y;
        return z;
    }
    
    public static int method(int x,int p)
    {
        
        int count = 0,i=1;
        while(x > 0)    
        {
            x = x/p;
            count += x;
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        int n = 7,p=3;
        int output = method(n, 2);
        output = output + method(n,3);
        output = output + method(n,5);
        output = output + method(n,7);
        System.out.println(output);
    }
    
}
