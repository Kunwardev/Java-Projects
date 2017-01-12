
import java.awt.Color;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.*;

public class ClientGUI extends javax.swing.JFrame {
   
    ArrayList<SearchResponse> alsr = new ArrayList<>();
    ArrayList<String> al = new ArrayList<>();
    P2PClient objj;
    Mytablemodel tm;
    mytablemodel1 tm2;

    public ClientGUI() {
        
        tm = new Mytablemodel();
        tm2 = new mytablemodel1();
        initComponents();
/*pbar=new JProgressBar(JProgressBar.HORIZONTAL,0,100);
pbar.setBackground(Color.red);
pbar.setForeground(Color.PINK);
pbar.setStringPainted(true);
add(pbar);
pbar.setBounds(500,400,200,40 );
        */
        File f = new File("c:\\Users\\Public\\Share");
        if (!f.exists()) {
            f.mkdir();
        }
        setSize(1000, 600);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        bts = new javax.swing.JButton();
        tf = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt2 = new javax.swing.JTable();
        bt4 = new javax.swing.JButton();
        pbar = new javax.swing.JProgressBar();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ja = new javax.swing.JTextArea();
        tf3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("connect");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 10, 96, 23);

        bt2.setText("SEND LIST");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(160, 10, 96, 23);

        jt.setModel(tm
        );
        jScrollPane1.setViewportView(jt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 50, 210, 160);

        jButton2.setText("check connection");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(100, 260, 96, 23);

