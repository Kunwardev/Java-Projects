/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;

/**
 *
 * @author Kunwar
 */
public class ch1Question8
{
    private static boolean isSubstring(String x,String y){
        int p = y.length();
        for(int i=0;i<x.length()-p+1;i++)
            if(x.substring(i, i+p).equals(y))
                return true;
        return false;
    }
    
    private static boolean checkRotation(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        else{
            String s1s1 = s1+s1;
            return isSubstring(s1s1, s2);
        }
    }
    
    public static void main(String[] args)
    {
        System.out.println(checkRotation("apple", "ppale"));
    }
    
}
