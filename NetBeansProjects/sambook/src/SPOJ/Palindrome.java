/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SPOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean result;
        int T = Integer.parseInt(br.readLine());
        String arr[] = new String[T];
        int i=0;
        while(i!=T)
        {
            arr[i] = br.readLine();
            i++;
        }
        System.out.println();
        for(int l=0;l<T;l++)
        {
            result = false;
            while(true)
            {
                result = check(arr[l]);
                int pa = Integer.parseInt(arr[l]);
                pa = pa+1;
                if(result==true)
                    break;
                arr[l] = pa+"";
            }
            System.out.println(arr[l]);
        }
    }
    
    public static boolean check(String original) throws IOException
    {
         String  reverse = "";
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int length = original.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         reverse = reverse + original.charAt(i);
 
      if (original.equals(reverse))
         return true;
      else
         return false;
    }
}