package Test;

public class shut
{

    shut()
    {
        try
        {
            Process p = Runtime.getRuntime().exec("shutdown -s -t 120");
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    

    public static void main(String[] args)
    {
        shut o = new shut();
                
    }
}
