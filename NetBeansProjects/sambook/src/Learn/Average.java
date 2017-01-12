package Learn;

import java.util.*;

public class Average
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        int counter = 0;
        int total =0;float marks;
        while( counter < 10 )
        {
            marks = a.nextFloat();
            total += marks;
            counter ++;
        }
        System.out.println("The Total Marks are: "+total);
        marks = total/10;
        System.out.println("Average is "+marks);
    }
}
