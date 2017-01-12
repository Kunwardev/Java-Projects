import java.io.*;
import java.util.*;

public class FindMaximumIndexProduct {

    public static int IndexProduct(int i,int arr[],int N,int num)
        {
        if(num == 1)
            {
            return (N-2)*N;
        }
        else{
        int j=i-1,k=i+1,reservej=-1,reservek=-1;
        if(i == 0)
            return 0;
        else if(i == N-1)
            return 0;
        else
            {
            while(arr[j] < arr[i] && j>0)
                j--;
            while(arr[k] < arr[i] && k<=N)
                k++;
            reservej = j;
            reservek = k;
        }
        if(arr[j] > arr[i] && arr[k] > arr[i])
            return (reservej * reservek);
        }
        return 0;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max= -1;
        int arr[] = new int[N+2];
        arr[0] = -1;
        for(int i=1;i<=N;i++)
            arr[i] = sc.nextInt();
        int num=1;
        for(int k=2;k<=N;k++)
            {
            int flag = arr[k-1];
            if(flag > arr[k])
                {
            num = 0;
            break;
        }
        }
        for(int l=0;l<N;l++)
            max = Math.max(max,IndexProduct(l,arr,N,num));
        System.out.println(max);
    }
}