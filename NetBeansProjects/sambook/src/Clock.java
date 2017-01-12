import java.util.*;

public class Clock
{
    public static void main(String[] args)
    {
        Calendar newa = Calendar.getInstance();
        int date = newa.get(Calendar.DATE);
        int mon = newa.get(Calendar.MONTH)+1;
        int year = newa.get(Calendar.YEAR);
        System.out.println(date+"-"+mon+"-"+year);
        int hor = newa.get(Calendar.HOUR_OF_DAY);
        int min = newa.get(Calendar.MINUTE);
        int sec = newa.get(Calendar.SECOND);
        int day = newa.get(Calendar.DAY_OF_MONTH);
        String day1 = "";
        switch(day)
        {
            case 1:
                day1 = "Monday";
                break;
            case 2:
                day1 = "Tuesday";
                break;
            case 3:
                day1 = "Wednesay";
                break;
            case 4:
                day1 = "Thursday";
                break;
            case 5:
                day1 = "Friday";
                break;
            case 6:
                day1 = "Saturday";
                break;
            case 7:
                day1 = "Sunday";
                break;
        }
        if(hor<12)
        {
            System.out.println("Good Morning, Today is "+day1);
        }
        else if(hor<17)
        {
            System.out.println("Good Afternoon, Today is "+day1);
        }
        else
            System.out.println("Good Evening, Today is "+day1);
        System.out.println("The time is "+hor+":"+min+":"+sec);
    }
}
