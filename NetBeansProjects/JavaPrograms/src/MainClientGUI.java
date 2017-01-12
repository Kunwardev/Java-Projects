
import java.io.*;
import java.net.Socket;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class MainClientGUI extends javax.swing.JFrame
{

    ArrayList<String> al = new ArrayList<>();
    ArrayList<String> bl = new ArrayList<>();
    TableModel tm;
    TableModelNew tmn;

    public MainClientGUI()
    {
        tm = new TableModel();
        tmn = new TableModelNew();
        initComponents();
        setSize(700, 600);
        setVisible(true);
    }

    class DetectSystems implements Runnable
    {
        PingJob job[] = new PingJob[25];
        Thread t[] = new Thread[25];
        public void run()
        {
            for(int k=0; k<=10; k++)
            {
                for(int i=0; i<25; i++)
                {
                    //if(k<10)
                    //{
                        job[i] = new PingJob("192.168.137."+((k*25)+i+1));
                        t[i] = new Thread(job[i]);
                        t[i].start();
                    //}
                    //else if(i<5)
                    //{
                     //   job[i] = new PingJob("192.168.137."+((k*25)+i+1));
                     //   t[i] = new Thread(job[i]);
                      //  t[i].start();
                   // }
                    //else
                   // {
                     //   break;
                    //}
                }
                for(int i=0; i<25; i++)
                {
                    try// to join threads
                    {
                        t[i].join();
                    } 
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
            ////////////// PING OPERATION COMPLETED HERE ///////////////////
            
            DetectServerSystems dss[] = new DetectServerSystems[al.size()];
            Thread th[] = new Thread[al.size()];
            
            for(int i=0; i<al.size(); i++)
            {
                dss[i] = new DetectServerSystems(al.get(i));
                th[i] = new Thread(dss[i]);
                th[i].start();
            }
            for(int i=0; i<al.size(); i++)
            {
                try
                {
                    th[i].join();
                } 
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            
            
            
            JOptionPane.showMessageDialog(MainClientGUI.this,"Detection Completed");
        }
    }
    
    class PingJob implements Runnable
    {

        String ip;

        PingJob(String ip)
        {
            this.ip = ip;
        }

        public void run()
        {
            try
            {
                Process p = Runtime.getRuntime().exec("ping " + ip);
                BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
                while (true)
                {
                    String s = br.readLine();
                    if (s == null)
                    {
                        break;
                    }
                    else if (s.indexOf("TTL") != -1)
                    {
                        al.add(ip);
                        tm.fireTableDataChanged();
                        break;
                    } 
                    else if (s.indexOf("Destination host unreachable") != -1 || s.indexOf("Request timed out")!=-1)
                    {
                        break;
                    }
                }
            } 
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }

    class DetectServerSystems implements Runnable
    {
        String ip;
        DataInputStream dis;
        DataOutputStream dos;
        Socket sock;
        DetectServerSystems(String ip)
        {
            this.ip = ip;
        }
        public void run()
        {
            try 
        {
            sock = new Socket(ip,9000);
            System.out.println("Client connected to server");
            dis = new DataInputStream(sock.getInputStream());
            dos = new DataOutputStream(sock.getOutputStream());
            
            dos.writeBytes("check server \r\n");
            dos.flush();
            
            String s = dis.readLine();
            System.out.println("Server Message : "+s);
            
            bl.add(ip);
            tmn.fireTableDataChanged();
            
            
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        }
    }
    
    
    class TableModel extends AbstractTableModel
    {
        String title[] = {"ONLINE SYSTEMS"};
        public String getColumnName(int a)
        {
            return title[a];
        }
        public int getColumnCount()
        {
            return title.length;
        }
        public int getRowCount()
        {
            return al.size();
        }
        public Object getValueAt(int row, int col)
        {
            return al.get(row);
        }
    }
    class TableModelNew extends AbstractTableModel
    {
        String title[] = {"SERVER SYSTEMS"};
        public String getColumnName(int a)
        {
            return title[a];
        }
        public int getColumnCount()
        {
            return title.length;
        }
        public int getRowCount()
        {
            return bl.size();
        }
        public Object getValueAt(int row, int col)
        {
            return bl.get(row);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        view = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Client Interface");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 380, 40);

        jButton1.setText("Online Systems");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 70, 200, 30);

        jTable1.setModel(tm);
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 110, 200, 340);

        jTable2.setModel(tmn);
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(230, 110, 200, 340);

        view.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        view.setText("Click to view");
        view.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                viewActionPerformed(evt);
            }
        });
        getContentPane().add(view);
        view.setBounds(240, 480, 180, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        Thread t = new Thread(new DetectSystems());
        t.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_viewActionPerformed
    {//GEN-HEADEREND:event_viewActionPerformed
        int index = jTable2.getSelectedRow();
        if(index==-1)
        {
            JOptionPane.showMessageDialog(this,"Select row first");
        }
        else
        {
            Viewer v = new Viewer(bl.get(index));
        }
    }//GEN-LAST:event_viewActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_formKeyPressed
    {//GEN-HEADEREND:event_formKeyPressed
        evt.getKeyCode();
    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_formKeyReleased
    {//GEN-HEADEREND:event_formKeyReleased
        evt.getKeyCode();
    }//GEN-LAST:event_formKeyReleased

    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(MainClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MainClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MainClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MainClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MainClientGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
