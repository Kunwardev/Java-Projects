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
public class ch5Question1
{
    private static int updateBits(int n, int m, int i, int j){
        int max = ~0;
        System.out.println("max -> "+Integer.toBinaryString(max));
        int left = max - ((1 << j)-1);
        System.out.println("left -> "+Integer.toBinaryString(left));
        int right = ((1 << i) - 1);
        System.out.println("right -> "+Integer.toBinaryString(right));
        int mask =  left | right;
        System.out.println  (Integer.toBinaryString(mask));
        return (n & mask) | (m << i);
    }
    
    public static void main(String[] args)
    {
        int n = 100000000, m = 10101, i = 2, j = 6;
        System.out.println(Integer.toBinaryString(n));
        int  p = updateBits(n, m, i, j);
        System.out.println(Integer.toBinaryString(p));
    }
    
}
