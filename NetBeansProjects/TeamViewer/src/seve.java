
import java.io.*;
import java.net.*;

public class seve {

    seve() {
        try {
            ServerSocket sersock = new ServerSocket(9000);
            System.out.println("Server started");
            while(true)
            {   
                Socket sock = sersock.accept();
                ClientHandler ch = new ClientHandler(sock);
                Thread t = new Thread(ch);
                t.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    class ClientHandler implements Runnable
    {
        DataInputStream dis;
        DataOutputStream dos;
        ClientHandler(Socket sock)
        {
            try{
            dis = new DataInputStream(sock.getInputStream());
            dos = new DataOutputStream(sock.getOutputStream());
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        }

        public void run() {
            try{
            String clientMessage = dis.readLine();
            System.out.println("Client Message :" + clientMessage);

            dos.writeBytes("Server Open\r\n"); 
        }catch(Exception e){
            e.printStackTrace();
        }}
    }
//    public static void main(String[] args) {
//        seve server = new seve();
//    }
}
