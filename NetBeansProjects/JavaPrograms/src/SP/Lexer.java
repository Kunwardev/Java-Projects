package SP;
import java.io.*;

public class Lexer 
{   
    public static void main(String[] args) throws IOException
    {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    if(s == "case")
        System.out.println("Success");
    }
}
