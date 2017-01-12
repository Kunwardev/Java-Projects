/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;

/**
 *
 * @author Kunwar
 */
public class ch5Question5
{
    private static int Conversion(int a,int b){
        int count = 0;
        for(int c=a^b;c!=0;c=c>>1){
            count += c&1;
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        int a = 24,b = 23;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Conversion(a, b));
    }
    
}
