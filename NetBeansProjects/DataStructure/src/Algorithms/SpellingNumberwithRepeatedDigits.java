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
public class SpellingNumberwithRepeatedDigits
{
    public static int Spells(String b)
    {
        int result = 1;
        int n = b.length();
        for(int i=0;i<n;i++)
        {
            int count = 1;
            while(i<n-1 && b.charAt(i) == b.charAt(i+1))
            {
                count++;i++;
            }
            result = (int) (result * Math.pow(2,count-1));
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        System.out.println(Spells("8884441100"));
    }
    
}
