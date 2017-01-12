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
public class NewClass
{
    public static int GCD(int a,int b)
    {
        if(b == 0)
            return a;
        else
            return GCD(b,a%b);
    }
    
    public static void main(String[] args)
    {
        float a = 10.5f,b = 3.3f;
        System.out.println(a%b);
        System.out.println(GCD(6,9));
    }
}
