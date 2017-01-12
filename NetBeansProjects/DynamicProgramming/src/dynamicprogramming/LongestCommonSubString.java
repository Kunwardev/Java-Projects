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
public class LongestCommonSubString
{
    public static void Function(String s, String t){
        int string[][] = new int[s.length()+1][t.length()+1];
        for(int i=0;i<=s.length();i++)
            string[i][0] = 0;
        for(int j=0;j<=t.length();j++)
            string[0][j] = 0;
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=t.length();j++){
                if(s.charAt(i-1) == t.charAt(j-1))
                    string[i][j] = 1 + string[i-1][j-1];
                else
                    string[i][j] = 0;
            }
        }
        int max = 0;
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=t.length();j++){
                if(string[i][j] > max)
                    max = string[i][j];
            }
        }
        
        String resul = "";int flag = 0;
        System.out.println(max);
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=t.length();j++){
                if(string[i][j] == max){
                    int num = max;
                    if(flag == 1)
                        break;
                    while(num != 0){
                        resul = s.charAt(--i)+resul;
                        num--;
                        flag = 1;
                    }
                }
            }
        }
        System.out.println(resul);
    }
    
    public static void main(String[] args)
    {
        Function("abcdaf", "zbcdf");
    }
    
}
