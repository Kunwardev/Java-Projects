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
public class NthEvenFibonacci
{
    public int Function(int n){
        int F[] = new int[n+1];
        F[0] = 0;
        F[1] = 2;
        for(int i=2;i<=n;i++)
            F[i] = 4*F[i-1]+F[i-2];
        return F[n];
    }
    
    public static void main(String[] args)
    {
        NthEvenFibonacci b = new NthEvenFibonacci();
        System.out.println(b.Function(7));
    }
    
}
