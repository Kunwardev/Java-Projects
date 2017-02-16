/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions.MathematicalProblems;

import java.util.Scanner;

/**
 *
 * @author Kunwar
 */
public class ModularMultiplicaticeInverse
{
    private static int[] findInverse(int a,int b){
        int x=0,y=1,lastx=1,lasty=0;
        while(b!=0){
            int quotient = a/b;
            
            int temp = a;
            a = b;
            b = temp%b;
            
            temp = x;
            x = lastx-quotient*x;
            lastx = temp;
            
            temp = y;
            y = lasty-quotient*y;
            lasty = temp;
        }
        int []coefficients = {lastx,lasty,a};
        return coefficients;
    }
    
    private static int GCD(int a, int b){
        if(b == 0)
            return a;
        return GCD(b,a%b);
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int mod = in.nextInt();
        if(GCD(base,mod)!=1)
            System.out.println("SOlution NOt Possible");
        else{
            int [] coefficients = findInverse(base, mod);
            if((base * coefficients[0])%mod == 1 )
                System.out.println(coefficients[0]);
            else
                System.out.println(coefficients[1]);
        }
    }
    
}
