import java.util.Calendar;

public class Dateclass
{
    public static void main(String[] args)
    {
        Thread t = new Thread();
        Calendar now = Calendar.getInstance();
        while(true)
        {
        try {t.sleep(1000);
        }catch(Exception e){}
        System.out.println(now.get(Calendar.YEAR)+"-"+now.get((Calendar.MONTH+1))+"-"+now.get(Calendar.DATE)+"   "+now.get(Calendar.HOUR_OF_DAY)+":"+now.get(Calendar.MINUTE)+":"+now.get(Calendar.SECOND));
        
    }
}
}