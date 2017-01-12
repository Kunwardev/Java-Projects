import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.net.*;
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
         
    
    public static void main(String[] args) throws Exception
    {   
     Capture obj=new Capture();   
        
    }
}
