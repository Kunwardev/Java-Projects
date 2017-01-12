package SortingandSearching;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort
{
    public static void Sort(char arr[])
    {
        int n = arr.length,i;
        char output[] = new char[n];
        int count[] = new int[256];
        Arrays.fill(count,0);
        for(i=0;i<n;++i)
        {
            ++count[arr[i]];
        }
        for(i=1;i<=255;++i)
        {
            count[i] += count[i-1];
        }
        for(i=0;i<n;++i)
        {
            output[count[arr[i]]-1] = arr[i];
            --count[arr[i]];
        }
        for(i=0;i<n;++i)
            arr[i] = output[i];
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String unsorted = in.next();
        char arr[] = unsorted.toCharArray();
        CountingSort cs = new CountingSort();
        cs.Sort(arr);
        for(int i=0;i<arr.length;++i)
            System.out.print(arr[i]);
    }
}
