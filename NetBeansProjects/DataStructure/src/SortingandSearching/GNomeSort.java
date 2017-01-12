
package SortingandSearching;

public class GNomeSort
{
    public static void Gnome(int arr[])
    {
        int i=0;
        while(i<arr.length)
        {
            if(i==0)
                i++;
            if(arr[i-1] <= arr[i])
            {
                i++;
            }
            else
            {
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                i--;
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{6,4,1,2,8,9,10};
        Gnome(arr);
        for(int k: arr)
            System.out.print(k +" ");
    }
}
