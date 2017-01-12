/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */
public class stringclass
{
   /* 
    public static String ReverseString(String a)
    {
        
    }
    */
    public static void main(String[] args)
    {
        String a = "aA1pq";
        int x = a.codePointCount(0, a.length());
        int y = a.codePointAt(2);
        int z = a.hashCode();
        String[] p = a.split("1");
        System.out.println(x+"\n"+y+"\n"+z);
        for(int i=0;i<p.length;i++)
            System.out.println(p[i]);
        String w = a.substring(1)+a.substring(0, 1);
        System.out.println(w);
        for(int i=a.length()-1;i>=0;i--)
            System.out.println(i);
        String qp = "";
        for(int i=a.length()-1;i>=0;i--)
            qp = qp.concat(a.charAt(i)+"");
        System.out.println(qp);
    }
}
