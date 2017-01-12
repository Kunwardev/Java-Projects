
package Algorithms;

public class FindmaxnumberwithKswaps
{
    
    public static void main(String[] args)
    {
        int x = 729158;
        MaxNu(x, 1, x);
    }
    
    public static int changetoNumber(int[] arr)
    {
        int n = 0;
        int y = arr[n];
        while(n+1 != arr.length)
        {
            y = y*10+arr[n+1];
            n++;
        }
        
        return y;
    }
    
    public static void MaxNu(int x,int K,int Max)
    {
        int p = Integer.toString(x).length();
        int arr[] = new int[p];
        int num = x;
        int i=p-1;
        while(num!=0)
        {
            arr[i] = num%10;
            num/=10;
            i--;
        }
        
        for(int y=0;y<K;y++)
        {
            int index = y;
            for(int j=y+1;j<arr.length;j++)
                if(arr[index] < arr[j])
                {
                    index = j;
                }
            System.out.println(y+" "+index);
            int temp = arr[y];
            arr[y] = arr[index];
            arr[index] = temp;
        }
        
        int z = changetoNumber(arr);
        System.out.println(z);
    }
    
}
