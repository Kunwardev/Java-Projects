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
public class CompressString
{
    private static String Function(String x){
        String result = "";
        int count = 1;
        for(int i=0;i<x.length()-1;i++){
            if(x.charAt(i) == x.charAt(i+1) && i == x.length()-2){
                count++;
                result += x.charAt(i+1)+""+count;
            }
            else if(x.charAt(i) == x.charAt(i+1))
                count++;
            else{
                result+=x.charAt(i)+""+count;
                count = 1;
                if(i == x.length()-2){
                    result += x.charAt(i+1)+""+count;
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        String a = "aaabbcdddd";
        String r =Function(a);
        System.out.println(r);
    }
    
}
