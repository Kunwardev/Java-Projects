
import java.time.Instant;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */
public class challengecatering
{
    String name;
    String id = "";
    static int x =1;
    final int guest = 40;
    public challengecatering(String name)
    {
        this.name = name;
        if(name.charAt(0) == 'w' || name.charAt(0) == 'W')
        {
            id = "w"+"" +x;
            x++;
        }else if(name.charAt(0) == 's'||name.charAt(0) == 'S')
        {
            id = "s"+""+x;
            x++;
        }
        else
        {
            id = "b"+""+x;
            x++;
        }
        System.out.println("The Event is "+name);
        System.out.println("The Id is "+id+"\n");
    }
    
    public challengecatering(String name,Date d)
    {
       
        this.name = name;
        if(name.charAt(0) == 'w' || name.charAt(0) == 'W')
        {
            id = "w"+"" +x;
            x++;
        }else if(name.charAt(0) == 's'||name.charAt(0) == 'S')
        {
            id = "s"+""+x;
            x++;
        }
        else
        {
            id = "b"+""+x;
            x++;
        }
        System.out.println("The Event is "+name);
        System.out.println("The date of Event is "+d);
        System.out.println("The Id is "+id+"\n");
    }
    
    public challengecatering(String name, Date d, int guests)
    {
        
        this.name = name;
        if(name.charAt(0) == 'w' || name.charAt(0) == 'W')
        {
            id = "w"+"" +x;
            x++;
        }else if(name.charAt(0) == 's'||name.charAt(0) == 'S')
        {
            id = "s"+""+x;
            x++;
        }
        else
        {
            id = "b"+""+x;
            x++;
        }
        System.out.println("The Event is "+name);
        System.out.println("The Id is "+id);
        System.out.println("Date of event: "+d);
        System.out.println("The Cost of event is "+(guests*guest)+"\n");
    }
    
    public static void main(String[] args)
    {
        Date d = new Date(2015, 05, 12);
        challengecatering a = new challengecatering("Birth");
        challengecatering b = new challengecatering("Wedding",d,100);       
    }
}
