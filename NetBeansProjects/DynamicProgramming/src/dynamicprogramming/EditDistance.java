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
public class EditDistance
{
    
    public static void main(String[] args)
    {
        String s1 = "Sunday";
        String s2 = "Saturday";
        Function(s1, s2);
    }
    
    public static int min(int x,int y,int z){
        if(x < y && x < z)
            return x;
        if(y < x && y < z)
            return y;
        else
            return z;
    }
    
    public static void Function(String s1, String s2){
        int mat[][] = new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<=s1.length();i++)
            mat[i][0] = i; 
        for(int j=0;j<=s2.length();j++)
            mat[0][j] = j;
        for(int i=1;i<=s1.length();i++)
        {
            for(int j=1;j<=s2.length();j++)
            {
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    mat[i][j] = mat[i-1][j-1];
                else
                {
                    mat[i][j] = 1 + min(mat[i-1][j], mat[i-1][j-1], mat[i][j-1]);
                }
            }
        }
        int m = s1.length();
        int n = s2.length();
        System.out.println(mat[m][n]);
    }
}
