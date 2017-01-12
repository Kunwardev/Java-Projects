package Learn;

import java.util.stream.IntStream;

public class usesofstring
{
    public static void main(String[] args)
    {
        String a = "Hello world";
        int x = a.codePointAt(3);
        char y = a.charAt(3);
        IntStream z = a.chars();
        byte q[] = new byte[10];
        q = a.getBytes();
        Boolean s = a.endsWith("d");
        System.out.println("Byte: "+q); 
        System.out.println(s);
        System.out.println(a);
        System.out.println("Codepoint at 3: "+x);
        System.out.println(z);
    }
}
