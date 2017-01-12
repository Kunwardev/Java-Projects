
package SortingandSearching;

public class MaxHeapify
{
    public static void maxHeapify(int arr[],int n,int i)
    {
        int largest = i;
        int Left = 2*i+1;
        int Right = 2*i+2;
        if(Left < n && arr[largest] > arr[Left])
            largest = Left;
        if(Right < n && arr[largest] > arr[Right])
            largest = Right;
        if(largest != i)
        {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            maxHeapify(arr, n, largest);
        }
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{27, 17, 3, 16, 13, 10, 1, 5, 7, 12, 4, 8, 9,0};
        int n = arr.length;
        int i = 2;
        maxHeapify(arr, n, i);
        for(int k: arr)
            System.out.print(k+ " ");
    }
    
}
