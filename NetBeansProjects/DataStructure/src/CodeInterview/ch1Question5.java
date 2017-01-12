
package CodeInterview;

public class ch1Question5
{
    public static String replaceSpace(String a)
    {
        String x = "";
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i) != ' ')
                x += a.charAt(i);
            else
                x += "%20";
        }
        return x;
    }
    
    public static void main(String[] args)
    {
        String x = replaceSpace("Hello My name is Kunwar.");
        System.out.println(x);
    }
    
}
