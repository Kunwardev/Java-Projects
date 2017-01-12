package Algorithms;

public class LargestDifferenceinIncreasingIndexes
{
    public static int largestDifference(int []arr)
    {
        int largestdiff = 0;
        for(int i = 0;i<arr.length;i++)
        {
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[j] > arr[i])
                {
                    if(j-i > largestdiff)
                        largestdiff = j-i;
                }
            }
        }
        return largestdiff;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{1,2,3,4,6,-1,7,-8,10};
        
        int x = largestDifference(arr);
        System.out.println(x);
    }
}
