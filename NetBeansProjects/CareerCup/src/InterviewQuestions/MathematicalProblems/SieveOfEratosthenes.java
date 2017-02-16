/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions.MathematicalProblems;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class SieveOfEratosthenes
{
    private static ArrayList<Integer> Function(int n){
        ArrayList<Integer> al = new ArrayList<>();
        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes, true);
        for(int i=2;i<=n;i++){
            if(primes[i] == true)
                al.add(i);
            for(int j=2*i;j<=n;j+=i){
                primes[j] = false;
            }
        }
        return al;
    }
     
    public static void main(String[] args)
    {
        ArrayList<Integer> al = Function(100);
        System.out.println(al);
    }
    
}
