
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondClass
{

    public static void main(String[] args) throws IOException
    {
        int a[] = new int[10];
        System.out.println("Enter 10 Numbers to find the Second largest: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
        {
            a[i] = Integer.parseInt(br.readLine());
        }
        int largest = 0, secondLargest = 0;
        for (int i = 0; i < 10; i++)
        {
            if (a[i] > largest)
            {
                secondLargest = largest;
                largest = a[i];
            }
        }
        System.out.println("The Second Largest number is : " + secondLargest);
    }

}
