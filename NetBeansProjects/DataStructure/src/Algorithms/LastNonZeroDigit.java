/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

/**
 *
 * @author Kunwar
 */
public class LastNonZeroDigit
{
    static int dig[] = new int[]{1, 1, 2, 6, 4, 2, 2, 4, 2, 8};
    
    private static int LastDigit(int n){
        if(n < 10)
            return dig[n];
        if(((n/10)%10)%2 == 0)
            return (6 * LastDigit(n/5)*dig[n%10])%10;
        return (4 * LastDigit(n/5)*dig[n%10])%10;
    }
    
    public static void main(String[] args){
        int n = 14;
        System.out.println(LastDigit(n));
    }
    
}
