package Sudo;

import javax.swing.JTextField;

public class Matrixrepeatrows
{
//    public boolean checkrows(String a[][])
//    {
//        int flag =0;
//        for(int row=0;row<a.length;row++)
//        {
//            for(int col =0;col<a.length;col++)
//            {
//                int num = Integer.parseInt(a[row][col]);
//                for(int othercol = col+1;othercol<a.length;othercol++)
//                {
//                    if(num == Integer.parseInt(a[row][othercol]))
//                    {flag = 1;
//                    break;}
//                    if(flag == 1)
//                        break;
//                }
//                if(flag == 1)
//                        break;
//                }
//            if(flag == 1)
//                        break;
//            }
//        if(flag == 1)
//            return false;
//        return true;
//        }

 public boolean checkrows(JTextField[][] a)
    {
            {
        int flag =0;
        JTextField num = new JTextField();
        for(int row=0;row<a.length;row++)
        {
            for(int col =0;col<a.length;col++)
            {
                 num =(a[row][col]);
                for(int othercol = col+1;othercol<a.length;othercol++)
                {
                    if(num == (a[row][othercol]))
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
}
// If repeatition then the answer will be false else true