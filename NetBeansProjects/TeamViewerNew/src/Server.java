import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import javax.imageio.ImageIO;
public class Server
{
    Socket sock;
    ServerSocket sersock;
    
    Server()
    {
        try
        {
            sersock = new ServerSocket(9000);
            
            System.out.println("Server created");
            while(true)
            {
                sock = sersock.accept();
                System.out.println("connection accepted");
                ClientHandler obj = new ClientHandler(sock);
                Thread t = new Thread(obj);
                t.start();
            }
        }
        catch(Exception ex)
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
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        public void run()
        {
            try
            {
                String s = dis.readLine();
                System.out.println("Client Message : "+s);
                dos.writeBytes("Server OK\r\n");
                dos.flush();
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
            
        }
    }
 public class Capture
{
    ServerSocket sersock;
    Socket sock;
    DataInputStream dis;
    DataOutputStream dos;
    Rectangle rect;
    BufferedImage img;
    
    
    public Capture()
    {
        try
        {
        sersock=new ServerSocket(8900);
        System.out.println("Server Started at port 8900");
        rect=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        Robot ob1=new Robot();
        
        
        while(true)
        {
         sock=sersock.accept();
         dos=new DataOutputStream(sock.getOutputStream());
         dis=new DataInputStream(sock.getInputStream());
         if(dis.readLine().equals("send file"))
         {
         
          dos.writeBytes("sending file\r\n");
          img=ob1.createScreenCapture(rect);
          ImageIO.write(img, "png", dos);
         
             dis.readLine();
         }  
        }
       }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }   
}
    public static void main(String args[])
    
    {
        Server obj = new Server();
    }
    
}
