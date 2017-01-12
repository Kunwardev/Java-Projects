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
public class TriangleNumbers
{
    public static boolean isTriangleNumber(long number)
    {
        if(number == 1 || number == 0)
            return true;
        int i=1;
        while(number > 0)
        {
            number = number - i;
            i++;
        }
        if(number == 0)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args)
    {
        System.out.println(isTriangleNumber(0));
        System.out.println(isTriangleNumber(1));
        System.out.println(isTriangleNumber(125250));
        System.out.println(isTriangleNumber(36));
        System.out.println(isTriangleNumber(125251));
    }
    
}
