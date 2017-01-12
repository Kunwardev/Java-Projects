
package Sudo;

import javax.swing.JTextField;

public class funcheck
{
    public static void main(String[] args)
    {
        /*sudo s = new sudo();
         int a[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
         int x = s.func(a);
         System.out.println(x);*/
        int a[][] = {{8,1,2,9,5,7,3,4,6},
                     {4,3,9,2,6,8,7,5,1},
                     {6,7,5,1,3,4,2,9,8}
                    ,{5,2,7,6,8,9,1,3,4},
                     {9,6,4,5,1,3,8,2,7}
                    ,{1,8,3,4,7,2,5,6,9}
        ,            {3,9,8,7,4,5,6,1,2}
                    ,{2,5,6,8,9,1,4,7,3}
                    ,{7,4,1,3,2,6,9,8,5}};
        
     }
    
    public boolean check(JTextField[][] jt)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(jt[i][j] == null&& Integer.parseInt(jt[i][j].getText())>9)
                    return false;
            }
        }
        return true;
    }
}
