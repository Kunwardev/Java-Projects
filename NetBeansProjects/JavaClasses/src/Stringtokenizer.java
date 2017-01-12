/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.StringTokenizer;

/**
 *
 * @author Kunwar
 */
public class Stringtokenizer
{
    public static void main(String[] args)
    {
        String experimenter = "My-name:is,Kunwar'dev;singh";
        StringTokenizer st = new StringTokenizer(experimenter,"n");
        while(st.hasMoreTokens())
        {
            String x = st.nextToken();
            System.out.println(x);
        }
    }
}
