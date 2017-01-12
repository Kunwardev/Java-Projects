
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.net.Socket;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.*;
import javax.swing.JOptionPane;

public class Viewer extends javax.swing.JFrame
{

    Dimension d;
    String ip;
    CommandClient cc;

    public Viewer(String ip)
    {
        
        this.ip = ip;
        d = Toolkit.getDefaultToolkit().getScreenSize();
        initComponents();
        setLayout(null);
        setTitle("Remote Controller");
        //jScrollPane1.setLocation(0,0);
        //jLabel1.setLocation(0,0);
        setSize(d.width, d.height - 50);
        //jScrollPane1.setSize(d.width, d.height - 200);
        setVisible(true);
        jLabel1.requestFocus();
        cc = new CommandClient();
        new Thread(cc).start();
        new Thread(new CaptureClient()).start();
        

    }

    public class CommandClient implements Runnable
    {

        Socket sock;
        PrintWriter pw;

        public CommandClient()
        {

        }

        public void run()
        {
            try
            {
                sock = new Socket(ip, 9000);
                pw = new PrintWriter(sock.getOutputStream());
                while (true)
                {

                }
            } catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }

    public class CaptureClient implements Runnable
    {

        Socket sock;
        DataInputStream dis;
        DataOutputStream dos;
       
        public void run()
        {

            try
            {
                Rectangle rect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                Robot rb = new Robot();
                BufferedImage img = null;

                for (int i = 1; i <= 1000; i++)
                {

                    sock = new Socket(ip, 8900);
                    dis = new DataInputStream(sock.getInputStream());
                    dos = new DataOutputStream((sock.getOutputStream()));

                    dos.writeBytes("send file\r\n");

                    if (dis.readLine().equals("sending file"))
                    {
                        img = new Robot().createScreenCapture(rect);
                        img = ImageIO.read(dis);
                        jLabel1.setIcon(new ImageIcon(img));
                        //ImageIO.write(img, "png", new FileOutputStream("c:\\hello\\" + i + ".png"));
                        //System.out.println(i + ". file saved");
                        dos.writeBytes("received\r\n");
                    }
                }
            } catch (Exception e)
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
        jLabel1 = new javax.swing.JLabel();
        btshutdown = new javax.swing.JButton();
        btabort = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                jLabel1MouseMoved(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel1MouseClicked(evt);
            }
        });
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jLabel1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jLabel1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jLabel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 1010, 560);

        btshutdown.setBackground(new java.awt.Color(153, 204, 255));
        btshutdown.setFont(new java.awt.Font("Lucida Calligraphy", 3, 18)); // NOI18N
        btshutdown.setForeground(new java.awt.Color(255, 255, 255));
        btshutdown.setText("Shut Down");
        btshutdown.setToolTipText("Press this button for ShutDown");
        btshutdown.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btshutdownActionPerformed(evt);
            }
        });
        getContentPane().add(btshutdown);
        btshutdown.setBounds(0, 580, 150, 80);

        btabort.setBackground(new java.awt.Color(153, 204, 255));
        btabort.setFont(new java.awt.Font("Lucida Calligraphy", 3, 18)); // NOI18N
        btabort.setForeground(new java.awt.Color(255, 255, 255));
        btabort.setText("Abort");
        btabort.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btabortActionPerformed(evt);
            }
        });
        getContentPane().add(btabort);
        btabort.setBounds(440, 580, 150, 80);

        jButton4.setBackground(new java.awt.Color(153, 204, 255));
        jButton4.setFont(new java.awt.Font("Lucida Calligraphy", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Send Text ");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(860, 580, 150, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel1MouseMoved
    {//GEN-HEADEREND:event_jLabel1MouseMoved
        cc.pw.println("mousemove " + evt.getX() + " " + evt.getY());
        cc.pw.flush();
    }//GEN-LAST:event_jLabel1MouseMoved

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel1MouseClicked
    {//GEN-HEADEREND:event_jLabel1MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1)
        {
            cc.pw.println("leftclick");
        } 
        else if (evt.getButton() == MouseEvent.BUTTON3)
        {
            cc.pw.println("rightclick");
        }
        cc.pw.flush();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jLabel1KeyPressed
    {//GEN-HEADEREND:event_jLabel1KeyPressed
        System.out.println("keypressed : "+evt.getKeyCode());
        cc.pw.println("keypress "+evt.getKeyCode());
        cc.pw.flush();
    }//GEN-LAST:event_jLabel1KeyPressed

    private void jLabel1KeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jLabel1KeyReleased
    {//GEN-HEADEREND:event_jLabel1KeyReleased
        System.out.println("keyreleased : "+evt.getKeyCode());
        cc.pw.println("keyrelease "+evt.getKeyCode());
        cc.pw.flush();
    }//GEN-LAST:event_jLabel1KeyReleased

    private void btshutdownActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btshutdownActionPerformed
    {//GEN-HEADEREND:event_btshutdownActionPerformed
       int r = JOptionPane.showConfirmDialog(this,"Want a timed Shutdown for Remote P.C","ShutDown",JOptionPane.YES_NO_CANCEL_OPTION);
       if(r == JOptionPane.YES_OPTION)
       {
           cc.pw.println("sshutdown");
           cc.pw.flush();
       }
       else if(r == JOptionPane.NO_OPTION)
       {
           cc.pw.println("nshutdown");
           cc.pw.flush();
       }
    }//GEN-LAST:event_btshutdownActionPerformed

    private void btabortActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btabortActionPerformed
    {//GEN-HEADEREND:event_btabortActionPerformed
        cc.pw.println("abort");
        cc.pw.flush();
    }//GEN-LAST:event_btabortActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
    {//GEN-HEADEREND:event_jButton4ActionPerformed
       String q = JOptionPane.showInputDialog(this,"Enter The Text to send ");
       cc.pw.println("Msg "+q);
       cc.pw.flush();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Viewer("127.0.0.1").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btabort;
    private javax.swing.JButton btshutdown;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
