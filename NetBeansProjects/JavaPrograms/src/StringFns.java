import java.util.*;
import java.io.*;

public class StringFns
{
    public static void main(String[] args)throws IOException
    {
    String x = "hello Java World";
    System.out.println(x.indexOf("Java"));
    System.out.println(x.indexOf("java"));
    System.out.println(x.lastIndexOf("ld"));
    String y ="hello1 Java World";
        System.out.println(x.compareTo(y));
        
    String z = x.replace("Java", "Android");
        System.out.println(z);
        System.out.println(z.contains("Java"));
        String S = "ABC";
        boolean b = S.contains("B");
        boolean c = S.contains("b");
        System.out.println(b);
        System.out.println(c);
//        String n[] = x.split(" ");
//        for (int i = 0; i < x.length()-1; i++) {
//            System.out.println(n[i]);
//        }
        System.out.println();
        StringTokenizer st = new StringTokenizer(x);
//        System.out.println(st.countTokens());
////        System.out.println(st.nextToken());
//        System.out.println(st.nextElement());
//        for(int i=0;i<st.countTokens();i++)
//        {
//            System.out.println(st.nextToken());
//        }
//        System.out.println(st.nextToken());
//        System.out.println(st.nextToken());
        //Reverse of The String 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String q="";
        StringTokenizer st1 = new StringTokenizer(a);
        int count = st1.countTokens();
        StringBuffer sb = new StringBuffer(a);
        System.out.println(sb.append(" Kunwar"));
        System.out.println(sb.reverse());
        System.out.println(sb.capacity());
        
    }
}
