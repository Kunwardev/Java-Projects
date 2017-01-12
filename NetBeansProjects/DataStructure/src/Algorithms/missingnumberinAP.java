
package Algorithms;

public class missingnumberinAP
{
    public static int find(int arr[])
    {
        int diff,n = arr.length;
        diff = (arr[n-1] - arr[0])/n;
        int start = 0,end = n,mid = (start+end)/2;
        while(true)
        {
            if(arr[mid+1] - arr[mid] != diff)
                return (arr[mid] + diff);
            if(mid>0 && arr[mid] - arr[mid-1] != diff )
                return (arr[mid-1] + diff);
            if(arr[mid] == arr[0] + arr[mid]*diff)
                end = mid-1;
            else
                start = mid+1;
            
                mid = (start+end)/2;
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {2,4,8,10,12};
        int y = find(arr);
        System.out.println(y);
    }
}
