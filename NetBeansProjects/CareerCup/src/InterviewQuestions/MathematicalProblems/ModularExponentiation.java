/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions.MathematicalProblems;

/**
 *
 * @author Kunwar
 */
public class ModularExponentiation
{
    private static int Function(int x,int y,int p){
        int res = 1;
        x = x%p;
        while(y>0){
        if((y&1) == 1)
            res = (res*x)%p;
        y>>=1;
        x = (x*x)%p;
        }
        return res;
    }
    
    public static void main(String[] args){
        int x = 2;
        int y = 5;
        int p =13;
        int a = Function(2, 5 , 13);
        System.out.println(a);
    }
    
}
