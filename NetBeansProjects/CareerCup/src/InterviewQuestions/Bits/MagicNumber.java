/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions.Bits;

/**
 *
 * @author Kunwar
 */
public class MagicNumber
{
    private static int Function(int n){
        int pow = 1,ans = 0;
        while(n!=0){
            pow = pow*5;
            if((n&1) == 1)
                ans+=pow;
            n = n>>1;
        }
        return ans;
    }
    
    public static void main(String[] args)
    {
        int x = Function(5);
        System.out.println(x);
    }
    
}
