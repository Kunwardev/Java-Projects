import java.io.*;
public class Amritsar 
{
    public static void main(String[] args)throws IOException
    {
        
    String s = "ABCDE";
        for (int i = 0; i < s.length(); i++) 
        {
            String s1 = s.substring(4,5);
            String s2 = s.substring(0,4);
            s = s1+s2;
            System.out.println(s);
        }//Count the Number of words
    String a = "Hello World";
    for(int i=0;i<a.length();i++)
    {
        int counter = 0;
        for(int j=0;j<a.length();j++)
        {
            if(a.charAt(i) == a.charAt(j))
            {
                counter = counter+1;
            }
           
            
        } System.out.println("The number of times "+a.charAt(i)+" occurs is "+counter);
       
    }
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    String x = br.readLine();
    String y = x.trim();
    int coun = 0;
    for (int i = 0; i < y.length()-1; i++)
        {
            if(y.charAt(i)==' '&&y.charAt(i+1)!=' ')
            {
                coun++;
            }
        }
    if(y.isEmpty())
        coun = 0;
    System.out.println("Total number of Words Are "+(coun+1));
}
}
