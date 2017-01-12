
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.table.*;

public class ServerGUI extends javax.swing.JFrame {

    ArrayList<P2PServer.ClientHandler> al = new ArrayList<>();
    Mytablemodel tm;
    P2PServer obj;

    public ServerGUI() {

        tm = new Mytablemodel();
       
        initComponents();
         setSize(600, 600);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 240, 170, 40);

        jt.setModel(tm);
        jScrollPane3.setViewportView(jt);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(90, 30, 452, 150);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        obj = new P2PServer();
        Thread t = new Thread(obj);
        t.start();


    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jt;
    // End of variables declaration//GEN-END:variables

    public class P2PServer implements Runnable {

        public void run() {
            try {
                ServerSocket sersock = new ServerSocket(4000);
                while (true)
                {

                    System.out.println("server port started at 4000");
                    Socket sock = sersock.accept();
                    
                    
                    ClientHandler obj = new ClientHandler(sock);
                    al.add(obj);
                    
                    tm.fireTableDataChanged();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        class ClientHandler implements Runnable  
        {

            Socket sock1;
            String ip;
            DataInputStream dis;
            DataOutputStream dos;

            ClientHandler(Socket sock) throws IOException {

                sock1 = sock;
                Thread t = new Thread(this);
                t.start();
                ip = sock.getInetAddress().getHostAddress();
               dis= new DataInputStream(sock1.getInputStream());
                    dos = new DataOutputStream(sock1.getOutputStream());
            }

            public void run() {
                try {
                        while(true)
                        {
                            String s=dis.readLine();
                            System.out.println(s);
                            if(s.equals("send list"))
                            {
                                dos.writeBytes("sending...\r\n");
                             
                               dos.writeInt( al.size());
                           for(int i=0;i<al.size();i++)
                                {
                                    dos.writeBytes(al.get(i).ip+"\r\n");
                                }
                            }
                        }
                    

                } 
                catch (IOException ex) 
                {
                    ex.printStackTrace();
                    al.remove(this);
                    tm.fireTableDataChanged();
                }
            }

        }

    }

    class Mytablemodel extends AbstractTableModel {

        @Override
        public int getRowCount() {
            return al.size();
        }

        @Override
        public int getColumnCount() {
            return 2;

        }

        @Override
        public Object getValueAt(int i, int j) {
           
            if (j == 0) {
                return (i + 1);
            } else {
                return al.get(i).ip;
            }
        }

        public String getColumnName(int i)  {
            String c[] = {"ser no", "ip"};
            return c[i];
        }

    }
}
