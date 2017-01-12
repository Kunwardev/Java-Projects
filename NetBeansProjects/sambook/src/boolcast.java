/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */
public class boolcast
{
    public static void main(String[] args)
    {
       /* boolean b = true;
    i = (int)b;
int i = 1;Not Possible
boolean b = (boolean)i;*/ 
        int score = 90;
        char grade;
        if (score >= 60.0)
grade = 'D';
else if (score >= 70.0)
grade = 'C';
else if (score >= 80.0)
grade = 'B';
else if (score >= 90.0)
grade = 'A';
else
grade = 'F';
        System.out.println(grade);
        
        int x = 1;
        boolean c = ((x++ > 1)&&(x >= 1));
(x > 1) && (x++ > 1)
    }
}
