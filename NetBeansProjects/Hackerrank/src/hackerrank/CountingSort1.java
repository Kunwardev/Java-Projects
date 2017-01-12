package hackerrank;

import java.io.*;
import java.util.*;

public class CountingSort1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;
        int arr[] = new int[100];
        Arrays.fill(arr,0);
        for(int i=0;i<n;i++)
            {
            x =sc.nextInt();
            arr[x]++;
        }
        for(int y:arr)
            System.out.print(y+" ");
    }
}