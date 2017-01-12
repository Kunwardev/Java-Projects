/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Kunwar
 */
public class CoPrimePowerSum
{
    public static int check(int arr[], int l,int m,int z)
    {
        for(int i=0;i<l;i++)
        {
            if(arr[l] < m && (z*arr[l]) % arr[i] == 0)
                return 0;
        }
        return 1;
    }
    public static void main(String[] args)
    {
        int Q;
        Scanner in = new Scanner(System.in);
        Q = in.nextInt();
        for(int i=0;i<Q;i++)
        {
            double sum = 0;
            double subsum = 0;
            int N = in.nextInt();
            int k = in.nextInt();
            int m = in.nextInt();
            int arr[] = new int[N];
            for(int p=0;p<N;p++)
                arr[p] = in.nextInt();
            for(int j=1;j<=m;j++)
                sum += Math.pow(j,k);
            for(int l=0;l<N;l++)
            {
                int z = 1;
                while(z * arr[l] <= m)
                {
                    if(check(arr, l, m,z) == 0)
                    {
                        z++;
                        continue;
                    }    
                    subsum += Math.pow((z*arr[l]),k);
                    z++;
                }
            }
            int p = (int) ((sum-subsum)%1000000007);
        }
    }
}
