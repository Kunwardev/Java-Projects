package graohics;

import java.io.*;

public class experiment {
experiment() {
        try {
            int i = 0;
            FileInputStream fis = new FileInputStream(new File("F:\\andried video tutorials\\2.jpg"));
            byte b[] = new byte[10000];
            while (true) {
                i++;
                int r = fis.read(b, 0, 1000);
                if (r == -1) {
                    break;
                }

                FileOutputStream fos = new FileOutputStream(new File("F:\\andried video tutorials\\Two.jpg." + i));
                fos.write(b, 0, r);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        experiment e = new experiment();
    }
}
