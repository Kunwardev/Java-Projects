package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SieveofErasthoneas
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        Arrays.fill(arr, 0);
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2;i<=n;i++)
        {
            if(arr[i] == 0)
            {
                for(int j=2*i;j<=n;j+=i)
                {
                    arr[j] = 1;
                }
        }
     }
        for(int i=2;i<=n;i++)
        {
            if(arr[i] == 0)
                System.out.print(i+" ");
        }
}
}
