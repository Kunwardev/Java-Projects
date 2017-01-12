package Learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pyramidn
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k,i,j,l;
        for(i=1;i<=n;i++)
        {
            for( j=1;j<=n-i;j++)
                System.out.print("  ");
            for(k=1;k<=i;k++)
                System.out.print("* ");//k
            for(l=k-2;l>0;l--)
                System.out.print("* ");//l
            System.out.println();
        }
      
    }
}
