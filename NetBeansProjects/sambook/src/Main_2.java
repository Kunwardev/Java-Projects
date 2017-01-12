
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2
{
    public static void main(String[] args) throws IOException,Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N,K,sum,diff;
        for (int i = 0; i < 10; i++)
        {
            sum = Integer.parseInt(br.readLine());
            diff = Integer.parseInt(br.readLine());
            K = (sum+diff)/2;
            N = (sum-diff)/2;
            System.out.println(K);
            System.out.println(N);
        }
    }
}
