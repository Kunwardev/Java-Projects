
package geeksforgeeks;

import java.util.*;

class Term{
    int x,y;
    public Term(int a,int b)
    {
        x = a;
        y = b;
    }
}

public class FareySequence
{
    public static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
    
    boolean comp(Term e,Term f)
    {
        return e.x * f.y < f.x * e.y;
    }
    
    public static void main(String[] args)
    {
        int n,i,j;
        System.out.println("Enter the 'n' for the sequence: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        ArrayList<Term> fs = new ArrayList<>();
        for(i=1;i<n;i++)
        {
            for(j=i+1;i<n;i++)
            {
                if(gcd(i,j)==1)
                    fs.add(new Term(i,j));
            }
        }
        for(i=0;i<5;i++)
            System.out.println(fs);
    }
}
