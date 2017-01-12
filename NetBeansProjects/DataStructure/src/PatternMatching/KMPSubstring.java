/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PatternMatching;

/**
 *
 * @author Kunwar
 */
public class KMPSubstring
{
    private static void ComputeArray(String pat,int len[]){
        len[0] = 0;
        int j=0;
        for(int i=1;i<pat.length();){
            if(pat.charAt(i) == pat.charAt(j)){
                len[i] = j+1;j++;i++;
            }else{
                if(j!=0){
                    j = len[j-1];
                }else{
                    len[i] = 0;
                    i++;
                }
            }
        }
    }
    
    private static boolean SearchKMP(String text,String pat){
        int len[] = new int[pat.length()];
        ComputeArray(pat, len);
        int i=0,j=0;
        while(i < text.length() && j < pat.length() ){
            if(text.charAt(i) == pat.charAt(j)){
                i++;j++;
            }else{
                if(j == 0)
                    i++;
                else
                    j = len[j-1];
            }
        }
        if(j == pat.length())
            return true;
        return false;
    }
    
    public static void main(String[] args)
    {
        
        String pat = "abcabcy";
        String text = "abcbabcabcdabcabcy";
        System.out.println(SearchKMP(text, pat));
        }
    }
    
