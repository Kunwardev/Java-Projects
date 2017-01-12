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
public class MultiplyBy10
{
    public static int Function(int x)
    {
        return ((x<<1)+(x<<3));
    }
    
    public static void main(String[] args)
    {
        int y = 16;
        int z = Function(y);
        System.out.println(z);
    }
    
}
