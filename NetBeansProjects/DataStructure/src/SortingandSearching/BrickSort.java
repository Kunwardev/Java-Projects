
package SortingandSearching;

public class BrickSort
{
    public static void Method(int arr[])
    {
        boolean sorted = false;
        while(!sorted)
        {
            sorted = true;
            for(int i=0;i<arr.length-1;i+=2)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
            for(int j=1;j<arr.length-1;j+=2)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    sorted = false;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{-9,5,17,2,6,15,-1};
        Method(arr);
        for(int j: arr)
            System.out.print(j+" ");
    }
}
