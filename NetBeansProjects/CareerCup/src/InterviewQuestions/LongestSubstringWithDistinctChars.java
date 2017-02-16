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
public class LongestSubstringWithDistinctChars
{
    private static String Function(String a, int k){
        int p = k;
        int i_1 = 0,i_2 = 0,j_1 = 1,rese = 0;boolean firstTime = true;
        String res = "",other = "";
        while(j_1 <= a.length()){
            if(p == 0 || j_1 == a.length()){
                other = a.substring(i_1,j_1);
                i_1 = i_2;
                firstTime = true;
                if(rese < other.length()){
                    rese = other.length();
                    res = other;
                }other = "";
                p = k;
            }else{
                if(a.charAt(i_1) != a.charAt(j_1)){
                    if(a.charAt(j_1) != a.charAt(j_1 - 1))
                        p--;
                    if(firstTime){
                        i_2 = j_1;
                        firstTime = false;
                    }
                }
            }
            j_1++;
        }
        return res;
    }
    
    public static void main(String[] args)
    {
        String a = "sdfrtttt";
        String b = Function(a, 2);
        System.out.println(b);
    }
    
}
