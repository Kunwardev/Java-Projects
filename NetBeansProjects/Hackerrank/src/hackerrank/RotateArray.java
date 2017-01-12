package hackerrank;

import java.util.Scanner;

public class RotateArray
{
    static int N,K,Q;
    
   
    public static void main(String[] args)
    {
        int i,j;
        Scanner s = new Scanner(System.in);
        N = Integer.parseInt(s.next());
        K = Integer.parseInt(s.next());
        Q = Integer.parseInt(s.next());
        int array[] = new int[N];
        int temp[] = new int[K];
        for( i=0;i<N;i++)
            array[i] = Integer.parseInt(s.next());
        for( i =N-K,j=0;i<N;j++,i++)
        {
            temp[j] = array[i];
        }
        for(i=N-K-1;i>=0;i--)
            array[i+K] = array[i];
        for(i=0;i<K;i++)
            array[i] = temp[i];
        int idx;
        while(Q>0)
        {
            idx = Integer.parseInt(s.next());
            System.out.println(array[idx]);
            Q--;
        }
    }
}
