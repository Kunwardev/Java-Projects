
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;
import javax.imageio.ImageIO;

public class MainServerGUI extends javax.swing.JFrame
{

    public MainServerGUI()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Start Server");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 20, 140, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        Thread t1 = new Thread(new Server());
        Thread t2 = new Thread(new Capture());
        t1.start();
        t2.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    public class Server implements Runnable
    {

        Socket sock;
        ServerSocket sersock;

        Server()
        {

        }

        public void run()
        {
            try
            {
                sersock = new ServerSocket(9000);

                System.out.println("Server Started at port no 9000");
                while (true)
                {
                    sock = sersock.accept();
                    System.out.println("connection accepted");
                    ClientHandler obj = new ClientHandler(sock);
                    Thread t = new Thread(obj);
                    t.start();
                }
            } catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }

        class ClientHandler implements Runnable
        {

            Socket sock;
            DataInputStream dis;
            DataOutputStream dos;

            ClientHandler(Socket s)
            {
                try
                {
                    sock = s;
                    dis = new DataInputStream(sock.getInputStream());
                    dos = new DataOutputStream(sock.getOutputStream());
                } catch (Exception ex)
                {
                    ex.printStackTrace();
                }
            }

            public void run()
            {

                try
                {
                    Robot rb = new Robot();
                    while (true)
                    {
                        String s = dis.readLine();
                        if (s.equals("check server"))
                        {
                            dos.writeBytes("Server OK\r\n");
                            dos.flush();
                            break;
                        } else if (s.equals("leftclick"))
                        {
                            rb.mousePress(MouseEvent.BUTTON1_MASK);
                            rb.mouseRelease(MouseEvent.BUTTON1_MASK);
                        } else if (s.equals("rightclick"))
                        {
                            rb.mousePress(MouseEvent.BUTTON3_MASK);
                            rb.mouseRelease(MouseEvent.BUTTON3_MASK);
                        } else if (s.startsWith("mousemove"))
                        {
                            StringTokenizer st = new StringTokenizer(s);
                            st.nextToken();
                            int x = Integer.parseInt(st.nextToken());
                            int y = Integer.parseInt(st.nextToken());
                            rb.mouseMove(x, y);
                        }
                    }

                } catch (Exception ex)
                {
                    ex.printStackTrace();
                }

            }
        }

    }

    public class Capture implements Runnable
    {

        ServerSocket sersock;
        Socket sock;

        Rectangle rect;
        BufferedImage img;

        public Capture()
        {

        }

        public void run()
        {
            try
            {
                sersock = new ServerSocket(8900);
                System.out.println("Image Server Started at port : 8900");
                rect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

                while (true)
                {
                    try
                    {
                        sock = sersock.accept();
                        new Thread(new ImageClientHandler(sock)).start();
                    } 
                    catch (Exception ex)
                    {
                        ex.printStackTrace();
                    }
                }

            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        class ImageClientHandler implements Runnable
        {

            Socket sock;
            DataInputStream dis;
            DataOutputStream dos;

            ImageClientHandler(Socket sock)
            {
                try
                {
                    this.sock = sock;

                    dos = new DataOutputStream(sock.getOutputStream());
                    dis = new DataInputStream(sock.getInputStream());
                } catch (Exception ex)
                {
                    ex.printStackTrace();
                }
            }

            public void run()
            {
                try
                {
                    Robot ob1 = new Robot();
                    while (true)
                    {

                        if (dis.readLine().equals("send file"))
                        {
                            dos.writeBytes("sending file\r\n");
                            img = ob1.createScreenCapture(rect);
                            ImageIO.write(img, "png", dos);

                            dis.readLine();
                        }
                    }
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

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
            java.util.logging.Logger.getLogger(MainServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MainServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MainServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MainServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MainServerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
