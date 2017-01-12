import java.io.*;
import java.util.*;

public class NewYearChaos {

    public static long Bribes(long arr[],int n)
        {
        long sum = 0;long bribes = 0;
        for(int i=0;i<n;i++)
            {
            if(arr[i] == i+1)
                {}
            else if(arr[i] > i+1)
                {
                bribes = arr[i] - (i+1);
                if(bribes > 2)
                    return -1;
                else
                    {
                   // System.out.println(bribes);
                    sum+=bribes;
                    bribes = 0;
                }
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        long T,result;int n;
        Scanner in = new Scanner(System.in);
        T = in.nextLong();
        while(T-- > 0)
            {
            n = in.nextInt();
            long arr[] = new long[n];
            for(int i=0;i<n;i++)
                {
                arr[i] = in.nextLong();
            }
            result = Bribes(arr,n);
            if(result == -1)
                System.out.println("Too chaotic");
            else
                System.out.println(result);
        }
    }
}