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
public class EulerTotient
{
    private static int Function(int n){
        float result = n;
        for(int p=2;p*p<=n;++p){
            if( n%p == 0 ){
                while(n%p == 0){
                    n/=p;
                }
            result *= (1.0-(1.0/(float)p));
            }
        }
        
        if(n>1){
            result *= (1.0-(1.0/(float)n));
        }
        return (int) result;
    }
    
    public static void main(String[] args)
    {
        for(int i=1;i<=10;i++){
            System.out.println(i+" -> "+Function(i));
        }
    }
    
}