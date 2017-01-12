
package Sudo;

import javax.swing.JTextField;

public class Sudokumat
{
    int x;
    public boolean sudoCheck(JTextField a[][])
    {
        int sum =0,i,l;
        for(i=0;i<3;i++)
        {
            for(l=0;l<3;l++)
            {
                x= Integer.parseInt(a[i][l].getText());
                sum+=x;
            }
        }
      
        if(sum != 45)
            return false;
         sum = 0;
        for(i=0;i<3;i++)
        {
            for(l=3;l<6;l++)
            {
                x = Integer.parseInt(a[i][l].getText());
                sum+=x;
            }
        }
        if(sum != 45)
            return false;
         sum = 0;
        for(i=0;i<3;i++)
        {
            for(l=6;l<9;l++)
            {
                x = Integer.parseInt(a[i][l].getText());
                sum+=x;
            }
        }
        if(sum != 45)
            return false;
         sum = 0;
        for(i=3;i<6;i++)
        {
            for(l=0;l<3;l++)
            {
                x = Integer.parseInt(a[i][l].getText());
                sum+=x;
            }
        }
        if(sum != 45)
            return false;
         sum = 0;
        for(i=3;i<6;i++)
        {
            for(l=3;l<6;l++)
            {
                x = Integer.parseInt(a[i][l].getText());
                sum+=x;
            }
        }
        if(sum != 45)
            return false;
         sum = 0;
        for(i=3;i<6;i++)
        {
            for(l=6;l<9;l++)
            {
                x = Integer.parseInt(a[i][l].getText());
                sum+=x;
            }
        }
        if(sum != 45)
            return false;
         sum = 0;
        for(i=6;i<9;i++)
        {
            for(l=0;l<3;l++)
            {
                x = Integer.parseInt(a[i][l].getText());
                sum+=x;
            }
        }
        if(sum != 45)
            return false;
          sum = 0;
        for(i=6;i<9;i++)
        {
            for(l=3;l<6;l++)
            {
                x = Integer.parseInt(a[i][l].getText());
                sum+=x;
            }
        }
        if(sum != 45)
            return false;
          sum = 0;
        for(i=6;i<9;i++)
        {
            for(l=6;l<9;l++)
            {
                x = Integer.parseInt(a[i][l].getText());
                sum+=x;
            }
        }
        if(sum != 45)
            return false;
        return true;
    }    
}
