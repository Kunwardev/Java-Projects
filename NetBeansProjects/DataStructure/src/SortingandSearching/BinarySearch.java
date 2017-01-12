
package SortingandSearching;

public class BinarySearch
{
    public static int binsearch(int arr[],int x)
    {
        int mid,low =0,high = arr.length-1;
        mid = (low+high)/2;
        
        while(low<=high)
        {
            if(arr[mid] > x)
                high = mid-1;
            else if(arr[mid]<x)
                low = mid+1;
            else
                break;
            mid = (low+high)/2;
        }
        if(arr[mid] == x)
            return mid;
        return -1;
    }        
    public static void main(String[] args)
    {
        int arra[] = new int[]{1,5,12,16,19,21,25};
        System.out.println((binsearch(arra, 30)));
    }
}
