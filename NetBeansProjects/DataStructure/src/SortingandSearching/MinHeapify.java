
package SortingandSearching;

public class MinHeapify
{
    public static void Method(int arr[],int n,int i)
    {
        int smallest = i;
        int Left = 2*i+1;
        int Right = 2*i+2;
        if(smallest < n && arr[smallest] <= arr[Left])
        {
            //System.out.println(smallest+" "+Left+" "+Right);
            smallest = Left;
        }
        if(smallest < n && arr[smallest] <= arr[Right])
        {
            //System.out.println(smallest+" "+Left+" "+Right);
            smallest = Right;
        }
        if(smallest != i)
        {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            Method(arr, n, smallest);
        }
    }
    
    public static void SORT(int arr[])
    {
        for(int i=(arr.length)/2-1;i>=0;i--)
        {
            Method(arr, arr.length, i);
        }
        for(int i=arr.length-1;i>=1;i--)
        {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            Method(arr, i, 0);
        }
        for(int j: arr)
            System.out.print(j+" ");
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{5,7,1,2,9,10};
        int n = arr.length;
        SORT(arr);
    }
    
}
