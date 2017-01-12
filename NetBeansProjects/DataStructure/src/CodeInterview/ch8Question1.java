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
public class ch8Question1
{
    private static int Fibonacci(int n){
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        else{
            return (Fibonacci(n-1)+Fibonacci(n-2));
        }
    }
    
    public static void main(String[] args)
    {
        int p = 10;
        int x = Fibonacci(p);
        System.out.println(x);
    }
    
}
