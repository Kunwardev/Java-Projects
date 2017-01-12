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
public class BitsFlipped
{
    private static int BitCount(int a,int b){
        int y = a^b;
        return Integer.bitCount(y);
        
    }
    
    public static void main(String[] args)
    {
        int A = 73;
        int B = 21;
        System.out.println(BitCount(A, B));
    }
    
}
