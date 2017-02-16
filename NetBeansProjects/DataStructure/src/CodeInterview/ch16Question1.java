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
public class ch16Question1
{
    private static void Function(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a+" "+b);
    }
    
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        Function(a, b);
        
    }
    
}
