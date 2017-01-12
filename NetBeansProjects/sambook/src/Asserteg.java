/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */
public class Asserteg
{
    static boolean approveTicket(int age)
    {
        assert(age>60 && age<110):"Age is "+age;
        if(age<60)
        {return true;
    }else
            return false;
}
    public static void main(String[] args)
    {
        Asserteg ae = new Asserteg();
        System.out.println(ae.approveTicket(120));
    }
}