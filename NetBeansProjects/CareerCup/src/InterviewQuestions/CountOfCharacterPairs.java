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
public class CountOfCharacterPairs
{
    private static int count(String str){
        int count = 0;
        for(int i=0;i<str.length()-1;i++){
            for(int j=1;(i+j)<str.length()&&j<=26;j++){
                if(Math.abs(str.charAt(i+j)-str.charAt(i)) == j){
                    System.out.println(str.charAt(i)+" "+str.charAt(j));
                    count++;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        int p = count(str);
        System.out.println(p);
    }
    
}
