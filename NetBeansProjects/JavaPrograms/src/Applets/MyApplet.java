
package Applets;
/*
<applet code = "MyApplet" width = 300 height = 300>
</applet>
*/
import java.awt.*;
import java.applet.*;

public class MyApplet extends Applet
{
    String  name = "Kunwar";
    public void init()
    {
        setBackground(Color.red);
        repaint();
        System.out.println("Applt initialized");
    }
    public void start()
    {
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
        repaint();
        System.out.println("Started");
    }
    public void stop()
    {
        System.out.println("Stoppd");
    }
    public void paint(Graphics g)
    {
        g.drawString("Hello World", 50, 50);
        g.drawString(name, 100, 100);
        System.out.println("PAinted");
    }
    public void destroy()
    {
        System.out.println("Destroyed");
    }
}
