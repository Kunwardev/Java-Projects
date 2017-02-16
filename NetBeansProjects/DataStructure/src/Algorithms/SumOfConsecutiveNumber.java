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
public class SumOfConsecutiveNumber
{
    private static void Function(int n){
        if((n & (n-1)) == 0){
            return;
        }{
            int x = (int)Math.ceil((Math.sqrt(8*n+1)-1)/2);
            int sum = 0;
            for(int p=x;p>=0;p--){
                sum+=p;
                System.out.print(p+" ");
                if(sum == n)
                    break;
            }
        }
    }
    
    public static void main(String[] args){
        Function(100);
    }
    
}
