
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class reversestring
{
    static String input,output;
    static int length;
    static Stack<Character> sta = new Stack<>();
    public static void Reverse(String inp)
    {
        int i;
        length = inp.length();
        for(i=0;i<length;i++)
        {
            sta.push(inp.charAt(i));
        }
        output = "";
        for(i=0;i<length;i++)
        {
            char a = sta.pop();
            output+=a;
        }
    }
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();
        Reverse(input);
        System.out.println(output);
    }
}
