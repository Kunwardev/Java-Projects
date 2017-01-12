
public class Binarysearch
{
    static int search(int arr[],int x,int low,int high)
    {
        int mid = (low+high)/2;
        if(low>high)
            return 0;
        if(arr[mid] == x)
            return mid;
        else
            if(arr[mid]>x)
                return search(arr,x,low,mid-1);
        else
                return search(arr,x,mid+1,high);
    }
    
    public static void main(String[] args)
    {
        int arry[] = {4,6,7,12,16,18,19,25,15};
        int k = 4;
        System.out.println(search(arry,k,0,arry.length-1));
    }
}
