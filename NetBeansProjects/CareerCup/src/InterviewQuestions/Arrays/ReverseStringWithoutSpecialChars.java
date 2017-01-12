/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions.Arrays;

/**
 *
 * @author Kunwar
 */
public class ReverseStringWithoutSpecialChars
{
    
    private static boolean isAlphabet(char x){
        return ((x>='a'&&x<='z')||(x>='A'&&x<='Z'));
    }
    
    private static String reverseChars(String a){
        char[] arr = a.toCharArray();
        int i=0,j=a.length()-1;
        while(i<j){
            if(!isAlphabet(arr[i])){
                i++;
            }else if(!isAlphabet(arr[j])){
                j--;
            }else{
                char y = arr[i];
                arr[i] = arr[j];
                arr[j] = y;
                i++;j--;
            }
        }
        String x = new String(arr);
        return x;
    }
    
    public static void main(String[] args){
        String p = "kd!s@f";
        p = reverseChars(p);
        System.out.println(p);
    }
    
}
