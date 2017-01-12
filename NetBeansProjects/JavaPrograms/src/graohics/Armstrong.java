package graohics;
import java.io.*;
public class Armstrong
{
    public static void main(String[] args) throws IOException
    {
    int n=0,sum=0,armstrong=0;
        System.out.print("Enter the number to see if its armstrong: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        armstrong = n;
        while(n!=0)
        {
            int x = n%10;
            sum = sum+(x*x*x);
            n=n/10;
        }
        if(sum == armstrong)
        {
            System.out.println("The Number is Armstrong");
        }
}
}
