import java.io.*;

public class binaryrecursin 
{
    static int b[] = new int[10];
    static int first = 0;
    static int last = 9;
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter the 10 numbers in ascending order ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++)
            b[i] = Integer.parseInt(br.readLine());
        System.out.print("Type the number to find in the list : ");
        int a = Integer.parseInt(br.readLine());
        binary(a);
    }
    public static void binary(int x)
    {
        int mid = (first +last)/2;
        if(b[mid] == x)
        {
         
            System.out.println("Element found at position "+ mid);

        }
        else if(b[mid]>x)
        {
            last = mid;
            binary(x);
        }
        else
        {
            first = mid;
            binary(x);
        }
    }
}