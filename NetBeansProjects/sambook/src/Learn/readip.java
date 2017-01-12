
package Learn;

import java.util.*;
import java.io.*;

public class readip
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("Entered String is "+a);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = br.readLine();
        System.out.println("New Entered String is "+a);
    }
}
