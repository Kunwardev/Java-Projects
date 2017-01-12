package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;

public class pics2
{

    public static void main(String[] args)
    {
        try
        {
            FileInputStream fis;
            FileOutputStream fos;
            byte b[] = new byte[100];
            for (int i = 0; i < 10; i++)
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
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
