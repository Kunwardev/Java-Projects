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
public class SpiralSquaredNMatrix
{ 
    private static void Function(int[][] mat,int rowhigh,int colhigh){
        int x = rowhigh * colhigh;
        int i, p = 0,q = 0;
        while(p < rowhigh && q < colhigh){
            for(i=q;i<colhigh;i++){
                mat[p][i] = x;
                x--;
                System.out.println("First"+x);
            }p++;
            for(i=p;i<rowhigh;i++){
                mat[i][colhigh-1] = x;
                x--;
                System.out.println("Second" + x);
            }colhigh--;
            if(p < rowhigh){
                for(i=colhigh-1;i>=q;i--){
                    mat[rowhigh-1][i] = x;
                    x--;
                    System.out.println("Third"+x);
                }rowhigh--;
            }
            if(q < colhigh){
                for(i=rowhigh-1;i>=p;i--){
                    mat[i][q] = x;
                    x--;
                }q++;
            }
        }
    }
  /*  
    static int i, k = 0, l = 0;
 
    /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
    
    
private static void Function(int a[][],int m,int n){
    int x = n*m;
    while (k < m && l < n)
    {
        /* Print the first row from the remaining rows 
        for (i = l; i < n; ++i)
        {
            a[k][i] = x;
            x--;
        }
        k++;
 
        /* Print the last column from the remaining columns 
        for (i = k; i < m; ++i)
        {
            a[i][n-1] = x;
            x--;
        }
        n--;
 
        /* Print the last row from the remaining rows 
        if ( k < m)
        {
            for (i = n-1; i >= l; --i)
            {
                a[m-1][i] = x;
                x--;
            }
            m--;
        }
 
        /* Print the first column from the remaining columns 
        if (l < n)
        {
            for (i = m-1; i >= k; --i)
            {
                a[i][l] = x;
                x--;
            }
            l++;    
        }        
    }
}
    */
    public static void main(String[] args)
    {
        int mat[][] = new int[5][5];
        Function(mat, 5, 5);
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(mat[i][j]+" ");
            }System.out.println();
        }
    }
    
}
