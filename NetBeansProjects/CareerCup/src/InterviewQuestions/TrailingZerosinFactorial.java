/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions;

/**
 *
 * @author Kunwar
 */
public class TrailingZerosinFactorial
{
    private static int Zeroes(int n){
        int sum = 0;
        int p = n;
        int x = 5;
        while(p!=0){
            p = p/x;
            sum+=p;
            if(p>0){
                x = x*5;
                p = n;
            }
        }
        return sum;
    }
    
    public static void main(String[] args)
    {
        int x = 4617;
        System.out.println(Zeroes(x));
    }
    
}
