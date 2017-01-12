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
public class SwapEvenOddBits
{
    private static int Function(int n){
        int even = (0xAAAAAAAA&n)>>1;
        int odd = (0x55555555&n)<<1;    
        int result = even | odd;
        return result;
    }
    
    public static void main(String[] args)
    {
        int n = 23;
        int p = Function(n);
        System.out.println(p);
    }
    
}
