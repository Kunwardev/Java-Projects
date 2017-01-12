
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */
public class Challengemontecarlo
{
    static final int B = 1;
    static final int W = 2;
    public static void main(String[] args)
    {
        Scanner i = new Scanner(System.in);
        System.out.println("Number of Test Cases: ");
        double res = Marble(100);
        System.out.println("The Probability is "+ res);
        res = Marble(1000);
        System.out.println("The Probability is "+ res);
        res = Marble(1500);
        System.out.println("The Probability is "+ res);        
    }
    
    public static double Marble(double chances)
    {
        double success = 0;
        Random r = new Random();
        int bowl[] = {B,B,B,W,W,W};
        int newbowl[] = new int[3];
        for(int i=0;i<chances;i++)
        {
            int j=0;
            while(j<3)
            {
                int p = r.nextInt(6);
                int q = r.nextInt(6);
                int s = r.nextInt(6);
                if(p==q)
                    p = r.nextInt(6);
                if(q == s)
                    q = r.nextInt(6);
                if(s == p)
                    s = r.nextInt(6);
                newbowl[j] = bowl[p];
                j++;
                newbowl[j] = bowl[q];
                j++;
                newbowl[j] = bowl[s];
                j++;
            }
            if(newbowl[0] == 1 && newbowl[1] == 1 && newbowl[2] == 1)
            {
                success++;
            }
        }
        return (success/chances);
    }
    
}
