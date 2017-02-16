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
public class ch16Question5
{
    private static int countZeroes(int n){
        int count = 0;
        for(int i=5;n/i>0;i*=5){
            count += n/i;
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        int x = 25;
        System.out.println(countZeroes(x));
    }
    
}
