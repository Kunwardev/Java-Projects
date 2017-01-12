package Test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Pics extends JFrame implements ActionListener
{

    JButton btClick;

    Pics()
    {
        setSize(500, 500);
        setVisible(true);
        setLayout(null);
        btClick = new JButton("Click Photograph");
        btClick.setBounds(20, 50, 150, 30);
        btClick.setBackground(Color.red);
        add(btClick);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        btClick.addActionListener(this);
    }

    public static void main(String[] args)
    {
        Pics obj = new Pics();
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btClick)
        {
            try
            {
                Job obj = new Job();
                Thread t = new Thread(obj);
                t.start();
            } catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }

    class Job implements Runnable
    {

        public void run()
        {

            try
            {
                for (int i = 0; i < 10; i++)
                {
                    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                    Rectangle screenRectangle = new Rectangle(screenSize);
                    Robot robot = new Robot();
                    BufferedImage img = robot.createScreenCapture(screenRectangle);
                    ImageIO.write(img, "jpg", new File("F:\\andried video tutorials\\" + i + ".jpg"));
                }

            } catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }

    }
}
