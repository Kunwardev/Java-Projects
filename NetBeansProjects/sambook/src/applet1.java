import java.awt.*;

public class applet1 extends javax.swing.JApplet
{
    int number;
    public void init()
    {
        number = 225;
    }
    public void paint(Graphics Screen)
    {
        Graphics2D Screen2D = (Graphics2D) Screen;
        Screen2D.drawString("The Square root of "+ number + "is "+Math.sqrt(number),5,50);
    }
}