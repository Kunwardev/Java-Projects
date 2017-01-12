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
public class NUmberofWaystoReachTop
{
    static int map[] = new int[100];;
    private static int countDP(int n){
        if(n < 0)
            return 0;
        if(n == 1)
            return 1;
        if(map[n] > 0)
            return map[n];
        map[n] = countDP(n-1)+countDP(n-2)+countDP(n-3);
        return map[n];
    }
    
    public static void main(String[] args)
    {
        int steps = 10;
        int x = countDP(steps);
        System.out.println(x);
    }
    
}
