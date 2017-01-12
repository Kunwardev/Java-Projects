import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        int T,u,j;
        String a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while(T--!=0)
        {
            a = br.readLine();
            for(u=0,j=a.length()-1;u<j;u++,j--)
            {
                if(a.charAt(u)!=a.charAt(j))
                    break;
            }
            if(u==j)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
