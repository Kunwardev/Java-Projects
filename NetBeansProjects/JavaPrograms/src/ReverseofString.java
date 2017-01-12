import java.io.*;
public class ReverseofString
{
    public static void main(String[] args)throws IOException {
        System.out.println("Type a word: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String p ="";
        for(int i = s.length()-1;i>=0;i--)
        {
            p = p+s.charAt(i);
        }
        System.out.println("Reverse is "+p);
}
}
