package SortingandSearching;

public class InsertionSort
{
    public static void InsertionSort(int arr[])
    {
        int i,key,j;
        for(i=1;i<arr.length;i++)
        {
            key = arr[i];
            j = i-1;
            while(j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{5,4,2,7,8,1};
        InsertionSort(arr);
        for(int j:arr)
            System.out.print(j+" ");
    }
}
