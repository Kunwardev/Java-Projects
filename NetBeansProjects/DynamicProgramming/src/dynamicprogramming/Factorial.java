/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamicprogramming;

/**
 *
 * @author Kunwar
 */
public class Factorial
{
    int arr[] = new int[100];
    public int factorial(int x)
    {
        if(x == 1 || x == 0)
            return 1;
        else if(arr[x] != 0)
            return arr[x];
        else
            return arr[x] = x*factorial(x-1);
    }
    
    public static void main(String[] args)
    {
        Factorial f = new Factorial();
        int z = f.factorial(5);
        System.out.println(z);
    }
    
}
