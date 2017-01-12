package SortingandSearching;

public class QuickSort
{
    public static int pivot(int arr[],int low,int high)
    {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int a = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = a;
        return i+1;
    }
    public static void quicksort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int pi = pivot(arr, low, high);
            quicksort(arr, low, pi-1);
            
            quicksort(arr, pi+1, high);
        }
    }   
    public static void main(String[] args)
    {
        int arr[] = new int[]{3,5,1,2,7,4,6};
        quicksort(arr, 0, 6);
        for(int k: arr)
            System.out.print(k+" ");
    }    
}
