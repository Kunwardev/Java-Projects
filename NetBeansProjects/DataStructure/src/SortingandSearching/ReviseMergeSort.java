
package SortingandSearching;

public class ReviseMergeSort
{
    public static void Merge(int arr[],int l,int m,int r)
    {
        int n1 = m-l+1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for(int i=0;i<n1;i++)
            L[i] = arr[l+i];
        for(int j=0;j<n2;j++)
            R[j] = arr[m+1+j];
        int i=0,j=0,k=l;
        while(i < n1 && j < n2)
        {
            if(L[i] <= R[j])
            {
                arr[k] = L[i]; 
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k] = L[i];
            i++;k++;
        }
        while(j<n2)
        {
            arr[k] = R[j];
            k++;j++;
        }
    }
    
    public static void Sort(int arr[],int l,int r)
    {
        if(l < r)
        {
            int mid = (l + r)/2;
            Sort(arr,l,mid);
            Sort(arr,mid+1,r);
            Merge(arr, l, mid, r);
        }
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{3,2,5,6,7,8,9,1,10,4};
        Sort(arr,0,9);
        for(int i: arr)
            System.out.print(i+" ");
    }
    
}
