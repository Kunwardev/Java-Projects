/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Karumanchi;

/**
 *
 * @author Kunwar
 */

public class PermutationOfBinary
{

    public static void Kary(String x,int n)
    {
        if(n<1)
            System.out.println(x);
        else
        {
            for(int i=0;i<3;i++) // K-ary, by changin the k
                Kary(x+i, n-1);
        }
    }
    public static void main(String[] args)
    {
        Kary("", 3);
    }
}
