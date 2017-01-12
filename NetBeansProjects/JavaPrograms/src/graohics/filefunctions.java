package graohics;

import java.io.*;

public class filefunctions {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(new File("F:\\andried video tutorials\\2.jpg"));
            FileOutputStream fos = new FileOutputStream(new File("F:\\two.jpg"));
            byte b[] = new byte[10000];
            while(true)
            {
                int r = fis.read(b,0,10000);
                if(r==-1)
                {
                    break;
                }
                fos.write(b,0,r);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
