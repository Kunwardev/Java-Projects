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
public class PowerFunctions
{
    public static int Power(int n,int p)
    {
        if(p == 0)
            return 1;
        if(p%2 == 0)
            return Power(n,p/2)*Power(n,p/2);
        else
            return n * Power(n,p/2)*Power(n,p/2); 
    }
    
    public static void main(String[] args)
    {
        int x = 2;
        int y = 4;
        int z = Power(x, y);
        System.out.println(z);
        z = Power(x, y-1);
        System.out.println(z);
    }
    
}
