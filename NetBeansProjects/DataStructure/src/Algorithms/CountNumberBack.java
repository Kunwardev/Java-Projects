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
public class CountNumberBack
{
    private static int getNumber(String s){
        int length = s.length();
        int j = 0;
        for(int i=length-1;i>=0;i--){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                
            }else{
                j = i+1;
                break;
            }
        }
        int x = Integer.parseInt(s.substring(j,length));
        return x;
    }
    
    private static boolean Function(String s){
        int length = getNumber(s);
        int count = 0;
        for(int i=0;i<length;i++){
            if(!((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')))
                return false;
            count++;
        }
        if(count == length)
            return true;
        return false;
    }
    
    public static void main(String[] args)
    {
        String w = "geeksforgeeks15";
        System.out.println(Function(w));
    }
    
}
