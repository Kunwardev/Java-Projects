package SortingandSearching;

public class SelectionSort
{
    public static void Sort(int arr[])
    {
        int min_idx;
        for(int i=0;i<arr.length-1;i++)
        {
            min_idx = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min_idx] > arr[j])
                    min_idx = j;
            }
            int tmep = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = tmep;
        }
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{5,3,1,7,8,4,2};
        Sort(arr);
        for(int k: arr)
            System.out.print(k+ " ");
    }
    
}
