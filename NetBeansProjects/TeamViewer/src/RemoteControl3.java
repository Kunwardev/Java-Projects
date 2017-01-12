
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class RemoteControl3 extends javax.swing.JFrame
{
    ArrayList<String> al = new ArrayList<>();
    ArrayList<String> bl = new ArrayList<String>();
    TableModel tm;
    TableModel2 tm2;
    public RemoteControl3()
    { 
        tm2 = new TableModel2();
        tm = new TableModel();
        initComponents();
        
        setSize(500,500);
        setVisible(true);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);  
        
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
    
    
    class TableModel2 extends AbstractTableModel
    {
         String Title[] = {"Software Using IP's"};
        public String getColumnName(int a)
        {
            return Title[a];
        }
        public int getRowCount()
        {
            return bl.size();
        }

        public int getColumnCount()
        {
            return Title.length;
        }

        public Object getValueAt(int rowIndex, int columnIndex)
        {
            return bl.get(rowIndex);
        }
        
    }
    
    
    String serverMessage;
    class Client
    {

    Client(String ip1)
    {
        try
        {
//            System.out.println("Connection Build");
            Socket sock = new Socket(ip1, 9000);

            DataInputStream dis = new DataInputStream(sock.getInputStream());
            DataOutputStream dos = new DataOutputStream(sock.getOutputStream());

            dos.writeBytes("Testing Server\r\n");
            dos.flush();

             serverMessage = dis.readLine();
//            System.out.println("Server Message: " + serverMessage);
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtOS = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtS = new javax.swing.JTable();
        btCos = new javax.swing.JButton();
        btS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtOS.setModel(tm);
        jScrollPane1.setViewportView(jtOS);

        jtS.setModel(tm2);
        jScrollPane2.setViewportView(jtS);

        btCos.setText("Check Online Systems");
        btCos.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btCosActionPerformed(evt);
            }
        });

        btS.setText("View");
        btS.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btCos, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btS, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btCos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btS, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btCosActionPerformed
    {//GEN-HEADEREND:event_btCosActionPerformed
                                               
        TestNew Job = new TestNew();
        Thread t = new Thread(Job);
        t.start();
    
    }//GEN-LAST:event_btCosActionPerformed

    
    
    private void btSActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btSActionPerformed
    {//GEN-HEADEREND:event_btSActionPerformed
                 //  Server server = new Server();
            
    }//GEN-LAST:event_btSActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new RemoteControl3().setVisible(true);
            }
        });
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
            
            

        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
        ///////// new code//////
        
                for(int i =0;i<al.size();i++)
                {
                    Client cl = new Client(al.get(i));
                    
                    if(serverMessage.equals("Server Open"))
                    {
                        bl.add(al.get(i));
                        tm2.fireTableDataChanged();
                    }
                }
            
            
            JOptionPane.showMessageDialog(RemoteControl3.this,"Detection Completed");
        }
        
    }

    class TestNew2 implements Runnable
    {
        String ip;
        DataInputStream dis;
        DataOutputStream dos;
        Socket sock;
        TestNew2(String ip)
        {
            this.ip = ip;
        }
        public void run()
        {
            try 
        {
            sock = new Socket(ip,8900);
            System.out.println("Client connected to server");
            dis = new DataInputStream(sock.getInputStream());
            dos = new DataOutputStream(sock.getOutputStream());
            
            dos.writeBytes("check server \r\n");
            dos.flush();
            
            String s = dis.readLine();
            System.out.println("Server Message : "+s);
            
            bl.add(ip);
            tm2.fireTableDataChanged();
            
            
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
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
                    } 
                    else if (s.indexOf("TTL") != -1 || s.indexOf("ttl") != -1)
                    {
                        al.add(this.ip);
                        tm.fireTableDataChanged();
                        //System.out.println(this.ip);
                        break;
                    } 
                    else if (s.indexOf("Destination host unreachable") != -1 || s.indexOf("Request timed out") != -1)
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


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCos;
    private javax.swing.JButton btS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtOS;
    private javax.swing.JTable jtS;
    // End of variables declaration//GEN-END:variables
}
