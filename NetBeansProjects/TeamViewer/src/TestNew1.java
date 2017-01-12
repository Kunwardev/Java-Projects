
import java.io.*;
import java.util.*;

public class TestNew1
{

    ArrayList<String> al = new ArrayList<String>();
    Thread th[] = new Thread[25];
    PingIp pi[] = new PingIp[25];

    TestNew1()
    {
        try
        {
            int k = 0,l=0;
            for (int j = 0; j < 10; j++)
            {
                while (true)
                {
                    for (int i = j * 25; i < 25 * (j + 1); i++)
                    {

                        pi[k] = new PingIp("192.168.137." + (i + 1));
                        th[k] = new Thread(pi[k]);
                        th[k].start();
                        k++;
                       
                       if (k == 25)
                        {
                            k = 0;
                            break;
                        }
                    }
                    
                     while(true){
                        th[l].join();
                        l++;
                        if(l==25)
                            l=0;
                        break;
                     }
                     break;  
                }

            }
            for(int i=1;i<=5;i++)
            {
                  pi[i] = new PingIp("192.168.137." + (i + 250));
                        th[i] = new Thread(pi[i]);
                        th[i].start();
            }
            for(int i=1;i<=5;i++)
                th[i].join();
            for (String ip : al)
            {
                System.out.println(ip);
            }

        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public static void main(String args[])
    {
        TestNew1 obj = new TestNew1();
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
