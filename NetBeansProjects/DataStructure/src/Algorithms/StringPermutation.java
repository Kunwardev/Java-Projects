/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Kunwar
 */
public class StringPermutation
{
    static HashSet<String> h = new HashSet<>();
    private static void Call(char[] arr,int l,int r){
        if(l == r){
            String j="";
            for(char c: arr)
                j += c;
        h.add(j);
        }else{
            for(int i=l;i<r;i++){
                char c = arr[l];
                arr[l] = arr[i];
                arr[i] = c;
                Call(arr,l+1,r);
                char d = arr[l];
                arr[l] = arr[i];
                arr[i] = d;
            }
        }
        
    }
    
    private static void Function(String s){
        char[] arr = s.toCharArray();
        Call(arr,0,s.length());
    }
    
    public static void main(String[] args)
    {
        Function("AABC");
        System.out.println(h);
    }
    
}
