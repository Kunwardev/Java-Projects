import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class server extends JFrame implements ActionListener
{
 JButton bt;
public server()
{
bt=new JButton("connect");
setLayout(null);
setVisible(true);
setSize(500,500);
bt.addActionListener(this);
} 
public void actionPerformed(ActionEvent e)
{
     try {
         P2PServer obj=new P2PServer();
     } catch (Exception ex) {
         Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
     }
}

    public Object getValue(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void putValue(String key, Object value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
 class P2PServer 
{   
    
        int i=1;
        public P2PServer() throws Exception
        {
            ServerSocket sersock=new ServerSocket(4000);
        while(true)
        {
        
          System.out.println("server port started at 4000");
          
        
          Socket sock=sersock.accept();
          System.out.println("connection accepted from client"+i);
          i++;
          ClientHandler obj=new ClientHandler(sock);
           
          
        }
        }
        class ClientHandler implements Runnable
        {
            Socket sock1;
            
            Thread t=new Thread(this);  
            ClientHandler(Socket sock)
            {
            
            sock1=sock;   
            t.start();
            }
        public void run()
        {
         try
         {
            
        DataInputStream dis=new DataInputStream(sock1.getInputStream());
        DataOutputStream dos=new DataOutputStream(sock1.getOutputStream());
            
        String s=dis.readLine();
        System.out.println(s);
        dos.writeBytes("server ok\r\n");
        dos.flush();
        }      
         catch (IOException ex) 
        {
             ex.printStackTrace();
        }
        }
        
        }

         public static void main(String[] args) throws Exception 
      {
        server o=new server();
        }

}

