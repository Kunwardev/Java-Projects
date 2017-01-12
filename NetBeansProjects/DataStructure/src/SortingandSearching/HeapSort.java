
package SortingandSearching;

public class HeapSort
{
    public static void Heapify(int arr[],int n,int i)
    {
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l<n && arr[l] > arr[largest])
            largest = l;
        if(r<n && arr[r] > arr[largest])
            largest = r;
        if(largest != i)
        {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            Heapify(arr,n,largest);
        }
    }
    
    public static void Print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println("");
    }
    
    public static void SOrt(int arr[])
    {
        for(int i=arr.length/2-1;i>=0;i--)
            Heapify(arr, arr.length,i);
        for(int i=arr.length-1;i>=0;i--)
        {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            Heapify(arr, i,0);
        }
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{4,1,3,2,16,9,10,14,8,7};
        SOrt(arr);
        Print(arr);
    }
    
}
