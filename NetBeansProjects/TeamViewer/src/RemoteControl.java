
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.*;
import javax.swing.table.AbstractTableModel;
public class RemoteControl extends javax.swing.JFrame
{
    ArrayList<String> al = new ArrayList<String>();
    ArrayList<String> bl = new ArrayList<String>();
    TableModel tm;
    public RemoteControl()
    {
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
    String serverMessage;
    class Client {

    Client(String ip1) {
        try {
//            System.out.println("Connection Build");
            Socket sock = new Socket(ip1, 9000);

            DataInputStream dis = new DataInputStream(sock.getInputStream());
            DataOutputStream dos = new DataOutputStream(sock.getOutputStream());

            dos.writeBytes("Testing Server\r\n");
            dos.flush();

             serverMessage = dis.readLine();
//            System.out.println("Server Message: " + serverMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtOS = new javax.swing.JTable();
        btCOS = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jtOS.setModel(tm);
        jScrollPane1.setViewportView(jtOS);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 76, 232, 282);

        btCOS.setText("Check Online Systems");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jtOS, org.jdesktop.beansbinding.ObjectProperty.create(), btCOS, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        btCOS.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btCOSActionPerformed(evt);
            }
        });
        getContentPane().add(btCOS);
        btCOS.setBounds(10, 11, 232, 37);

        jButton1.setText("Check Connection");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(260, 100, 170, 40);

        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(260, 160, 170, 200);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCOSActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btCOSActionPerformed
    {//GEN-HEADEREND:event_btCOSActionPerformed
        TestNew Job = new TestNew();
            Thread t = new Thread(Job);
            t.start();
    }//GEN-LAST:event_btCOSActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed

                seve server = new seve();
                for(int i =0;i<al.size();i++)
                {
                    Client cl = new Client(al.get(i));
                    if(serverMessage=="Server Open")
                    {
                        bl.add(al.get(i));
                    }
                }
                
    }//GEN-LAST:event_jButton1ActionPerformed
   
    
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
    
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new RemoteControl().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCOS;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jtOS;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
