/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions.MathematicalProblems;

import java.util.Random;

/**
 *
 * @author Kunwar
 */
public class FermatMethod
{
    private static int isPower(int a,int n,int p){
        int res = 1;
        a = a%p;
        while(n > 0){
            if((n & 1) > 0)
                res = (res*a)%p;
            n = n>>1;
            a = (a*a)%p;
        }
        return res;
    }
    
    private static boolean isPrime(int a,int k){
        Random r = new Random();
        if(a<=1||a==4)
            return false;
        if(a<=4)
            return true;
        while(k > 0){
            int x = 2 + r.nextInt(a-4);
            if(isPower(x, a-1,a) != 1)
                return false;
            k--;
        }
        return true;
    }
    
    public static void main(String[] args){
        int k = 3;
        System.out.println(isPrime(11, k));
        System.out.println(isPrime(15, k));
    }
    
}
