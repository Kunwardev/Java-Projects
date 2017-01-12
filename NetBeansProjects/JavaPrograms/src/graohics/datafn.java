package graohics;

import java.io.*;

public class datafn {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("F:\\andried video tutorials\\Indie.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            int a = 5;
            boolean b = true;
            double d = 12.33;
            dos.writeInt(a);
            dos.writeBoolean(b);
            dos.writeDouble(d);
            FileInputStream fis = new FileInputStream("F:\\andried video tutorials\\Indie.txt");
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readInt());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readDouble());
        } catch (Exception ex) {
        }

    }
}
