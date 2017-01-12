/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamicprogramming;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class CatalanNumbers
{
    public static int Function(int x){
        int cata[] = new int[x+1];
        cata[0] = 1;
        cata[1] = 1;
        for(int i=2;i<=x;i++)
            for(int j=0;j<i;j++)
            {
                cata[i] += cata[j] * cata[i-j-1];
            }
        return cata[x];
    }
    
    public static void main(String[] args)
    {
        int z = Function(9);
        System.out.println(z);
    }
    
}
