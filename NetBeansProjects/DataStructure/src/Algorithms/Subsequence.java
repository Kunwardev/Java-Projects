/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.util.ArrayList;

/**
 *
 * @author Kunwar
 */


public class Subsequence { 
    static boolean checker[] = new boolean[20];
    static String result = "";
    static ArrayList al = new ArrayList();
    public static void Sq(String s,int i){
        if(i == s.length()){
            result = "";
            for(int j=0;j<s.length();j++){
                if(checker[j])
                    result += s.charAt(j); 
            }
            al.add(result);
        }else{
                checker[i] = true;
                Sq(s,i+1);
                checker[i] = false;
                Sq(s,i+1);
        }
    }
    
    public static void main(String[] args)
    {
        Sq("Hel",0);
        System.out.println(al);
    }
    
}