        bts.setText("search");
        bts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsActionPerformed(evt);
            }
        });
        getContentPane().add(bts);
        bts.setBounds(630, 10, 65, 23);
        getContentPane().add(tf);
        tf.setBounds(360, 10, 244, 23);

        jt2.setModel(tm2);
        jScrollPane2.setViewportView(jt2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(370, 50, 322, 155);

        bt4.setText("download");
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        getContentPane().add(bt4);
        bt4.setBounds(420, 230, 79, 23);

        pbar.setStringPainted(true);
        getContentPane().add(pbar);
        pbar.setBounds(450, 270, 146, 30);

        jButton3.setText("stream");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(570, 230, 65, 23);

        jPanel1.setLayout(null);

        ja.setEditable(false);
        ja.setColumns(20);
        ja.setRows(5);
        jScrollPane3.setViewportView(ja);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(-3, 5, 440, 96);
        jPanel1.add(tf3);
        tf3.setBounds(10, 130, 220, 40);

        jButton4.setText("send");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(310, 130, 80, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 310, 440, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        objj = new P2PClient();

        Thread t = new Thread(objj);
        t.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        try {
            objj.dos.writeBytes("send list\r\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_bt2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int a = jt.getSelectedRow();

        if (a == -1) {
            JOptionPane.showMessageDialog(this, "select ip");
        } else {
            String q = al.get(a);
            new Thread(new MiniClient(q)).start();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsActionPerformed
        for (int i = 0; i < al.size(); i++) {
            try {
                MiniClient obj = new MiniClient(al.get(i));
                Thread t = new Thread(obj);
                t.start();

                obj.dos1.writeBytes("search\r\n");

                obj.dos1.writeBytes(tf.getText() + "\r\n");

            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }//GEN-LAST:event_btsActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        int a = jt2.getSelectedRow();
        if (a == -1) {
            JOptionPane.showMessageDialog(this, "select song");
        } else {
            try {
                String s = alsr.get(a).ip;
                MiniClient obj = new MiniClient(s);
                Thread t = new Thread(obj);
                t.start();
                obj.dos1.writeBytes("download\r\n");
                obj.dos1.writeBytes(alsr.get(a).fname + "\r\n");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_bt4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       int h = jt2.getSelectedRow();
        if (h == -1) {
            JOptionPane.showMessageDialog(this, "select song");
        } else {
            try {
                String s = alsr.get(h).ip;
                MiniClient obj = new MiniClient(s);
                Thread t = new Thread(obj);
                t.start();
                obj.dos1.writeBytes("stream\r\n");
                obj.dos1.writeBytes(alsr.get(h).fname + "\r\n");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            
            int n=jt.getSelectedRow();
            if(n==-1)
            {
                JOptionPane.showMessageDialog(this,"select ip to chat from connection list");
            }
            String ip=al.get(n);
            MiniClient obj=new MiniClient(ip);
            Thread t=new Thread(obj);
            t.start();
            obj.dos1.writeBytes("start chat\r\n");
            ja.append("me: "+tf3.getText()+" to "+ip);
            ja.append("\n");
            obj.dos1.writeBytes(tf3.getText()+"\r\n");
            tf3.setText("");
        } 
        catch (IOException ex) 
        {
         ex.printStackTrace();
        }
  
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bts;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea ja;
    private javax.swing.JTable jt;
    private javax.swing.JTable jt2;
    private javax.swing.JProgressBar pbar;
    private javax.swing.JTextField tf;
    private javax.swing.JTextField tf3;
    // End of variables declaration//GEN-END:variables

    public class MiniServer implements Runnable {

        public void run() {
            try {
                ServerSocket sersock = new ServerSocket(4001);
                while (true) {

                    System.out.println("server port started at 4001");
                    Socket sock = sersock.accept();

                    MiniClientHandler obj = new MiniClientHandler(sock);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        class MiniClientHandler implements Runnable {

            ArrayList<FileType> als = new ArrayList<>();
            Socket sock1;

            DataInputStream dis3;
            DataOutputStream dos3;

            MiniClientHandler(Socket sock) {
                try {
                    sock1 = sock;
                    dis3 = new DataInputStream(sock1.getInputStream());
                    dos3 = new DataOutputStream(sock1.getOutputStream());

                    Thread t = new Thread(this);
                    t.start();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }

            public void run() {

                try 
                {
                    String s = dis3.readLine();
                    System.out.println(s);
                    if (s.equals("search")) {
                       for(int i=0;i<als.size();i++)
                       {
                        als.remove(i);
                       }
                        File ff = new File("c:\\Users\\Public\\Share");

                        String a[] = ff.list();
                        String z = dis3.readLine();
                        for (int i = 0; i < a.length; i++) {
                            if (a[i].startsWith(z)) {
                                File f = new File("c:\\Users\\Public\\Share\\" + a[i]);
                                als.add(new FileType(a[i], f.length()));

                            }
                        }
                        dos3.writeBytes("search response\r\n");
                        dos3.writeInt(als.size());

                        for (int i = 0; i < als.size(); i++) {
                            dos3.writeBytes(als.get(i).filename + "\r\n");
                            System.out.println(als.get(i).size);
                            dos3.writeLong(als.get(i).size);
                            //dos3.writeBytes(sock1.getInetAddress().getHostAddress()+"\r\n");
                        }

                    } else if (s.equals("download")) {

                        String q = dis3.readLine();
                        System.out.println("filename::"+q);
                        File f = new File("c:\\Users\\Public\\Share\\" + q);
                        long size = f.length();
                        System.out.println(size);
                        dos3.writeBytes("sending file\r\n");
                        dos3.writeBytes(q + "\r\n");
                        dos3.writeLong(size);

                        byte b[] = new byte[10000];
                        long count = 0;

                        FileInputStream fis = new FileInputStream(f);

                        while (true) {
                            int r = fis.read(b, 0, 10000);
                            count += r;
                            System.out.println(count);
                            dos3.write(b, 0, r);
                            if (count == size) {
                                break;
                            }
                            //                         dos3.write(b);
                        }
                        System.out.println(dis3.readLine());
                    }
                    else if(s.equals("stream"))
                   {
                     String ip=sock1.getLocalAddress().getHostAddress();
                     String fname=dis3.readLine();
                     long port;
                     while(true)
                     {                         
                      port=(long) (Math.random()*100000);
                     if(port>20000 && port<60000)
                     {
                         System.out.println(port);

                         break;
                     }
                                              
                    }
                     StreamingServer objj=new StreamingServer("C:\\Users\\Public\\Share\\"+fname,port,ip);
                     dos3.writeBytes("stream started\r\n");
                     dos3.writeLong(port);
                   }
                    else if(s.equals("start chat"))
                    {
                      String d=dis3.readLine();
                      ja.append("            "+sock1.getInetAddress().getHostAddress()+" : "+d+"\n");
                      
                    }
                } 
                    catch (Exception ex) 
                        {
                    ex.printStackTrace();
                }

            

        }
        }
        public class FileType {

            String filename;
            long size;

            FileType(String f, long s) {
                filename = f;
                size = s;
            }
        }
    }

    public class MiniClient implements Runnable {

        DataInputStream dis1;
        DataOutputStream dos1;
        Socket sock;

        public MiniClient(String s) {
            try {
                sock = new Socket(s, 4001);
                System.out.println("connection accepted");
                dis1 = new DataInputStream(sock.getInputStream());
                dos1 = new DataOutputStream(sock.getOutputStream());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void run() {

            try {

                String s = dis1.readLine();
                System.out.println(s);
                if (s.equals("search response")) {
                     for(int i=0;i<alsr.size();i++)
                       {
                        alsr.remove(i);
                       }
                    int count = dis1.readInt();
                    for (int i = 0; i < count; i++) {
                        String a = dis1.readLine();
                        String sz = dis1.readLong() + "";
                        //String p=dis1.readLine();
                        alsr.add(new SearchResponse(a, sz, sock.getInetAddress().getHostAddress()));
                        tm2.fireTableDataChanged();
                    }
                } else if (s.equals("sending file")) {
                    String a = dis1.readLine();
                    long size = dis1.readLong();

                    byte b[] = new byte[10000];

                    FileOutputStream fos = new FileOutputStream("c:\\Users\\Public\\Share\\" + a);
                    long count = 0;
                    while (true) {
                        int w = dis1.read(b, 0, 10000);
                        count += w;
                        long g=((count*100)/size);
                        pbar.setValue((int) g);
                        pbar.setString(g+"%");
                        
                       
                        fos.write(b, 0, w);
                        if (count == size) {
                            break;
                        }

                    }
                    dos1.writeBytes("file sent\r\n");

                }
                else if(s.equals("stream started"))
                {
                   long port= dis1.readLong();
                  String url=("rtsp://"+sock.getInetAddress().getHostAddress()+":"+port +"/hello");
                   StreamingFilePlayer obj=new StreamingFilePlayer(url);
                   
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }

    public class P2PClient implements Runnable {

        DataInputStream dis;
        DataOutputStream dos;

        Socket sock;

        P2PClient() {
            try {
                sock = new Socket("172.16.1.93", 4000);
                System.out.println("connection accepted");
                dis = new DataInputStream(sock.getInputStream());
                dos = new DataOutputStream(sock.getOutputStream());
                new Thread(new MiniServer()).start();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            int n = 0;
            try {
                while (true) {
                    String s = dis.readLine();
                    System.out.println(s);
                    if (s.equals("sending...")) {
                        n = dis.readInt();
                        System.out.println(n);
                        for (int i = 0; i < n; i++) {
                            String ip = dis.readLine();
                            if (ip.equals(sock.getLocalAddress().getHostAddress())) {

                            } else {
                                al.add(ip);

                                tm.fireTableDataChanged();
                            }
                        }
                    }

                }

            } catch (IOException ex) {
                ex.printStackTrace();

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
                return al.get(i);
            }
        }

        public String getColumnName(int i) {
            String c[] = {"ser no", "ip"};
            return c[i];
        }

    }

    class mytablemodel1 extends AbstractTableModel {

        @Override
        public int getRowCount() {
            return alsr.size();
        }

        @Override
        public int getColumnCount() {
            return 4;

        }

        @Override
        public Object getValueAt(int i, int j) {

            if (j == 0) {
                return (i + 1);
            } else if (j == 1) {
                return alsr.get(i).fname;
            } else if (j == 2) {
                return alsr.get(i).fsize;
            } else {
                return alsr.get(i).ip;
            }
        }

        public String getColumnName(int i) {
            String c[] = {"ser no", "file", "size", "ip"};
            return c[i];
        }

    }

    public class SearchResponse {

        String fname;
        String fsize;
        String ip;

        SearchResponse(String f, String s, String i) {
            fname = f;
            fsize = s;
            ip = i;
        }
    }

}
