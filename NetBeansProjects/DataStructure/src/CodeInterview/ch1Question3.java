/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class ch1Question3
{
 public static String removeDuplicatesEff(String str) {
     String ab = "abcdefghijklmnopqrstuvwxyz";
     String x = "";
     int count[] = new int[26];
     Arrays.fill(count,0);
     for(int i=0;i<str.length();i++)
     {
         count[str.charAt(i)-97]++;
     }
     for(int j=0;j<26;j++)
         if(count[j] > 0)
             x += ab.charAt(j);
     return x;
 }
    public static void main(String[] args)
    {
        String str = "ababababa";
        str = removeDuplicatesEff(str);
            System.out.print(str);
            System.out.println("");
    }
 
}
