
import java.util.StringTokenizer;
import java.io.*;
public class aive
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x,y;
        int z;
        String as = "The role of computer software has undergone significant change over the last\n" +
"half-century. Dramatic improvements in hardware performance, profound changes\n" +
"in computing architectures, vast increases in memory and storage capacity, and a\n" +
"wide variety of exotic input and output options, have all precipitated more sophisticated\n" +
"and complex computer-based systems. Sophistication and complexity can\n" +
"produce dazzling results when a system succeeds, but they can also pose huge\n" +
"problems for those who must build complex systems. .";
        StringTokenizer st = new StringTokenizer(as);
        z = st.countTokens();
        if(z%2==1)
        {
            as = as + " .";
            StringTokenizer st1 = new StringTokenizer(as);
            z = st1.countTokens();
             while(st1.hasMoreElements()==true)
        {
            x = st1.nextToken();
            System.out.print(x);
            y = st1.nextToken();
            System.out.print(" "+y);
        System.out.println();
}
        }
    /*
        while(st.hasMoreElements()==true)
        {
            x = st.nextToken();
            System.out.print(x);
            y = st.nextToken();
            System.out.print(" "+y);
        System.out.println();
}*/
}

}