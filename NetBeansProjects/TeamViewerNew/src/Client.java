import java.io.*;
import java.net.*;
public class Client
{
    Socket sock;
    DataInputStream dis;
    DataOutputStream dos;
    
    Client()
    {
        try 
        {
            sock = new Socket("127.0.0.1",8900);
            System.out.println("Client connected to server");
            dis = new DataInputStream(sock.getInputStream());
            dos = new DataOutputStream(sock.getOutputStream());
            
            dos.writeBytes("check server \r\n");
            dos.flush();
            
            String s = dis.readLine();
            System.out.println("Server Message : "+s);
            
            
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public static void main(String args[])
    {
        Client obj = new Client();
    }
}
