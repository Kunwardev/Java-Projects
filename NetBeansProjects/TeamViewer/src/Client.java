
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import javax.imageio.ImageIO;

public class Client {
String message = "Server Open";
    Client() {
        try {
            System.out.println("Connection Build");
            Socket sock = new Socket("127.0.0.1", 9000);

            DataInputStream dis = new DataInputStream(sock.getInputStream());
            DataOutputStream dos = new DataOutputStream(sock.getOutputStream());

            dos.writeBytes("Testing Server\r\n");
            dos.flush();

            String serverMessage = dis.readLine();
            System.out.println("Server Message: " + serverMessage);
            
            if(message == "Server Open")
             {
             Job obj = new Job();
             Thread t1 = new Thread(obj);
             t1.start();
             }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    class Job implements Runnable
    {
        FileInputStream fis;
        FileOutputStream fos;
        public void run()
        {

            try
            {
                byte b[] = new byte[100];
               
                for (int i = 0; i < 10; i++)
                {
                    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                    Rectangle screenRectangle = new Rectangle(screenSize);
                    Robot robot = new Robot();
                    BufferedImage img = robot.createScreenCapture(screenRectangle);
                    ImageIO.write(img, "jpg", new File("F:\\andried video tutorials\\" + i + ".jpg"));
             //           for (int i = 0; i < 10; i++)
            {
                fis = new FileInputStream(new File("F:\\andried video tutorials\\" + i + ".jpg"));
                fos = new FileOutputStream(new File("C:\\One\\" + i + ".jpg"));
                while (true)
                {
                    int r = fis.read(b, 0, 100);
                    if (r == -1)
                    {
                        break;
                    }
                    fos.write(b, 0, r);
                }
            }
                }

            } catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
    }
}
