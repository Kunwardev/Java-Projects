
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.imageio.ImageIO;
import javax.swing.JButton;

public class MainServerGUI extends javax.swing.JFrame
{
    private JButton bt1;

    public MainServerGUI()
    {
        initComponents();
        setVisible(true);
        setSize(500,500);
        setLayout(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        bt1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt1.setText("Start Server");
        bt1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(479, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(361, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bt1ActionPerformed
    {//GEN-HEADEREND:event_bt1ActionPerformed
        Thread t1 = new Thread(new Server());
        Thread t2 = new Thread(new Capture());
        t1.start();
        t2.start();
    }//GEN-LAST:event_bt1ActionPerformed

     class Capture implements Runnable
    {

        ServerSocket sersock;
        Socket sock;
        DataInputStream dis;
        DataOutputStream dos;
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
                System.out.println("Image Server Started at port 8900");
                while (true)
                {
                    sock = sersock.accept();
                    System.out.println("Client Connected.");
                    dos = new DataOutputStream(sock.getOutputStream());
                    dis = new DataInputStream(sock.getInputStream());

                    if (dis.readLine().equals("send file"))
                    {
                        dos.writeBytes("sending file\r\n");
                        rect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                        img = new Robot().createScreenCapture(rect);
                        ImageIO.write(img, "png", dos);
                        System.out.println("file sent");
                        System.out.println(dis.readLine());
                    }
                }
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        }}
        
     class Server implements Runnable
    {

        Server()
        {
         
    }
        public void run()
        {
               try
            {
                ServerSocket sersock = new ServerSocket(9000);
                System.out.println("Server started");
                while (true)
                {
                    Socket sock = sersock.accept();
                    ClientHandler ch = new ClientHandler(sock);
                    Thread t = new Thread(ch);
                    t.start();
                }
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        class ClientHandler implements Runnable
        {

            DataInputStream dis;
            DataOutputStream dos;

            ClientHandler(Socket sock)
            {
                try
                {
                    dis = new DataInputStream(sock.getInputStream());
                    dos = new DataOutputStream(sock.getOutputStream());

                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }

            public void run()
            {
                try
                {
                    String clientMessage = dis.readLine();
                    System.out.println("Client Message :" + clientMessage);

                    dos.writeBytes("Server Open\r\n");
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
       
   public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try
//        {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
//            {
//                if ("Nimbus".equals(info.getName()))
//                {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex)
//        {
//            java.util.logging.Logger.getLogger(MainServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex)
//        {
//            java.util.logging.Logger.getLogger(MainServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex)
//        {
//            java.util.logging.Logger.getLogger(MainServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex)
//        {
//            java.util.logging.Logger.getLogger(MainServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

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
    private javax.swing.JButton bt1;
    // End of variables declaration//GEN-END:variables

     }