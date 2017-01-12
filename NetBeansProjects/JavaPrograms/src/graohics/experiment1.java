package graohics;

import java.io.*;

public class experiment1 {

   experiment1() {
        int i = 1;
        long count = 0;
        try {
            byte b[] = new byte[1000];
            File f = new File("F:\\andried video tutorials\\two.jpg");
            FileOutputStream fos = new FileOutputStream("F:\\andried video tutorials\\two.jpg");
            
            while (true) {
                long size = f.length();
                System.out.println(f.length());
                FileInputStream fis = new FileInputStream(new File("F:\\andried video tutorials\\two.jpg." + i));
                int r = fis.read(b, 0, 1000);
                System.out.println(count);
                fos.write(b, 0, r);
                System.out.println(i);
                if(r==-1)
                i++;
                count = count+r;
                if(count>=size)
                {
                    break;
                }
                //System.out.println(i);
            }
        } catch (Exception ex) {
        }

    }
    public static void main(String[] args) {
        experiment1 on = new experiment1();
    }
}
