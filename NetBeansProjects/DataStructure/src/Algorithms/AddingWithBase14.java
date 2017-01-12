
package Algorithms;

public class AddingWithBase14
{
    
    public static int convertToNumber(char x)
    {
        if(x >= '0' && x <= '9')
            return x - '0';
        return x - 'A' + 10;
    }

    public static char converToChar(int x)
    {
        if(x >= 0 && x <= 9)
            return (char) (x + '0');
        return (char) (x - 10 + 'A');
    }
    
    public static String add(String a, String b)
    {
        if(a.length() != b.length())
        {
            System.out.println("Both the Representation should be of same length");
            return null;
        }
        String result="";
        int z,x,y,carry=0;
        for(int i=a.length()-1;i>=0;i--)
        {
            x = convertToNumber(a.charAt(i));
            y = convertToNumber(b.charAt(i));
            System.out.println(a.charAt(i)+"->"+x+" "+b.charAt(i)+"->"+y);
            z = x+y+carry;
            {
                carry = z/14;
                z = z%14;
            }
            result = converToChar(z) + result;
            System.out.println(carry+" "+z+" "+result);
        }
        if(carry > 0)
            result = converToChar(carry)+result;
        return result;
    }
    
    public static void main(String[] args)
    {
        String a = "12A";
        String b = "CD3";
        String c = add(a, b);
        System.out.println(c);
    }
    
}
