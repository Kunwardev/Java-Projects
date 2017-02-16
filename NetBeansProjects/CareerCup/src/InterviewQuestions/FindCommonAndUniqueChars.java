/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions;

import java.util.HashSet;

/**
 *
 * @author Kunwar
 */
public class FindCommonAndUniqueChars
{
    private static void Find(String str1, String str2){
        HashSet<Character> st1 = new HashSet<>();
        HashSet<Character> st2 = new HashSet<>();
        for(int i=0;i<str1.length();i++){
            st1.add(str1.charAt(i));
        }
        for(int j=0;j<str2.length();j++){
            st2.add(str2.charAt(j));
        }
        
        System.out.println(st1);
        System.out.println(st2);
        HashSet<Character> common = new HashSet<>();
        HashSet<Character> unique = new HashSet<>();
        for(char c: st1){
            if(st2.contains(c))
                common.add(c);
            else
                unique.add(c);
        }
        
        for(char c: st2){
            if(st1.contains(c))
                common.add(c);
            else
                unique.add(c);
        }
        
        System.out.println(common);
        System.out.println(unique);
    }
    
    public static void main(String[] args)
    {
        String str1 = "india";
        String str2 = "united states of america";
        Find(str1, str2);
    }
    
}
