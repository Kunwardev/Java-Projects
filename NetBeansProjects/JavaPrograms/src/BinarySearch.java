import java.io.*;
public class BinarySearch 
{
    int front=0;
    int rear =12;
    int mid;
    int a[]={1,2,4,6,7,9,10,12,15,19,25,30,32};
    public void Search(int c)
    {
        int mid =front+rear/2;
        if(c>a[mid])
        {
            
            front = mid;
            Search(c);
        }
        if(c<a[mid])
        {
            rear = mid;
            Search(c);
        }
        if(c==a[mid])
        {
            System.out.println();
            System.out.println("The element is found at position "+mid);
   
            
        }
    }
    public static void main(String[] args)throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int c=Integer.parseInt(br.readLine());
        BinarySearch B =new BinarySearch();
        B.Search(c);
    }
}
