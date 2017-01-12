
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.Action;
import javax.swing.*;
import javax.swing.table.*;

public class Remote extends JFrame implements ActionListener
{
    JButton btCOS;
    JTable jtOS;
    TableModel tm;
    ArrayList<String> al = new ArrayList<String>();

    Remote()
    {
        super("Remote Control");
        setVisible(true);
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        btCOS = new JButton("Check Online Systems");
        btCOS.setBounds(20,50,200,40);
        add(btCOS);
        btCOS.addActionListener(this);
        tm = new TableModel();
        jtOS = new JTable(tm);
        JScrollPane sp= new JScrollPane(jtOS);
        sp.setBounds(20,100,300,300);
        add(sp);
    }
    
    class TableModel extends AbstractTableModel
    {
        String Title[] = {"Online IP's"};
        public String getColumnName(int a)
        {
            return Title[a];
        }
        public int getRowCount()
        {
            return al.size();
        }

        public int getColumnCount()
        {
            return Title.length;
        }

        public Object getValueAt(int rowIndex, int columnIndex)
        {
            return al.get(rowIndex);
        }
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btCOS)
        {
            TestNew Job = new TestNew();
            Thread t = new Thread(Job);
            t.start();
        }
    }
    class TestNew implements Runnable
{
    Thread th[] = new Thread[25];
    PingIp pi[] = new PingIp[25];

    public void run()
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
                        tm.fireTableDataChanged();
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
    public static void main(String[] args)
    {
        Remote rc = new Remote();
    }
}
