import java.io.*;
import java.net.*;

public class P2PClient 
{
      public static void main(String[] args) throws IOException 
      {
           
        Socket sock=new Socket("192.168.137.74",4000);
          System.out.println("connection accepted");
        
        DataInputStream dis=new DataInputStream(sock.getInputStream());
        DataOutputStream dos=new DataOutputStream(sock.getOutputStream());
       
       
        dos.writeBytes("check server\r\n");
            dos.flush();
        String q=dis.readLine();
        System.out.println(q);
       
}
}