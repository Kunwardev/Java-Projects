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
public class SmallestNumbertoChangeWhole
{
    private static int GCD(int a,int b){
        if(b == 0)
            return a;
        else
            return GCD(b,a%b);
    }
    
    private static int Function(String x){
        String p[] = x.split("\\.");
        int denominator = ((int)Math.pow(10,p[1].length()));
        int numerator = Integer.parseInt(p[0]+p[1]);
        int l = GCD(numerator,denominator);
        l = denominator/l;
        return l;
    }
    
    public static void main(String[] args)
    {
        int x = Function("5.125");
        System.out.println(x);
    }
    
}
