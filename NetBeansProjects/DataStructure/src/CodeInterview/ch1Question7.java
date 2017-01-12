
package CodeInterview;

import java.util.Arrays;

public class ch1Question7
{
    public static void Change(int [][] mat)
    {
        int[] row = new int[mat.length];
        int[] col = new int[mat[0].length];
        Arrays.fill(row,0);
        Arrays.fill(col,0);
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j] == 0)
                {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(row[i] == 1 || col[j] == 1)
                {
                    mat[i][j] = 0;
                }
    }
}}
    public static void main(String[] args)
    {
        int mat[][] = {{1,2,3},{0,1,3},{1,0,1},{2,2,2}};
        Change(mat);
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
                System.out.print(mat[i][j]);
            System.out.println("");
        }
    }
}
