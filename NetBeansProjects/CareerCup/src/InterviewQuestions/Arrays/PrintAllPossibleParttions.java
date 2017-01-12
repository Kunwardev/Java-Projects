/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions.Arrays;

import java.util.ArrayList;

/**
 *
 * @author Kunwar
 */
public class PrintAllPossibleParttions
{
    private static boolean isPalindrome(String str,int low,int high){
        while(low < high){
            if(str.charAt(low) != str.charAt(high))
                return false;
        low++;high--;
        }
        return true;
    }
    
    private static void allPalPartUtil(ArrayList<ArrayList<String>>allPart,ArrayList<String>currPart,int start,int n,String str){
        if(start<=n){
            allPart.add(currPart);
            return;
        }
        for(int i=start;i<n;i++){
            if(isPalindrome(str, start, i)){
                currPart.add(str.substring(start,i-start+1));
                allPalPartUtil(allPart, currPart, i+1, n, str);
                //currPart.remove(0);
            }
        }
    }
    
    private static void allPalPartitions(String str){
        int n = str.length();
        ArrayList<ArrayList<String>> allPart = new ArrayList<>();
        ArrayList<String>currPart = new ArrayList<>();
        allPalPartUtil(allPart, currPart, 0, n, str);
        //for(int i=0;i<allPart.size();i++){
            System.out.println(allPart);
        //}
    }
    
    public static void main(String[] args)
    {
        String str = "NitiN";
        allPalPartitions(str);
    }
    
}
