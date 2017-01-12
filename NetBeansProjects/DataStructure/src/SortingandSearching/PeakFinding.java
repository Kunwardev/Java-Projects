
package SortingandSearching;

public class PeakFinding
{
    public static int Peak(int arr[],int low,int high)
    {
        int mid = low+(high-low)/2;
        if(mid == 0 || arr[mid-1]<=arr[mid] && mid == arr.length-1 || arr[mid+1] <= arr[mid])
            return mid;
        else if(arr[mid] > arr[mid+1])
            return Peak(arr, low,mid-1);
        else
            return Peak(arr,mid+1,high);
    }
    
    public static int GlobalPeak(int arr[])
    {
        int max = 0;
        for(int i=1;i<arr.length;i++)
        if(arr[max] < arr[i])
            max = i;
        return max;
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[] {10, 20, 15, 2, 23, 12, 67};
        int x = Peak(arr, 0, 7);
        System.out.println(arr[x]);
        int y = GlobalPeak(arr);
        System.out.println(arr[y]);
    }
}
