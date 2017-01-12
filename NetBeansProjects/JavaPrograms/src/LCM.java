import java.io.*;
public class LCM
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int large = a>=b?a:b;
        int small;
        if(large ==a)
            small =b;
        else
            small =a;
        for(int i=1;i<=small;i++)
        {
            if(large*i%small == 0)
            {
                System.out.println("The L.C.M of the two numbers is "+(large*i));
                break;
            }
        }
    }
}
