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
public class MaxRotate {
    
    public static long maxRot (long n) {
        // your code
        String number = n+"";
        int j,i;
        StringBuilder my = new StringBuilder(number);
        for( i=0;i<number.length()-1;i++)
        {
        	char a = number.charAt(i);
          for( j=i;j<number.length()-2;j++)
          {my.setCharAt(j, number.charAt(j+1));}
          my.setCharAt(j, a);
            System.out.println(my.toString());
        }
        long p = Long.parseLong(my.toString());
        return p;
    }
    public static void main(String[] args)
    {
        long z = maxRot(56789);
        System.out.println(z);
    }
}