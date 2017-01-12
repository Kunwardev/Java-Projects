package PatternMatching;

public class NaivePatternSearch
{
    
    public static void Search(String text,String pattern)
    {
        for(int i=0;i<text.length()-pattern.length();i++)
        {
            int j =0,flag =0;
            if(text.charAt(i) == pattern.charAt(j))
            {
                for(j=0;j<pattern.length();j++)
                {
                    if(text.charAt(i+j) != pattern.charAt(j))
                    {
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0)
                    System.out.println("Position at index "+i);
            }
            
        }
    }
    
    public static void main(String[] args)
    {
        String text = "AABCDEFGHIAA";
        String pattern = "IAF";
        Search(text, pattern);
    }
}
