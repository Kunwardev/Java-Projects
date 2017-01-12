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
public class RotateBits
{
    private static int Left(int n,int d){
        return ((n<<d)|(n<<(32-d)));
    }
    
    private static int Right(int n,int d){
        return ((n>>d)|(n<<(32-d)));
    }
    
    public static void main(String[] args)
    {
        int p = 16;
        int d = 2;
        int x = Left(p,d);
        System.out.println(x);
        x = Right(p,d);
        System.out.println(x);
    }
    
}
