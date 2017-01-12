import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LightHouse {

    public static boolean isSafe(char arr[][],int k,int l,int m)
        {
       if(k<1 && l<1 && k>=m-1 && l>=m-1)
           return false;
        return true;
    }
    
    
    public static int Euclidean(char arr[][],int k,int l,int n)
        {
        int arrr[][] = new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                arrr[i][j] = -1;
        arrr[k][l] = 0;
        for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
                {
                if(arr[i][j] == '.')
                    arrr[i][j] =(int) Math.sqrt(Math.pow(k-i,2)+Math.pow(l-j,2));
            }
        }
        int maxR = 0,r=0;
        boolean checker = true;
        for(int m=0;m<n;m++)
        {
            r = CheckPalindrome(arrr, m, n, r);
            checker = checker &((r>1));
        }
        if(checker)
            maxR = Math.max(r,maxR);
        
        System.out.println();
        /*for(int p=0;p<n;p++)
            {
            for(int q=0;q<n;q++)
                System.out.print(arrr[p][q] + " ");
            System.out.println();
        }*/
        return maxR;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String arr[] = new String[n];
        char arrr[][] = new char[n][n];
        for(int i=0;i<n;i++)
            arr[i] = in.next();
        for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
            {arrr[i][j] = arr[i].charAt(j);
              //  System.out.print(i+" "+j);
            }
        }
        int r = 0;
        for(int k=0;k<n-1;k++)
            {
            for(int l=0;l<n-1;l++)
                {
                if(arrr[k][l] == '.')
                    {          
                        r = Math.max(r,Euclidean(arrr,k,l,n));
                       // System.out.println(r);
                    
                }
            }
        }
        System.out.println(r);
    }

    private static int CheckPalindrome(int[][] arrr, int m,int n,int r)
    {
        int p=0;
        for(int i=0,j=n-1;i<n;i++,j--)
        {
            if(arrr[m][i] == arrr[m][j])
            {
                p = Math.max(arrr[m][i], arrr[m][j]);
                r = Math.max(r,p);
                //System.out.print(r+" ");
            }
            else
            {
                return 0;
            }
            if(i==j && arrr[i][j] == 0)
            {
                return r;
            }
        }
        return -1;
    }
}