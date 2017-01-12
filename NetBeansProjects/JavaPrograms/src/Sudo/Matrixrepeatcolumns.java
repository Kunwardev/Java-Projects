package Sudo;

import javax.swing.JTextField;

public class Matrixrepeatcolumns
{
    boolean checkcolumns(JTextField[][] jt)
    {
            int flag =0;
            JTextField num = new JTextField();
        for(int col=0;col<jt.length;col++)
        {
            for(int row =0;row<jt.length;row++)
            {
                num = jt[row][col];
                for(int otherrow = row+1;otherrow<jt.length;otherrow++)
                {
                    if(num == jt[otherrow][col])
                    {flag = 1;
                    break;}
                    if(flag == 1)
                        break;
                }
                if(flag == 1)
                        break;
                }
            if(flag == 1)
                        break;
            }
        if(flag == 1)
            return false;
        return true;
    
    }

        }
//if repeatition then false else value is true