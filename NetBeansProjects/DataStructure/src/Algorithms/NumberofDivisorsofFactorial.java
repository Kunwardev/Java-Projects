
package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class NumberofDivisorsofFactorial
{
    public static int Solution(int n)
    {
        Scanner sc = new Scanner(System.in);
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
        LegendreFormula ndf = new LegendreFormula();
        int count = 0,result=1;
        for(int i=2;i<=n;i++)
        {
            if(arr[i] == 0)
            {
                count += ndf.method(n,i);
                result = result *( count+1);
            }
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        int n,p;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        //p = in.nextInt();
        int count = Solution(n);
        System.out.println(count);
    }
    
}
