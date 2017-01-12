/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions;

/**
 *
 * @author Kunwar
 */
public class findMinandMaxif56replaceable
{
    private static int Min(String x,String y){
        x = x.replaceAll("6", "5");
        y = y.replaceAll("6", "5");
        System.out.println(x+"  "+ y);
        int p = Integer.parseInt(y);
        int q = Integer.parseInt(x);
        return p+q;
    }
    
    private static int Max(String x,String y){
        x = x.replaceAll("5", "6");
        y = y.replaceAll("5", "6");
        System.out.println(x+"  "+y);
        int p = Integer.parseInt(y);
        int q = Integer.parseInt(x);
        return p+q;
    }
    
    public static void main(String[] args)
    {
        findMinandMaxif56replaceable sample = new findMinandMaxif56replaceable();
        int x = sample.Min("485", "456");
        int y = sample.Max("485", "456");
        System.out.println(x+" "+y);
    }
    
}
