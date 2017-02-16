/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.util.HashSet;

/**
 *
 * @author Kunwar
 */
public class HappyNumbers
{
    private static int sumDigits(int x){
        int res = 0;
        while(x != 0){
            int p = x%10;
            res += (p*p);
            x = x/10;
        }
        return res;
    }
    
    private static boolean Function(int n){
        HashSet<Integer> h = new HashSet<>();
        
        while(!h.contains(n)){
            n = sumDigits(n);
            h.add(n);
            if(n == 1)
                return true;
        }
        return false;
    }
}
