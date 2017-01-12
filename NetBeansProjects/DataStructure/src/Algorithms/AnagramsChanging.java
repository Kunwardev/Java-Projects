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
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class AnagramsChanging {
    public static int numberNeeded(String first, String second) {
      int lengthfirst = first.length();
      int lengthsecnd = second.length();
      int remainder = 0;
      int length = lengthfirst + lengthsecnd;
      int arrf[] = new int[26];
      int arrs[] = new int[26];
      for(int i=0;i<lengthfirst;i++)
          arrf[first.charAt(i)-'a']++;
      for(int j=0;j<lengthsecnd;j++)
          arrs[second.charAt(j)-'a']++;
      for(int i=0;i<26;i++)
          {
          if(arrf[i] == arrs[i])
              {
              remainder += 2*arrf[i];
                  System.out.println(remainder+" "+length);
          }
      }
        //System.out.println(lengthfirst+" "+lengthsecnd+" "+length+" "+remainder);
        return (length - remainder);
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
