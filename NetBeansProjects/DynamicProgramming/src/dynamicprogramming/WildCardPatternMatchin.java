/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamicprogramming;

/**
 *
 * @author Kunwar
 */
public class WildCardPatternMatchin
{
    private static boolean Function(char[] text, char[] pattern){
        
        boolean first = true;
        int index = 0;
        for(int i=0;i<pattern.length;i++){
            if(pattern[i] == '*'){
                if(first){
                    pattern[index++] = pattern[i];
                    first = false;
                }
            }else{
                pattern[index++] = pattern[i];
                first = true;
            }
        }
        boolean[][] result = new boolean[text.length+1][index+1];
        
        if(index > 0 && pattern[0] == '*')
            result[0][1] = true;
        result[0][0] = true;
        
        for(int i=1;i<result.length;i++){
            for(int j=1;j<result[0].length;j++){
                if(pattern[j-1] == '*')
                    result[i][j] = result[i-1][j] || result[i][j-1];
                else if(pattern[j-1] == '?' || pattern[j-1] == text[i-1])
                    result[i][j] = result[i-1][j-1];
                else
                    result[i][j] = false;
            }
        }
        
        return result[result.length-1][result[0].length-1];
    }
    
    public static void main(String[] args)
    {
        String tex = "baaabab";
        String pat = "??a";
        char[] text = tex.toCharArray();
        char[] pattern = pat.toCharArray();
        
        System.out.println(Function(text, pattern));
    }
    
}
