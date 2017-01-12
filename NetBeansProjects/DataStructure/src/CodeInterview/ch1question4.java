package CodeInterview;
import java.util.Arrays;
public class ch1question4
{
    public static boolean checkMatch(String a, String b)
    {
        int ab[] = new int[256];
        Arrays.fill(ab,0);
        for(int i=0;i<a.length();i++)
            ab[a.charAt(i)]++;
        for(int j=0;j<b.length();j++)
            ab[b.charAt(j)]--;
        for(int i=0;i<256;i++)
            if(ab[i] != 0)
                return false;
        return true;
    }
    
    public static void main(String[] args)
    {
        System.out.println(checkMatch("iceman", "cinemaa"));
    }
    
}
