/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author Kunwar
 */
public class AmicableNumbers
{
    private static boolean isAmicable(int a,int b){
        return (Div(a) == b && Div(b) == a);
    }

    private static int Div(int a)
    {
        int sum = 1;
        for(int i=2;i<=(int)Math.sqrt(a);i++){
            if(a%i == 0){
                sum += i;
                if(a/i != i){
                    sum += (a/i);
                }
            }
        }
        return sum;
    }
    
    private static void Function(int[] arr){
        ArrayList<Integer> tm = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i: arr)
            tm.add(i);
        for(int j: arr){
            int x = Div(j);
            if(tm.contains(x)){
                if(isAmicable(j, x)){
                    if(!hm.containsKey(x)){
                        hm.put(j, x);
                    }
                }
            }
        }
        System.out.println(hm);
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{220, 284, 1184, 1210, 2 , 5};
        Function(arr);
    }
    
}
