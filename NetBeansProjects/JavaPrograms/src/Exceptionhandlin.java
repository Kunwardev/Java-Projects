import java.io.*;

public class Exceptionhandlin 
{
    public static void main(String[] args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Name : ");
        try
        {
            String name = br.readLine();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Hello "+i);
        }
//        System.out.println(name);
    }
}
