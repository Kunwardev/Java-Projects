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
public class CountingConsecutiveSetBits
{
    public static int Count(int x){
        int count = 0;
        while(x != 0)
        {
            x = x &(x<<1);
            count++;
            //System.out.println(count); 
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        int p = 222;
        int y = Count(p);
        System.out.println(y);
    }
    
}
