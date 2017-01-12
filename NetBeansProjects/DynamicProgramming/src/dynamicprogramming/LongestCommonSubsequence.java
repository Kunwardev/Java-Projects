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
public class LongestCommonSubsequence
{
    static int count[][];
    static char direc[][];
    
    public static void LCS(char b[],char c[])
    {
        count = new int[b.length+1][c.length+1];
        direc = new char[b.length+1][c.length+1];
        int i,j;
        for(i=0;i<=b.length;i++)
        {
            count[i][0] = 0;direc[i][0] = '?';
        }
        for(j=0;j<=c.length;j++)
        {
            count[0][j] = 0;direc[0][j] = '?';
        }
        for(i=1;i<=b.length;i++)
        {
            for(j=1;j<=c.length;j++)
            {
                if(b[i-1] == c[j-1])
                {
                    count[i][j] = count[i-1][j-1] + 1;
                    direc[i][j] = '\\';
                }
                else 
                {if(count[i-1][j] >= count[i][j-1])
                {
                    count[i][j] = count[i-1][j];
                    direc[i][j] = '|';
                }
                else{
                    count[i][j] = count[i][j-1];
                    direc[i][j] = '-';
                }}
            }
    }}
    
    public static void Print(char b[],int i,int j)
    {
        if(i==0 || j==0)
            return;
        if(direc[i][j] == '\\')
        {
            Print(b,i-1,j-1);
            System.out.print(b[i-1]);
        }
        else if(direc[i][j] == '-')
            Print(b,i,j-1);
        else
            Print(b,i-1,j);
    }
    
    public static void main(String[] args)
    {
        
        char x[] = new char[]{'B','D','C','A','B'};
        char y[] = new char[]{'A','B','C','B'};
        LCS(x,y);
        for(int i=0;i<=x.length;i++)
        {
            for(int j=0;j<=y.length;j++)
            {
                System.out.print(count[i][j]);
            }
            System.out.println("");
        }
        for(int i=0;i<=x.length;i++)
        {
            for(int j=0;j<=y.length;j++)
             {
                System.out.print(direc[i][j]);
            }
            System.out.println("");
        }
        for(char a: x)
            System.out.print(a+" ");
        System.out.println("");
        for(char a: y)
            System.out.print(a+" ");
        System.out.println("");
        Print(x, x.length,y.length);
    }
    
}
