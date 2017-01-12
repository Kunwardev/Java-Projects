import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UnexpetedProblem {

    public static String[] converter(String input)
        {
        int length = input.length();
        int nu = 1<<length;int k=0;
        String[] permute = new String[nu];
        String sub = "";
        for(int c = 0 ; c < length ; c++ )
      {
         for(int i = 1 ; i <= length - c ; i++ )
         {
            sub = input.substring(c, c+i);
            permute[k] = sub;
             k++;
         }
      }
        return permute;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        long M;
        String input = in.next();
        M = in.nextLong();
        String inputArray[] = converter(input);
        long count =1;
        for(int i=0;i<inputArray.length;i++)
            {
            if(inputArray[i] == null)
                {}
            else
                {
                if((inputArray[i]+input).equals(input + inputArray[i]))
                    {
                    long stringleng = inputArray[i].length();
                    long x = stringleng;
                    while(stringleng < M)
                        {
                        stringleng = x + stringleng;
                        count = (count+1)%1000000007;
                    }
                }
            }
        }
        System.out.println(count);
    }
}