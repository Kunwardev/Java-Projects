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
public class MatrixMultiplicationParenthesis
{
    static int m[][];
    static int b[][];
    
    public static int MatrixChainOrder(int p[])
    {
        int n = p.length;
        m = new int[n][n];
        b = new int[n][n];
        for(int i=0;i<n;i++)
            m[i][i] = 0;
 //i
        for(int l=2;l<n;l++)
        {
        //j
            for(int i=1;i<n-l+1;i++)
            {
            //k
                int j = i+l-1;
                if(j==n)
                    continue;
                m[i][j] = Integer.MAX_VALUE;
                int q;
                for(int k=i;k<j;k++)
                {
                    q = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];
                    if(q < m[i][j])
                    {
                        m[i][j] = q;
                        b[i][j] = k;
                    }
                }
        }
            
    }return m[1][n-1];}
    static String res = "";
    public static void PrintOptimal(int i,int j)
    {
        if(i==j)
            res += "A"+i;
        else
        {
            res += "(";
            PrintOptimal(i,b[i][j]);
            PrintOptimal(b[i][j]+1,j);
            res += ")";
        }
    }
    
    public static void main(String[] args)
    {
        int p[] = new int[]{30,35,15,5,10,20,25};
        int x = MatrixChainOrder(p);
        System.out.println(x);
        PrintOptimal(1,p.length-1);
        System.out.println(res);
        for(int k=0;k<5;k++)
        {
            for(int l=0;l<5;l++)
                System.out.print(b[k][l]);
            System.out.println("");
        }
        //PrintOptimal(1, 2);
    }
    
}
