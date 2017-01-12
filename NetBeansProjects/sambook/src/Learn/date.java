
package Learn;

import java.util.Date;

public class date
{
    public static void main(String[] args)
    {
        Date d1 = new Date();
        System.out.println("Today's Date: "+d1);
        Date d2 = new Date(2012, 03, 22, 21, 05, 30);
        System.out.println("Imp Date: "+d2);
        Date d3 = new Date("April 22 1994 09:23 PM");
        System.out.println("Other Date: "+d3);
    }
}
