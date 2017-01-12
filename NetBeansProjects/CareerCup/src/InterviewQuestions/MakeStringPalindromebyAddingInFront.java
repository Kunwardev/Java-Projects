/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions;

/**
 *
 * @author Kunwar
 */
public class MakeStringPalindromebyAddingInFront
{
    private static String Function(String input){
        String output = "";
        int x = input.length();
        int i=0,j = x-1;
        while(i<j){
        //    System.out.println(i+"  "+j);
            if(input.charAt(i) != input.charAt(j)){
                output = output+input.charAt(j);
                j--;
            }else{
                i++;j--;
            }
        }
        
        output = output + input;
        return output;
    }
    
    public static void main(String[] args)
    {
        System.out.println(Function("cbazabc"));
    }
    
}
