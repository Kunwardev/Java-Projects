
import java.io.*;
import java.util.*;

public class Test
{

    ArrayList<String> al = new ArrayList<String>();
    Thread th[] = new Thread[50];
    PingIp pi[] = new PingIp[50];

    Test()
    {
        try
        {
            for (int i = 0; i < 50; i++)
            {
                pi[i] = new PingIp("192.168.137." + (i + 1));
                th[i] = new Thread(pi[i]);
                th[i].start();
            }
            for (int i = 0; i < 50; i++)
            {
                th[i].join();
            }
            for(String ip : al){
                System.out.println(ip);
            }

        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public static void main(String args[])
    {
        Test obj = new Test();
    }

    class PingIp implements Runnable
    {

        String ip;

        PingIp(String ip)
        {
            this.ip = ip;
        }

        public void run()
        {
            try
            {
                Process p = Runtime.getRuntime().exec("ping " + this.ip);
                BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
                while (true)
                {
                    String s = br.readLine();
                    if (s == null)
                    {
                        break;
                    } else if (s.indexOf("TTL") != -1 || s.indexOf("ttl") != -1)
                    {
                        al.add(this.ip);
                        //System.out.println(this.ip);
                        break;
                    } else if (s.indexOf("Destination host unreachable") != -1 || s.indexOf("Request timed out") != -1)
                    {
                        break;
                    }

                }
            } catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }

}
