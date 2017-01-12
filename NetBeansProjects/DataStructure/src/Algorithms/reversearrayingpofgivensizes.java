package Algorithms;

import java.util.Scanner;

public class reversearrayingpofgivensizes
{
    
    public static void reverse(int[] arr, int n)
    {
        
            for(int i=0;i<arr.length;i+=n)
            {
                int left = i;
                int right = Math.min(i+n-1, arr.length-1);
                while(left<right)
                {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left ++;
                    right --;
                }
            }
            for(int i: arr)
                System.out.print(i+" ");
            System.out.println("");
    }
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        reverse(arr,n);
    }
}
