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
public class NumberWhoseFactorialisDivisibleByX
{
    private static int GCD(int a,int b){
        if(b == 0)
            return a;
        return GCD(b,a%b);
    }
    
    private static int Function(int x){
        int new_x = x;
        int i = 1;
        while(true){
            new_x /= GCD(new_x,i);
            if(new_x == 1)
                break;
            i++;
        }
    return i;
    }
    
    public static void main(String[] args)
    {
        int p = Function(16);
        System.out.println(p);
    }
    
}